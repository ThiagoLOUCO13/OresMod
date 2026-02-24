package com.gemsores.gemsoresmod.datagen;

import com.gemsores.gemsoresmod.GemsoresMod;
import com.gemsores.gemsoresmod.block.ModBlock;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GemsoresMod.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlock.RUBY_BLOCK);
        blockWithItem(ModBlock.SAPPHIRE_BLOCK);
        blockWithItem(ModBlock.TOPAZ_BLOCK);
        blockWithItem(ModBlock.CHAROITE_BLOCK);
        blockWithItem(ModBlock.ENDERITE_BLOCK);
        blockWithItem(ModBlock.PRISM_BLOCK);

        blockWithItem(ModBlock.RUBY_ORE);
        blockWithItem(ModBlock.SAPPHIRE_ORE);
        blockWithItem(ModBlock.TOPAZ_ORE);
        blockWithItem(ModBlock.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlock.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlock.DEEPSLATE_TOPAZ_ORE);

        blockWithItem(ModBlock.NETHER_TOPAZ_ORE);
        blockWithItem(ModBlock.NETHER_COAL_ORE);
        blockWithItem(ModBlock.NETHER_IRON_ORE);
        blockWithItem(ModBlock.NETHER_LAPIS_ORE);
        blockWithItem(ModBlock.NETHER_DIAMOND_ORE);
        blockWithItem(ModBlock.NETHER_REDSTONE_ORE);
        blockWithItem(ModBlock.NETHER_COPPER_ORE);

        blockWithItem(ModBlock.NETHER_CHAROITE_ORE);
        blockWithItem(ModBlock.END_CHAROITE_ORE);


    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
