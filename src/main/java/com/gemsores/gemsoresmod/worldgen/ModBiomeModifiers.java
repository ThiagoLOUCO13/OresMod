package com.gemsores.gemsoresmod.worldgen;

import com.gemsores.gemsoresmod.GemsoresMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_RUBY_ORE = registerKey("add_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_ORE = registerKey("add_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_TOPAZ_ORE = registerKey("add_topaz_ore");
    public static final ResourceKey<BiomeModifier> ADD_LUSH_TOPAZ_ORE = registerKey("add_lush_topaz_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_TOPAZ_ORE = registerKey("add_nether_topaz_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_COAL_ORE = registerKey("add_nether_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_COPPER_ORE = registerKey("add_nether_copper_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_IRON_ORE = registerKey("add_nether_iron_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_LAPIS_ORE = registerKey("add_nether_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_REDSTONE_ORE = registerKey("add_nether_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_DIAMOND_ORE = registerKey("add_nether_diamond_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_CHAROITE_ORE = registerKey("add_nether_charoite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_CHAROITE_ORE = registerKey("add_end_charoite_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        // CF -> PF -> BM
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RUBY_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES)
        );
        context.register(ADD_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES)
        );
        context.register(ADD_NETHER_TOPAZ_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_TOPAZ_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES)
        );
        context.register(ADD_NETHER_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES)
        );
        context.register(ADD_NETHER_COPPER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_COPPER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES)
        );
        context.register(ADD_NETHER_IRON_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_IRON_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES)
        );
        context.register(ADD_NETHER_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES)
        );
        context.register(ADD_NETHER_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES)
        );
        context.register(ADD_NETHER_DIAMOND_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_DIAMOND_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES)
        );
        context.register(ADD_NETHER_CHAROITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_CHAROITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES)
        );
        context.register(ADD_END_CHAROITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_CHAROITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES)
        );

        //spawn em certos biomas!
        context.register(ADD_TOPAZ_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.STONY_PEAKS), biomes.getOrThrow(Biomes.FROZEN_PEAKS), biomes.getOrThrow(Biomes.JAGGED_PEAKS), biomes.getOrThrow(Biomes.LUSH_CAVES)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TOPAZ_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_LUSH_TOPAZ_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.LUSH_CAVES)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TOPAZ_ORE_LUSH_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, name));
    }
}
