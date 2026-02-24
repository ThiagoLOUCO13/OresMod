package com.gemsores.gemsoresmod.datagen;

import com.gemsores.gemsoresmod.GemsoresMod;
import com.gemsores.gemsoresmod.item.ModItems;
import com.gemsores.gemsoresmod.loot.AddItemModifier;
import com.gemsores.gemsoresmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture, GemsoresMod.MOD_ID);
    }
    private void addArmorRubyToChest(String name, String chestPath, float chance) {
        add(name, new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/" + chestPath)).build(),
                LootItemRandomChanceCondition.randomChance(chance).build()
        }, new ItemStack(ModItems.RUBY_HORSE_ARMOR.get())));
    }
    private void addArmorTopazToChest(String name, String chestPath, float chance) {
        add(name, new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/" + chestPath)).build(),
                LootItemRandomChanceCondition.randomChance(chance).build()
        }, new ItemStack(ModItems.TOPAZ_HORSE_ARMOR.get())));
    }
    private void addArmorSapphireToChest(String name, String chestPath, float chance) {
        add(name, new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/" + chestPath)).build(),
                LootItemRandomChanceCondition.randomChance(chance).build()
        }, new ItemStack(ModItems.SAPPHIRE_HORSE_ARMOR.get())));
    }
    private void addArmorCharoiteToChest(String name, String chestPath, float chance) {
        add(name, new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/" + chestPath)).build(),
                LootItemRandomChanceCondition.randomChance(chance).build()
        }, new ItemStack(ModItems.CHAROITE_HORSE_ARMOR.get())));
    }
    private void addArmorEnderiteToChest(String name, String chestPath, float chance) {
        add(name, new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/" + chestPath)).build(),
                LootItemRandomChanceCondition.randomChance(chance).build()
        }, new ItemStack(ModItems.ENDERITE_HORSE_ARMOR.get())));
    }
    private void addArmorPrismToChest(String name, String chestPath, float chance) {
        add(name, new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/" + chestPath)).build(),
                LootItemRandomChanceCondition.randomChance(chance).build()
        }, new ItemStack(ModItems.PRISM_HORSE_ARMOR.get())));
    }
    private void addGemsToVillages(String name, String chestPath, float chance, DeferredItem<Item> item) {
        add(name, new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/" + chestPath)).build(),
                LootItemRandomChanceCondition.randomChance(chance).build()
        }, new ItemStack(item.get())));
    }

    @Override
    protected void start() {
        add("templete_charoite_in_nether_bridge", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/nether_bridge")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build() // 25% de chance
        }, new ItemStack(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE.get())));
        add("templete_enderite_in_nether_bridge", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/end_city_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build() // 15% de chance
        }, new ItemStack(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get())));
        add("topaz_from_bartering", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("gameplay/piglin_bartering")).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build() // 5% de chance
        }, new ItemStack(ModItems.TOPAZ.get())));
        add("charoite_from_bartering", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("gameplay/piglin_bartering")).build(),
                LootItemRandomChanceCondition.randomChance(0.01f).build() // 1% de chance
        }, new ItemStack(ModItems.CHAROITE.get())));

        addArmorRubyToChest("ruby_armor_ruined", "ruined_portal", 0.073f);
        addArmorRubyToChest("ruby_armor_dungeon", "simple_dungeon", 0.133f);
        addArmorRubyToChest("ruby_armor_jungle", "jungle_temple", 0.044f);
        addArmorRubyToChest("ruby_armor_desert", "desert_pyramid", 0.116f);

        addArmorSapphireToChest("sapphire_armor_ruined", "ruined_portal", 0.073f);
        addArmorSapphireToChest("sapphire_armor_dungeon", "simple_dungeon", 0.133f);
        addArmorSapphireToChest("sapphire_armor_jungle", "jungle_temple", 0.044f);
        addArmorSapphireToChest("sapphire_armor_desert", "desert_pyramid", 0.116f);

        addArmorTopazToChest("topaz_armor_bridge", "nether_bridge", 0.274f);
        addArmorTopazToChest("topaz_armor_ruined", "ruined_portal", 0.073f);
        addArmorTopazToChest("topaz_armor_dungeon", "simple_dungeon", 0.133f);
        addArmorTopazToChest("topaz_armor_jungle", "jungle_temple", 0.044f);
        addArmorTopazToChest("topaz_armor_desert", "desert_pyramid", 0.116f);

        addArmorCharoiteToChest("charoite_armor_bridge", "nether_bridge", 0.116f);
        addArmorCharoiteToChest("charoite_armor_end", "end_city_treasure", 0.25f);

        addArmorEnderiteToChest("enderite_armor_end", "end_city_treasure", 0.10f);

        addArmorPrismToChest("prism_armor_end", "end_city_treasure", 0.01f);

        //Villarges
        addGemsToVillages("topaz_in_desert_house", "village/village_desert_house", 0.143f, ModItems.TOPAZ);
        addGemsToVillages("topaz_in_taiga_house", "village/village_taiga_house", 0.186f, ModItems.TOPAZ);
        addGemsToVillages("topaz_in_plains_house", "village/village_plains_house", 0.228f, ModItems.TOPAZ);
        addGemsToVillages("topaz_in_savanna_house", "village/village_savanna_house", 0.215f, ModItems.TOPAZ);
        addGemsToVillages("topaz_in_tannery", "village/village_tannery", 0.173f, ModItems.TOPAZ);
        addGemsToVillages("topaz_in_tample", "village/village_temple", 0.254f, ModItems.TOPAZ);
        addGemsToVillages("topaz_in_butcher", "village/village_butcher", 0.102f, ModItems.TOPAZ);
        addGemsToVillages("topaz_in_mason", "village/village_mason", 0.208f, ModItems.TOPAZ);
        addGemsToVillages("topaz_in_snowy_house", "village/village_snowy_house", 0.099f, ModItems.TOPAZ);
        addGemsToVillages("topaz_in_armorer", "village/village_armorer", 0.318f, ModItems.TOPAZ);
        addGemsToVillages("topaz_in_fisher", "village/village_fisher", 0.241f, ModItems.TOPAZ);

        addGemsToVillages("ruby_in_desert_house", "village/village_desert_house", 0.1f, ModItems.RUBY);
        addGemsToVillages("ruby_in_taiga_house", "village/village_taiga_house", 0.12f, ModItems.RUBY);
        addGemsToVillages("ruby_in_plains_house", "village/village_plains_house", 0.15f, ModItems.RUBY);
        addGemsToVillages("ruby_in_savanna_house", "village/village_savanna_house", 0.145f, ModItems.RUBY);
        addGemsToVillages("ruby_in_tannery", "village/village_tannery", 0.121f, ModItems.RUBY);
        addGemsToVillages("ruby_in_tample", "village/village_temple", 0.15f, ModItems.RUBY);
        addGemsToVillages("ruby_in_butcher", "village/village_butcher", 0.055f, ModItems.RUBY);
        addGemsToVillages("ruby_in_mason", "village/village_mason", 0.108f, ModItems.RUBY);
        addGemsToVillages("ruby_in_snowy_house", "village/village_snowy_house", 0.048f, ModItems.RUBY);
        addGemsToVillages("ruby_in_armorer", "village/village_armorer", 0.224f, ModItems.RUBY);
        addGemsToVillages("ruby_in_fisher", "village/village_fisher", 0.148f, ModItems.RUBY);

        addGemsToVillages("sapphire_in_desert_house", "village/village_desert_house", 0.03f, ModItems.SAPPHIRE);
        addGemsToVillages("sapphire_in_taiga_house", "village/village_taiga_house", 0.06f, ModItems.SAPPHIRE);
        addGemsToVillages("sapphire_in_plains_house", "village/village_plains_house", 0.08f, ModItems.SAPPHIRE);
        addGemsToVillages("sapphire_in_savanna_house", "village/village_savanna_house", 0.084f, ModItems.SAPPHIRE);
        addGemsToVillages("sapphire_in_tannery", "village/village_tannery", 0.06f, ModItems.SAPPHIRE);
        addGemsToVillages("sapphire_in_tample", "village/village_temple", 0.04f, ModItems.SAPPHIRE);
        addGemsToVillages("sapphire_in_butcher", "village/village_butcher", 0.011f, ModItems.SAPPHIRE);
        addGemsToVillages("sapphire_in_mason", "village/village_mason", 0.052f, ModItems.SAPPHIRE);
        addGemsToVillages("sapphire_in_snowy_house", "village/village_snowy_house", 0.01f, ModItems.SAPPHIRE);
        addGemsToVillages("sapphire_in_armorer", "village/village_armorer", 0.156f, ModItems.SAPPHIRE);
        addGemsToVillages("sapphire_in_fisher", "village/village_fisher", 0.063f, ModItems.SAPPHIRE);

    }
}
