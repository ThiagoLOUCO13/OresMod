package com.gemsores.gemsoresmod.event;

import com.gemsores.gemsoresmod.GemsoresMod;
import com.gemsores.gemsoresmod.item.ModItems;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@EventBusSubscriber(modid = GemsoresMod.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.TOOLSMITH || event.getType() == VillagerProfession.ARMORER || event.getType() == VillagerProfession.WEAPONSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 1),
                    new ItemStack(ModItems.TOPAZ.get(), 1), 6, 3, 0.05f));

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.TOPAZ, 1),
                    new ItemStack(Items.EMERALD, 1), 6, 3, 0.05f));

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 2),
                    new ItemStack(ModItems.RUBY.get(), 1), 4, 3, 0.05f));

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.SAPPHIRE, 1),
                    new ItemStack(ModItems.RUBY.get(), 2), 6, 3, 0.05f));

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.SAPPHIRE, 1),
                    new ItemStack(Items.EMERALD, 3), 6, 3, 0.05f));

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.SAPPHIRE, 1),
                    new ItemStack(ModItems.TOPAZ.get(), 3), 3, 3, 0.05f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(ModItems.SAPPHIRE.get(), 1), 4, 3, 0.05f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.TOPAZ, 2),
                    new ItemStack(ModItems.RUBY.get(), 1), 4, 3, 0.05f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.RUBY, 1),
                    new ItemStack(Items.EMERALD, 2), 4, 3, 0.05f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.RUBY, 1),
                    new ItemStack(ModItems.TOPAZ.get(), 2), 4, 3, 0.05f));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.TOPAZ, 3),
                    new ItemStack(ModItems.SAPPHIRE.get(), 1), 4, 3, 0.05f));

            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(ModItems.RUBY, 2),
                    new ItemStack(ModItems.SAPPHIRE.get(), 1), 3, 3, 0.05f));
        }
    }

    @SubscribeEvent
    public static void addCustomTradesGame(VillagerTradesEvent event) {

        for (int level = 1; level <= 5; level++) {
            // Criamos uma constante local para a lambda não reclamar
            final int currentLevel = level;

            List<VillagerTrades.ItemListing> originalTrades = event.getTrades().get(level);
            List<VillagerTrades.ItemListing> customCurrencyTrades = new ArrayList<>();

            for (VillagerTrades.ItemListing trade : originalTrades) {
                customCurrencyTrades.add((entity, random) -> {
                    MerchantOffer offer = trade.getOffer(entity, random);
                    if (offer == null) return null;

                    // Agora usamos currentLevel (que é effectively final)
                    Item chosenGem = switch (currentLevel) {
                        case 1, 2 -> ModItems.TOPAZ.get();
                        case 3, 4 -> ModItems.RUBY.get();
                        default -> ModItems.SAPPHIRE.get();
                    };

                    ItemStack costA = offer.getBaseCostA();
                    Optional<ItemStack> costB = Optional.of(offer.getCostB()).filter(s -> !s.isEmpty());
                    ItemStack result = offer.getResult();

                    // Substituição de Esmeralda
                    ItemCost newCostA = costA.is(Items.EMERALD)
                            ? new ItemCost(chosenGem, costA.getCount())
                            : new ItemCost(costA.getItem(), costA.getCount());

                    Optional<ItemCost> newCostB = costB.map(stack ->
                            stack.is(Items.EMERALD)
                                    ? new ItemCost(chosenGem, stack.getCount())
                                    : new ItemCost(stack.getItem(), stack.getCount())
                    );
                    return new MerchantOffer(
                            newCostA,
                            newCostB,
                            result,
                            offer.getUses(),
                            offer.getMaxUses(),
                            offer.getXp(),
                            offer.getPriceMultiplier(),
                            offer.getDemand()
                    );
                });
            }
            originalTrades.addAll(customCurrencyTrades);
        }
    }

    /*@SubscribeEvent
    public static void addWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 16),
                new ItemStack(ModItems.KAUPEN_SMITHING_TEMPLATE.get(), 1), 1, 10, 0.2f));

        rareTrades.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.NETHERITE_INGOT, 1),
                new ItemStack(ModItems.BAR_BRAWL_MUSIC_DISC.get(), 1), 1, 10, 0.2f));
    }*/
}
