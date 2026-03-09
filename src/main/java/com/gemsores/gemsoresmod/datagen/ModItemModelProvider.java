package com.gemsores.gemsoresmod.datagen;

import com.gemsores.gemsoresmod.GemsoresMod;
import com.gemsores.gemsoresmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GemsoresMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //items
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.SAPPHIRE.get());
        basicItem(ModItems.TOPAZ.get());
        basicItem(ModItems.AQUAMARINE.get());
        basicItem(ModItems.CHAROITE.get());
        basicItem(ModItems.ENDERITE.get());
        basicItem(ModItems.PRISM.get());
        basicItem(ModItems.TOPAZ_NUGGET.get());
        basicItem(ModItems.DIAMOND_NUGGET.get());
        basicItem(ModItems.COAL_NUGGET.get());
        basicItem(ModItems.LAPIS_NUGGET.get());
        basicItem(ModItems.COPPER_NUGGET.get());
        basicItem(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE.get());
        basicItem(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get());
        basicItem(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE.get());

        //tools
        handheldItem(ModItems.RUBY_SWORD);
        handheldItem(ModItems.RUBY_PICKAXE);
        handheldItem(ModItems.RUBY_SHOVEL);
        handheldItem(ModItems.RUBY_AXE);
        handheldItem(ModItems.RUBY_HOE);

        handheldItem(ModItems.TOPAZ_SWORD);
        handheldItem(ModItems.TOPAZ_PICKAXE);
        handheldItem(ModItems.TOPAZ_SHOVEL);
        handheldItem(ModItems.TOPAZ_AXE);
        handheldItem(ModItems.TOPAZ_HOE);

        handheldItem(ModItems.EMERALD_SWORD);
        handheldItem(ModItems.EMERALD_PICKAXE);
        handheldItem(ModItems.EMERALD_SHOVEL);
        handheldItem(ModItems.EMERALD_AXE);
        handheldItem(ModItems.EMERALD_HOE);

        handheldItem(ModItems.SAPPHIRE_SWORD);
        handheldItem(ModItems.SAPPHIRE_PICKAXE);
        handheldItem(ModItems.SAPPHIRE_SHOVEL);
        handheldItem(ModItems.SAPPHIRE_AXE);
        handheldItem(ModItems.SAPPHIRE_HOE);

        handheldItem(ModItems.CHAROITE_SWORD);
        handheldItem(ModItems.CHAROITE_PICKAXE);
        handheldItem(ModItems.CHAROITE_SHOVEL);
        handheldItem(ModItems.CHAROITE_AXE);
        handheldItem(ModItems.CHAROITE_HOE);

        handheldItem(ModItems.ENDERITE_SWORD);
        handheldItem(ModItems.ENDERITE_PICKAXE);
        handheldItem(ModItems.ENDERITE_SHOVEL);
        handheldItem(ModItems.ENDERITE_AXE);
        handheldItem(ModItems.ENDERITE_HOE);

        handheldItem(ModItems.PRISM_SWORD);
        handheldItem(ModItems.PRISM_PICKAXE);
        handheldItem(ModItems.PRISM_SHOVEL);
        handheldItem(ModItems.PRISM_AXE);
        handheldItem(ModItems.PRISM_HOE);

        //armor
        trimmedArmorItem(ModItems.RUBY_HELMET);
        trimmedArmorItem(ModItems.RUBY_CHESTPLATE);
        trimmedArmorItem(ModItems.RUBY_LEGGINGS);
        trimmedArmorItem(ModItems.RUBY_BOOTS);

        trimmedArmorItem(ModItems.TOPAZ_HELMET);
        trimmedArmorItem(ModItems.TOPAZ_CHESTPLATE);
        trimmedArmorItem(ModItems.TOPAZ_LEGGINGS);
        trimmedArmorItem(ModItems.TOPAZ_BOOTS);

        trimmedArmorItem(ModItems.EMERALD_HELMET);
        trimmedArmorItem(ModItems.EMERALD_CHESTPLATE);
        trimmedArmorItem(ModItems.EMERALD_LEGGINGS);
        trimmedArmorItem(ModItems.EMERALD_BOOTS);

        trimmedArmorItem(ModItems.SAPPHIRE_HELMET);
        trimmedArmorItem(ModItems.SAPPHIRE_CHESTPLATE);
        trimmedArmorItem(ModItems.SAPPHIRE_LEGGINGS);
        trimmedArmorItem(ModItems.SAPPHIRE_BOOTS);

        trimmedArmorItem(ModItems.CHAROITE_HELMET);
        trimmedArmorItem(ModItems.CHAROITE_CHESTPLATE);
        trimmedArmorItem(ModItems.CHAROITE_LEGGINGS);
        trimmedArmorItem(ModItems.CHAROITE_BOOTS);

        trimmedArmorItem(ModItems.ENDERITE_HELMET);
        trimmedArmorItem(ModItems.ENDERITE_CHESTPLATE);
        trimmedArmorItem(ModItems.ENDERITE_LEGGINGS);
        trimmedArmorItem(ModItems.ENDERITE_BOOTS);

        trimmedArmorItem(ModItems.PRISM_HELMET);
        trimmedArmorItem(ModItems.PRISM_CHESTPLATE);
        trimmedArmorItem(ModItems.PRISM_LEGGINGS);
        trimmedArmorItem(ModItems.PRISM_BOOTS);

        //horse armor
        basicItem(ModItems.RUBY_HORSE_ARMOR.get());
        basicItem(ModItems.TOPAZ_HORSE_ARMOR.get());
        basicItem(ModItems.EMERALD_HORSE_ARMOR.get());
        basicItem(ModItems.SAPPHIRE_HORSE_ARMOR.get());
        basicItem(ModItems.CHAROITE_HORSE_ARMOR.get());
        basicItem(ModItems.ENDERITE_HORSE_ARMOR.get());
        basicItem(ModItems.PRISM_HORSE_ARMOR.get());
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = GemsoresMod.MOD_ID;

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                // FIX 1: Use o ID real do item, não o .toString()
                String armorItemPath = itemDeferredItem.getId().getPath(); // ex: "ruby_helmet"

                // FIX 2: Garanta que o trim aponte para o namespace do Minecraft
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                ResourceLocation trimResLoc = ResourceLocation.withDefaultNamespace(trimPath);

                // FIX 3: Construa o caminho do modelo de trim corretamente
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";

                // Avisa o helper sobre a textura do trim
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Gera o modelo do item COM o trim aplicado (o arquivo que o override vai chamar)
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", ResourceLocation.fromNamespaceAndPath(MOD_ID, "item/" + armorItemPath))
                        .texture("layer1", trimResLoc);

                // Configura o modelo base (sem trim) para ter os overrides (predicates)
                this.withExistingParent(armorItemPath, mcLoc("item/generated"))
                        .override()
                        // Aqui apontamos para o modelo que criamos acima
                        .model(new ModelFile.UncheckedModelFile(MOD_ID + ":item/" + currentTrimName))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0", ResourceLocation.fromNamespaceAndPath(MOD_ID, "item/" + armorItemPath));
            });
        }
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
