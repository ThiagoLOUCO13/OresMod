package com.gemsores.gemsoresmod.datagen;

import com.gemsores.gemsoresmod.block.ModBlock;
import com.gemsores.gemsoresmod.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlock.RUBY_BLOCK.get());
        dropSelf(ModBlock.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlock.TOPAZ_BLOCK.get());
        dropSelf(ModBlock.AQUAMARINE_BLOCK.get());
        dropSelf(ModBlock.CHAROITE_BLOCK.get());
        dropSelf(ModBlock.ENDERITE_BLOCK.get());
        dropSelf(ModBlock.PRISM_BLOCK.get());

        add(ModBlock.RUBY_ORE.get(),
                block -> createOreDrop(ModBlock.RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlock.DEEPSLATE_RUBY_ORE.get(),
                block -> createOreDrop(ModBlock.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlock.SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlock.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        add(ModBlock.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlock.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        add(ModBlock.TOPAZ_ORE.get(),
                block -> createOreDrop(ModBlock.TOPAZ_ORE.get(), ModItems.TOPAZ.get()));
        add(ModBlock.DEEPSLATE_TOPAZ_ORE.get(),
                block -> createOreDrop(ModBlock.DEEPSLATE_TOPAZ_ORE.get(), ModItems.TOPAZ.get()));
        add(ModBlock.AQUAMARINE_ORE.get(),
                block -> createOreDrop(ModBlock.AQUAMARINE_ORE.get(), ModItems.AQUAMARINE.get()));
        add(ModBlock.DEEPSLATE_AQUAMARINE_ORE.get(),
                block -> createOreDrop(ModBlock.DEEPSLATE_AQUAMARINE_ORE.get(), ModItems.AQUAMARINE.get()));

        add(ModBlock.NETHER_TOPAZ_ORE.get(),
                block -> createMultipleOreDrops(ModBlock.NETHER_TOPAZ_ORE.get(), ModItems.TOPAZ_NUGGET.get(), 3, 6));
        add(ModBlock.NETHER_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlock.NETHER_IRON_ORE.get(), Items.IRON_NUGGET.asItem(), 3, 6));
        add(ModBlock.NETHER_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlock.NETHER_COAL_ORE.get(), ModItems.COAL_NUGGET.get(), 3, 6));
        add(ModBlock.NETHER_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlock.NETHER_REDSTONE_ORE.get(), Items.REDSTONE.asItem(), 3, 6));
        add(ModBlock.NETHER_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(ModBlock.NETHER_LAPIS_ORE.get(), ModItems.LAPIS_NUGGET.get(), 3, 6));
        add(ModBlock.NETHER_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlock.NETHER_DIAMOND_ORE.get(), ModItems.DIAMOND_NUGGET.get(), 3, 6));
        add(ModBlock.NETHER_COPPER_ORE.get(),
                block -> createMultipleOreDrops(ModBlock.NETHER_COPPER_ORE.get(), ModItems.COPPER_NUGGET.get(), 3, 6));

        add(ModBlock.NETHER_CHAROITE_ORE.get(),
                block -> createOreDrop(ModBlock.NETHER_CHAROITE_ORE.get(), ModItems.CHAROITE.get()));
        add(ModBlock.END_CHAROITE_ORE.get(),
                block -> createOreDrop(ModBlock.END_CHAROITE_ORE.get(), ModItems.CHAROITE.get()));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlock.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
