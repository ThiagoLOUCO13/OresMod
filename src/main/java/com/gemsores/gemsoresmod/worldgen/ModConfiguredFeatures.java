package com.gemsores.gemsoresmod.worldgen;

import com.gemsores.gemsoresmod.GemsoresMod;
import com.gemsores.gemsoresmod.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TOPAZ_ORE_KEY = registerKey("nether_topaz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COAL_ORE_KEY = registerKey("nether_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COPPER_ORE_KEY = registerKey("nether_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IRON_ORE_KEY = registerKey("nether_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LAPIS_ORE_KEY = registerKey("nether_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_ORE_KEY = registerKey("nether_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_DIAMOND_ORE_KEY = registerKey("nether_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CHAROITE_ORE_KEY = registerKey("nether_charoite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_CHAROITE_ORE_KEY = registerKey("end_charoite_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldRubyOres= List.of(
                OreConfiguration.target(stoneReplaceables, ModBlock.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlock.DEEPSLATE_RUBY_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworldSapphireOres= List.of(
                OreConfiguration.target(stoneReplaceables, ModBlock.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlock.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworldTopazOres= List.of(
                OreConfiguration.target(stoneReplaceables, ModBlock.TOPAZ_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlock.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState())
        );

        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 8));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 6));
        register(context, OVERWORLD_TOPAZ_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTopazOres, 4));

        register(context, NETHER_TOPAZ_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlock.NETHER_TOPAZ_ORE.get().defaultBlockState(), 8));
        register(context, NETHER_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlock.NETHER_COAL_ORE.get().defaultBlockState(), 12));
        register(context, NETHER_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlock.NETHER_COPPER_ORE.get().defaultBlockState(), 12));
        register(context, NETHER_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlock.NETHER_IRON_ORE.get().defaultBlockState(), 8));
        register(context, NETHER_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlock.NETHER_LAPIS_ORE.get().defaultBlockState(), 9));
        register(context, NETHER_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlock.NETHER_REDSTONE_ORE.get().defaultBlockState(), 6));
        register(context, NETHER_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlock.NETHER_DIAMOND_ORE.get().defaultBlockState(), 4));
        register(context, NETHER_CHAROITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlock.NETHER_CHAROITE_ORE.get().defaultBlockState(), 4));
        register(context, END_CHAROITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlock.END_CHAROITE_ORE.get().defaultBlockState(), 9));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
