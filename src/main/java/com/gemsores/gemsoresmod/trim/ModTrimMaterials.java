package com.gemsores.gemsoresmod.trim;

import com.gemsores.gemsoresmod.GemsoresMod;
import com.gemsores.gemsoresmod.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> RUBY =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "ruby"));
    public static final ResourceKey<TrimMaterial> SAPPHIRE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "sapphire"));
    public static final ResourceKey<TrimMaterial> TOPAZ =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "topaz"));
    public static final ResourceKey<TrimMaterial> CHAROITE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "charoite"));
    public static final ResourceKey<TrimMaterial> ENDERITE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite"));
    public static final ResourceKey<TrimMaterial> PRISM =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "prism"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, RUBY, ModItems.RUBY.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 0.4F);
        register(context, SAPPHIRE, ModItems.SAPPHIRE.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 0.9F);
        register(context, TOPAZ, ModItems.TOPAZ.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 0.5F);
        register(context, CHAROITE, ModItems.CHAROITE.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 1.0F);
        register(context, ENDERITE, ModItems.ENDERITE.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 1.0F);
        register(context, PRISM, ModItems.PRISM.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 0.8F);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimmaterial);
    }
}