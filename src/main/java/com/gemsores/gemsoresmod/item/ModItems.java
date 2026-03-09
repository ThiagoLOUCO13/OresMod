package com.gemsores.gemsoresmod.item;

import com.gemsores.gemsoresmod.GemsoresMod;
import com.gemsores.gemsoresmod.block.ModBlock;
import com.gemsores.gemsoresmod.loot.AddItemModifier;
import com.mojang.serialization.MapCodec;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;

import static com.gemsores.gemsoresmod.block.ModBlock.ENDERITE_BLOCK;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GemsoresMod.MOD_ID);


    //items
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAROITE = ITEMS.register("charoite",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> PRISM = ITEMS.register("prism",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> TOPAZ_NUGGET = ITEMS.register("topaz_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COAL_NUGGET = ITEMS.register("coal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAPIS_NUGGET = ITEMS.register("lapis_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));

    //tools
    public static final DeferredItem<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.RUBY, 3.5f, -2.4F))));
    public static final DeferredItem<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.RUBY, 1.5F, -2.8f))));
    public static final DeferredItem<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.RUBY, 2F, -3.0f))));
    public static final DeferredItem<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.RUBY, 6F, -3f))));
    public static final DeferredItem<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.RUBY, -2F, 0f))));

    public static final DeferredItem<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword",
            () -> new SwordItem(ModToolTiers.TOPAZ, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.TOPAZ, 4, -2.4F))));
    public static final DeferredItem<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TOPAZ, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.TOPAZ, 2F, -2.8f))));
    public static final DeferredItem<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel",
            () -> new ShovelItem(ModToolTiers.TOPAZ, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.TOPAZ, 2.5F, -3.0f))));
    public static final DeferredItem<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe",
            () -> new AxeItem(ModToolTiers.TOPAZ, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.TOPAZ, 6.5F, -3f))));
    public static final DeferredItem<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe",
            () -> new HoeItem(ModToolTiers.TOPAZ, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.TOPAZ, -1.5F, 0f))));

    public static final DeferredItem<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.EMERALD, 4, -2.4F))));
    public static final DeferredItem<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.EMERALD, 2F, -2.8f))));
    public static final DeferredItem<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.EMERALD, 2.5F, -3.0f))));
    public static final DeferredItem<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.EMERALD, 6.5F, -3f))));
    public static final DeferredItem<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.EMERALD, -1.5F, 0f))));

    public static final DeferredItem<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SAPPHIRE, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SAPPHIRE, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SAPPHIRE, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SAPPHIRE, 5F, -3f))));
    public static final DeferredItem<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SAPPHIRE, -3F, 0f))));

    public static final DeferredItem<SwordItem> CHAROITE_SWORD = ITEMS.register("charoite_sword",
            () -> new SwordItem(ModToolTiers.CHAROITE, new Item.Properties().fireResistant()
                    .attributes(SwordItem.createAttributes(ModToolTiers.CHAROITE, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> CHAROITE_PICKAXE = ITEMS.register("charoite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHAROITE, new Item.Properties().fireResistant()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.CHAROITE, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> CHAROITE_SHOVEL = ITEMS.register("charoite_shovel",
            () -> new ShovelItem(ModToolTiers.CHAROITE, new Item.Properties().fireResistant()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.CHAROITE, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> CHAROITE_AXE = ITEMS.register("charoite_axe",
            () -> new AxeItem(ModToolTiers.CHAROITE, new Item.Properties().fireResistant()
                    .attributes(AxeItem.createAttributes(ModToolTiers.CHAROITE, 5.5F, -3f))));
    public static final DeferredItem<HoeItem> CHAROITE_HOE = ITEMS.register("charoite_hoe",
            () -> new HoeItem(ModToolTiers.CHAROITE, new Item.Properties().fireResistant()
                    .attributes(HoeItem.createAttributes(ModToolTiers.CHAROITE, -7F, 0f))));

    public static final DeferredItem<SwordItem> ENDERITE_SWORD = ITEMS.register("enderite_sword",
            () -> new SwordItem(ModToolTiers.ENDERITE, new Item.Properties().fireResistant()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ENDERITE, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDERITE, new Item.Properties().fireResistant()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ENDERITE, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel",
            () -> new ShovelItem(ModToolTiers.ENDERITE, new Item.Properties().fireResistant()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ENDERITE, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> ENDERITE_AXE = ITEMS.register("enderite_axe",
            () -> new AxeItem(ModToolTiers.ENDERITE, new Item.Properties().fireResistant()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ENDERITE, 5.5F, -3f))));
    public static final DeferredItem<HoeItem> ENDERITE_HOE = ITEMS.register("enderite_hoe",
            () -> new HoeItem(ModToolTiers.ENDERITE, new Item.Properties().fireResistant()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ENDERITE, -14F, 0f))));

    public static final DeferredItem<SwordItem> PRISM_SWORD = ITEMS.register("prism_sword",
            () -> new SwordItem(ModToolTiers.PRISM, new Item.Properties().fireResistant()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PRISM, 3, -2.4F)).rarity(Rarity.EPIC)));
    public static final DeferredItem<PickaxeItem> PRISM_PICKAXE = ITEMS.register("prism_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PRISM, new Item.Properties().fireResistant()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PRISM, 1.0F, -2.8f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<ShovelItem> PRISM_SHOVEL = ITEMS.register("prism_shovel",
            () -> new ShovelItem(ModToolTiers.PRISM, new Item.Properties().fireResistant()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PRISM, 1.5F, -3.0f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<AxeItem> PRISM_AXE = ITEMS.register("prism_axe",
            () -> new AxeItem(ModToolTiers.PRISM, new Item.Properties().fireResistant()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PRISM, 5.5F, -3f)).rarity(Rarity.EPIC)));
    public static final DeferredItem<HoeItem> PRISM_HOE = ITEMS.register("prism_hoe",
            () -> new HoeItem(ModToolTiers.PRISM, new Item.Properties().fireResistant()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PRISM, -28F, 0f)).rarity(Rarity.EPIC)));

    //armor
    public static final DeferredItem<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(26))));
    public static final DeferredItem<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(26))));
    public static final DeferredItem<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(26))));
    public static final DeferredItem<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(26))));

    public static final DeferredItem<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(24))));
    public static final DeferredItem<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(24))));
    public static final DeferredItem<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(24))));
    public static final DeferredItem<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots",
            () -> new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(24))));

    public static final DeferredItem<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(24))));
    public static final DeferredItem<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(24))));
    public static final DeferredItem<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(24))));
    public static final DeferredItem<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(24))));

    public static final DeferredItem<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(26))));
    public static final DeferredItem<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(26))));
    public static final DeferredItem<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(26))));
    public static final DeferredItem<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(26))));

    public static final DeferredItem<ArmorItem> CHAROITE_HELMET = ITEMS.register("charoite_helmet",
            () -> new ArmorItem(ModArmorMaterials.CHAROITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(42))));
    public static final DeferredItem<ArmorItem> CHAROITE_CHESTPLATE = ITEMS.register("charoite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CHAROITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(42))));
    public static final DeferredItem<ArmorItem> CHAROITE_LEGGINGS = ITEMS.register("charoite_leggings",
            () -> new ArmorItem(ModArmorMaterials.CHAROITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(42))));
    public static final DeferredItem<ArmorItem> CHAROITE_BOOTS = ITEMS.register("charoite_boots",
            () -> new ArmorItem(ModArmorMaterials.CHAROITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(42))));

    public static final DeferredItem<ArmorItem> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(50))));
    public static final DeferredItem<ArmorItem> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(50))));
    public static final DeferredItem<ArmorItem> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50))));
    public static final DeferredItem<ArmorItem> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(50))));

    public static final DeferredItem<ArmorItem> PRISM_HELMET = ITEMS.register("prism_helmet",
            () -> new ArmorItem(ModArmorMaterials.PRISM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(65)).rarity(Rarity.EPIC)));
    public static final DeferredItem<ArmorItem> PRISM_CHESTPLATE = ITEMS.register("prism_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PRISM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(65)).rarity(Rarity.EPIC)));
    public static final DeferredItem<ArmorItem> PRISM_LEGGINGS = ITEMS.register("prism_leggings",
            () -> new ArmorItem(ModArmorMaterials.PRISM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(65)).rarity(Rarity.EPIC)));
    public static final DeferredItem<ArmorItem> PRISM_BOOTS = ITEMS.register("prism_boots",
            () -> new ArmorItem(ModArmorMaterials.PRISM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(65)).rarity(Rarity.EPIC)));

    //horse armmor
    public static final DeferredItem<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> TOPAZ_HORSE_ARMOR = ITEMS.register("topaz_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.register("sapphire_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> CHAROITE_HORSE_ARMOR = ITEMS.register("charoite_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.CHAROITE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1).fireResistant()));

    public static final DeferredItem<Item> ENDERITE_HORSE_ARMOR = ITEMS.register("enderite_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1).fireResistant()));

    public static final DeferredItem<Item> PRISM_HORSE_ARMOR = ITEMS.register("prism_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.PRISM_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC)));

    //tamplete:
    public static final DeferredItem<Item> CHAROITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("charoite_upgrade_smithing_template", () -> new SmithingTemplateItem(
                    Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.charoite_upgrade.applies_to").withStyle(ChatFormatting.DARK_GRAY),
                    Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.charoite_upgrade.ingredients").withStyle(ChatFormatting.LIGHT_PURPLE),
                    Component.translatable("upgrade." + GemsoresMod.MOD_ID + ".charoite_upgrade").withStyle(ChatFormatting.DARK_PURPLE),
                    Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.charoite_upgrade.base_slot_description"),
                    Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.charoite_upgrade.additions_slot_description"),
            List.of(
                    ResourceLocation.withDefaultNamespace("item/empty_slot_sword"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_axe"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_shovel"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_hoe"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots")
            ),
            List.of(ResourceLocation.fromNamespaceAndPath("gemsoresmod", "item/empty_slot_charoite"))));

    public static final DeferredItem<Item> ENDERITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("enderite_upgrade_smithing_template", () -> new SmithingTemplateItem(
            Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.enderite_upgrade.applies_to").withStyle(ChatFormatting.LIGHT_PURPLE),
            Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.enderite_upgrade.ingredients").withStyle(ChatFormatting.DARK_PURPLE),
            Component.translatable("upgrade." + GemsoresMod.MOD_ID + ".enderite_upgrade").withStyle(ChatFormatting.DARK_GREEN),
            Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.enderite_upgrade.base_slot_description"),
            Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.enderite_upgrade.additions_slot_description"),
            List.of(
                    ResourceLocation.withDefaultNamespace("item/empty_slot_sword"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_axe"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_shovel"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_hoe"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots")
            ),
            List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot"))));

    public static final DeferredItem<Item> PRISM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("prism_upgrade_smithing_template", () -> new SmithingTemplateItem(
            Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.prism_upgrade.applies_to").withStyle(ChatFormatting.GREEN),
            Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.prism_upgrade.ingredients").withStyle(ChatFormatting.BLUE),
            Component.translatable("upgrade." + GemsoresMod.MOD_ID + ".prism_upgrade").withStyle(ChatFormatting.WHITE),
            Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.prism_upgrade.base_slot_description"),
            Component.translatable("item." + GemsoresMod.MOD_ID + ".smithing_template.prism_upgrade.additions_slot_description"),
            List.of(
                    ResourceLocation.withDefaultNamespace("item/empty_slot_sword"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_axe"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_shovel"),
                    ResourceLocation.withDefaultNamespace("item/empty_slot_hoe"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings"),
                    ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots")
            ),
            List.of(ResourceLocation.fromNamespaceAndPath("gemsoresmod", "item/empty_slot_prism"))));



    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, GemsoresMod.MOD_ID);

    public static final DeferredHolder<MapCodec<? extends IGlobalLootModifier>, MapCodec<AddItemModifier>> ADD_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("add_item", () -> AddItemModifier.CODEC);

    public static void register(IEventBus eventBus) {
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
