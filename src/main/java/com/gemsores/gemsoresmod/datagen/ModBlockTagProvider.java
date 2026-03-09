package com.gemsores.gemsoresmod.datagen;

import com.gemsores.gemsoresmod.GemsoresMod;
import com.gemsores.gemsoresmod.block.ModBlock;
import com.gemsores.gemsoresmod.util.ModTags;
import net.minecraft.core.HolderLookup;

import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GemsoresMod.MOD_ID, existingFileHelper);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlock.RUBY_BLOCK.get())
                .add(ModBlock.SAPPHIRE_BLOCK.get())
                .add(ModBlock.TOPAZ_BLOCK.get())
                .add(ModBlock.AQUAMARINE_BLOCK.get())
                .add(ModBlock.RUBY_ORE.get())
                .add(ModBlock.CHAROITE_BLOCK.get())
                .add(ModBlock.SAPPHIRE_ORE.get())
                .add(ModBlock.TOPAZ_ORE.get())
                .add(ModBlock.AQUAMARINE_ORE.get())
                .add(ModBlock.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlock.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlock.DEEPSLATE_TOPAZ_ORE.get())
                .add(ModBlock.DEEPSLATE_AQUAMARINE_ORE.get())
                .add(ModBlock.NETHER_TOPAZ_ORE.get())
                .add(ModBlock.NETHER_DIAMOND_ORE.get())
                .add(ModBlock.NETHER_REDSTONE_ORE.get())
                .add(ModBlock.NETHER_IRON_ORE.get())
                .add(ModBlock.NETHER_COAL_ORE.get())
                .add(ModBlock.NETHER_LAPIS_ORE.get())
                .add(ModBlock.NETHER_COPPER_ORE.get())
                .add(ModBlock.NETHER_CHAROITE_ORE.get())
                .add(ModBlock.END_CHAROITE_ORE.get())
                .add(ModBlock.PRISM_BLOCK.get())
                .add(ModBlock.ENDERITE_BLOCK.get());


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlock.RUBY_BLOCK.get())
                .add(ModBlock.SAPPHIRE_BLOCK.get())
                .add(ModBlock.TOPAZ_BLOCK.get())
                .add(ModBlock.RUBY_ORE.get())
                .add(ModBlock.SAPPHIRE_ORE.get())
                .add(ModBlock.TOPAZ_ORE.get())
                .add(ModBlock.AQUAMARINE_ORE.get())
                .add(ModBlock.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlock.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlock.DEEPSLATE_TOPAZ_ORE.get())
                .add(ModBlock.DEEPSLATE_AQUAMARINE_ORE.get())
                .add(ModBlock.NETHER_TOPAZ_ORE.get())
                .add(ModBlock.NETHER_DIAMOND_ORE.get())
                .add(ModBlock.NETHER_REDSTONE_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlock.NETHER_IRON_ORE.get())
                .add(ModBlock.NETHER_COAL_ORE.get())
                .add(ModBlock.NETHER_LAPIS_ORE.get())
                .add(ModBlock.NETHER_COPPER_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlock.NETHER_CHAROITE_ORE.get())
                .add(ModBlock.END_CHAROITE_ORE.get())
                .add(ModBlock.PRISM_BLOCK.get())
                .add(ModBlock.CHAROITE_BLOCK.get())
                .add(ModBlock.ENDERITE_BLOCK.get());

        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlock.RUBY_BLOCK.get())
                .add(ModBlock.SAPPHIRE_BLOCK.get())
                .add(ModBlock.TOPAZ_BLOCK.get())
                .add(ModBlock.AQUAMARINE_BLOCK.get())
                .add(ModBlock.CHAROITE_BLOCK.get())
                .add(ModBlock.PRISM_BLOCK.get())
                .add(ModBlock.ENDERITE_BLOCK.get());



        tag(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_RUBY_TOOL);


        tag(ModTags.Blocks.NEEDS_TOPAZ_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_TOPAZ_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_TOPAZ_TOOL);


        tag(ModTags.Blocks.NEEDS_EMERALD_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_EMERALD_TOOL);


        tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL);


        tag(ModTags.Blocks.NEEDS_CHAROITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_CHAROITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_CHAROITE_TOOL);


        tag(ModTags.Blocks.NEEDS_ENDERITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_ENDERITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_ENDERITE_TOOL);



        tag(ModTags.Blocks.NEEDS_PRISM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_PRISM_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_PRISM_TOOL);

    }
}
