package com.gemsores.gemsoresmod.datagen;

import com.gemsores.gemsoresmod.GemsoresMod;
import com.gemsores.gemsoresmod.block.ModBlock;
import com.gemsores.gemsoresmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> RUBY_SMELTABLES = List.of(
                ModBlock.RUBY_ORE, ModBlock.DEEPSLATE_RUBY_ORE);
        List<ItemLike> SAPPHIRE_SMELTABLES = List.of(
                ModBlock.SAPPHIRE_ORE, ModBlock.DEEPSLATE_SAPPHIRE_ORE);
        List<ItemLike> AQUAMARINE_SMELTABLES = List.of(
                ModBlock.AQUAMARINE_ORE, ModBlock.DEEPSLATE_AQUAMARINE_ORE);
        List<ItemLike> TOPAZ_SMELTABLES = List.of(
                ModBlock.TOPAZ_ORE, ModBlock.DEEPSLATE_TOPAZ_ORE, ModBlock.NETHER_TOPAZ_ORE);
        List<ItemLike> IRON_SMELTABLES = List.of(
                ModBlock.NETHER_IRON_ORE);
        List<ItemLike> REDSTONE_SMELTABLES = List.of(
                ModBlock.NETHER_REDSTONE_ORE);
        List<ItemLike> LAPIS_SMELTABLES = List.of(
                ModBlock.NETHER_LAPIS_ORE);
        List<ItemLike> DIAMOND_SMELTABLES = List.of(
                ModBlock.NETHER_DIAMOND_ORE);
        List<ItemLike> COPPER_SMELTABLES = List.of(
                ModBlock.NETHER_COPPER_ORE);
        List<ItemLike> CHAROITE_SMELTABLES = List.of(
                ModBlock.NETHER_CHAROITE_ORE, ModBlock.END_CHAROITE_ORE);
        List<ItemLike> TOPAZ_NUGGET_SMELTABLES = List.of(
                ModItems.TOPAZ_AXE, ModItems.TOPAZ_HOE, ModItems.TOPAZ_PICKAXE, ModItems.TOPAZ_SHOVEL, ModItems.TOPAZ_SWORD,
                ModItems.TOPAZ_CHESTPLATE, ModItems.TOPAZ_BOOTS,  ModItems.TOPAZ_HELMET, ModItems.TOPAZ_LEGGINGS, ModItems.TOPAZ_HORSE_ARMOR);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.RUBY_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.AQUAMARINE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AQUAMARINE.get())
                .unlockedBy("has_aquamarine", has(ModItems.AQUAMARINE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.CHAROITE_BLOCK.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.CHAROITE.get())
                .unlockedBy("has_charoite", has(ModItems.CHAROITE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.PRISM_BLOCK.get())
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', ModItems.PRISM.get())
                .unlockedBy("has_prism", has(ModItems.PRISM)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.ENDERITE_BLOCK.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModItems.ENDERITE.get())
                .unlockedBy("has_enderite", has(ModItems.ENDERITE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite_block_from_enderite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.TOPAZ_BLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TOPAZ.get())
                .unlockedBy("has_topaz", has(ModItems.TOPAZ))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "topaz_block_from_topaz"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOPAZ.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.TOPAZ_NUGGET.get())
                .unlockedBy("has_topaz_nugget", has(ModItems.TOPAZ_NUGGET))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "topaz_from_nuggets"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COAL)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.COAL_NUGGET.get())
                .unlockedBy("has_coal_nugget", has(ModItems.COAL_NUGGET))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "coal_from_nuggets"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LAPIS_LAZULI)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.LAPIS_NUGGET.get())
                .unlockedBy("has_lapis_nugget", has(ModItems.LAPIS_NUGGET))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "lapis_from_nuggets"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.DIAMOND_NUGGET.get())
                .unlockedBy("has_diamond_nugget", has(ModItems.DIAMOND_NUGGET))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "diamond_from_nuggets"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COPPER_INGOT)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.COPPER_NUGGET.get())
                .unlockedBy("has_copper_nugget", has(ModItems.COPPER_NUGGET))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "copper_from_nuggets"));

        //Prism
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PRISM.get())
                .requires(ModItems.RUBY)
                .requires(ModItems.SAPPHIRE)
                .requires(ModItems.TOPAZ)
                .requires(ModItems.CHAROITE)
                .requires(Items.DIAMOND)
                .requires(Items.AMETHYST_SHARD)
                .requires(Items.EMERALD)
                .requires(Items.LAPIS_LAZULI)
                .requires(Items.QUARTZ)
                .unlockedBy("has_prism", has(ModItems.PRISM))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "create_of_prism"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE.get())
                .pattern("ISI")
                .pattern("IEI")
                .pattern("III")
                .define('E', ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get())
                .define('S', ModItems.PRISM.get())
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_prism_upgrade_smithing_template", has(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlock.RUBY_BLOCK)
                .unlockedBy("has_ruby_block", has(ModBlock.RUBY_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlock.SAPPHIRE_BLOCK)
                .unlockedBy("has_sapphire_block", has(ModBlock.SAPPHIRE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AQUAMARINE.get(), 9)
                .requires(ModBlock.AQUAMARINE_BLOCK)
                .unlockedBy("has_aquamarine_block", has(ModBlock.AQUAMARINE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TOPAZ.get(), 9)
                .requires(ModBlock.TOPAZ_BLOCK)
                .unlockedBy("has_topaz_block", has(ModBlock.TOPAZ_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHAROITE.get(), 9)
                .requires(ModBlock.CHAROITE_BLOCK)
                .unlockedBy("has_charoite_block", has(ModBlock.CHAROITE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERITE.get(), 9)
                .requires(ModBlock.ENDERITE_BLOCK)
                .unlockedBy("has_enderite_block", has(ModBlock.ENDERITE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PRISM.get(), 9)
                .requires(ModBlock.PRISM_BLOCK)
                .unlockedBy("has_prism_block", has(ModBlock.PRISM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TOPAZ_NUGGET.get(), 9)
                .requires(ModItems.TOPAZ)
                .unlockedBy("has_topaz", has(ModItems.TOPAZ)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COAL_NUGGET.get(), 9)
                .requires(Items.COAL)
                .unlockedBy("has_coal", has(Items.COAL)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LAPIS_NUGGET.get(), 9)
                .requires(Items.LAPIS_LAZULI)
                .unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(), 9)
                .requires(Items.DIAMOND)
                .unlockedBy("has_diamond", has(Items.DIAMOND)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COPPER_NUGGET.get(), 9)
                .requires(Items.COPPER_INGOT)
                .unlockedBy("has_copper", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERITE.get(), 1)
                .requires(Items.ENDER_PEARL, 2)
                .requires(ModItems.CHAROITE)
                .unlockedBy("has_enderite", has(ModItems.ENDERITE)).save(recipeOutput,
                        ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "fusion_enderite"));

        oreSmelting(recipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(),0.25f, 200, "ruby");
        oreBlasting(recipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(),0.25f, 100, "ruby");

        oreSmelting(recipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(),0.25f, 200, "sapphire");
        oreBlasting(recipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(),0.25f, 100, "sapphire");

        oreSmelting(recipeOutput, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ.get(),0.25f, 200, "topaz");
        oreBlasting(recipeOutput, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ.get(),0.25f, 100, "topaz");

        oreSmelting(recipeOutput, AQUAMARINE_SMELTABLES, RecipeCategory.MISC, ModItems.AQUAMARINE.get(),0.25f, 200, "aquamarine");
        oreBlasting(recipeOutput, AQUAMARINE_SMELTABLES, RecipeCategory.MISC, ModItems.AQUAMARINE.get(),0.25f, 100, "aquamarine");

        oreSmelting(recipeOutput, CHAROITE_SMELTABLES, RecipeCategory.MISC, ModItems.CHAROITE.get(),0.25f, 200, "charoite");
        oreBlasting(recipeOutput, CHAROITE_SMELTABLES, RecipeCategory.MISC, ModItems.CHAROITE.get(),0.25f, 100, "charoite");

        oreSmelting(recipeOutput, IRON_SMELTABLES , RecipeCategory.MISC, Items.IRON_INGOT ,0.25f, 200, "iron_nugget");
        oreBlasting(recipeOutput, IRON_SMELTABLES , RecipeCategory.MISC, Items.IRON_INGOT ,0.25f, 100, "iron_nugget");

        oreSmelting(recipeOutput, REDSTONE_SMELTABLES , RecipeCategory.MISC, Items.REDSTONE ,0.25f, 200, "redstone_nugget");
        oreBlasting(recipeOutput, REDSTONE_SMELTABLES , RecipeCategory.MISC, Items.REDSTONE ,0.25f, 100, "redstone_nugget");

        oreSmelting(recipeOutput, LAPIS_SMELTABLES , RecipeCategory.MISC, Items.LAPIS_LAZULI ,0.25f, 200, "lapis_nugget");
        oreBlasting(recipeOutput, LAPIS_SMELTABLES , RecipeCategory.MISC, Items.LAPIS_LAZULI ,0.25f, 100, "lapis_nugget");

        oreSmelting(recipeOutput, DIAMOND_SMELTABLES , RecipeCategory.MISC, Items.DIAMOND ,0.25f, 200, "diamond_nugget");
        oreBlasting(recipeOutput, DIAMOND_SMELTABLES , RecipeCategory.MISC, Items.DIAMOND ,0.25f, 100, "diamond_nugget");

        oreSmelting(recipeOutput, COPPER_SMELTABLES , RecipeCategory.MISC, Items.COPPER_INGOT ,0.25f, 200, "copper_nugget");
        oreBlasting(recipeOutput, COPPER_SMELTABLES , RecipeCategory.MISC, Items.COPPER_INGOT ,0.25f, 100, "copper_nugget");

        oreSmelting(recipeOutput, TOPAZ_NUGGET_SMELTABLES , RecipeCategory.MISC, ModItems.TOPAZ_NUGGET ,0.25f, 200, "topaz_nugget");
        oreBlasting(recipeOutput, TOPAZ_NUGGET_SMELTABLES , RecipeCategory.MISC, ModItems.TOPAZ_NUGGET ,0.25f, 100, "topaz_nugget");

        //armor:
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_HELMET.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .define('R', ModItems.RUBY.get())
                .unlockedBy("has_ruby_helemt", has(ModItems.RUBY))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_CHESTPLATE.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RUBY.get())
                .unlockedBy("has_ruby_chestplate", has(ModItems.RUBY))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_LEGGINGS.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.RUBY.get())
                .unlockedBy("has_ruby_legging", has(ModItems.RUBY))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_BOOTS.get())
                .pattern("R R")
                .pattern("R R")
                .pattern("   ")
                .define('R', ModItems.RUBY.get())
                .unlockedBy("has_ruby_boots", has(ModItems.RUBY))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOPAZ_HELMET.get())
                .pattern("TTT")
                .pattern("T T")
                .pattern("   ")
                .define('T', ModItems.TOPAZ.get())
                .unlockedBy("has_topaz_helemt", has(ModItems.TOPAZ))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOPAZ_CHESTPLATE.get())
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TOPAZ.get())
                .unlockedBy("has_topaz_chestplate", has(ModItems.TOPAZ))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOPAZ_LEGGINGS.get())
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .define('T', ModItems.TOPAZ.get())
                .unlockedBy("has_topaz_legging", has(ModItems.TOPAZ))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOPAZ_BOOTS.get())
                .pattern("T T")
                .pattern("T T")
                .pattern("   ")
                .define('T', ModItems.TOPAZ.get())
                .unlockedBy("has_topaz_boots", has(ModItems.TOPAZ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_HELMET.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("   ")
                .define('E', Items.EMERALD)
                .unlockedBy("has_emerald_helemt", has(Items.EMERALD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_CHESTPLATE.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', Items.EMERALD)
                .unlockedBy("has_emerald_chestplate", has(Items.EMERALD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_LEGGINGS.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .define('E', Items.EMERALD)
                .unlockedBy("has_emerald_legging", has(Items.EMERALD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_BOOTS.get())
                .pattern("E E")
                .pattern("E E")
                .pattern("   ")
                .define('E', Items.EMERALD)
                .unlockedBy("has_emerald_boots", has(Items.EMERALD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire_helemt", has(ModItems.SAPPHIRE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire_chestplate", has(ModItems.SAPPHIRE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire_legging", has(ModItems.SAPPHIRE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire_boots", has(ModItems.SAPPHIRE))
                .save(recipeOutput);

        //tools:
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_SWORD.get())
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .define('R', ModItems.RUBY.get())
                .define('S', Items.STICK)
                .unlockedBy("haS_ruby_Sword", has(ModItems.RUBY))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_PICKAXE.get())
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .define('R', ModItems.RUBY.get())
                .define('S', Items.STICK)
                .unlockedBy("haS_ruby_pickaxe", has(ModItems.RUBY))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_SHOVEL.get())
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .define('R', ModItems.RUBY.get())
                .define('S', Items.STICK)
                .unlockedBy("haS_ruby_Shovel", has(ModItems.RUBY))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_AXE.get())
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .define('R', ModItems.RUBY.get())
                .define('S', Items.STICK)
                .unlockedBy("haS_ruby_axe", has(ModItems.RUBY))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_HOE.get())
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .define('R', ModItems.RUBY.get())
                .define('S', Items.STICK)
                .unlockedBy("haS_ruby_hoe", has(ModItems.RUBY))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOPAZ_SWORD.get())
                .pattern(" T ")
                .pattern(" T ")
                .pattern(" S ")
                .define('T', ModItems.TOPAZ.get())
                .define('S', Items.STICK)
                .unlockedBy("haS_topaz_Sword", has(ModItems.TOPAZ))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOPAZ_PICKAXE.get())
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TOPAZ.get())
                .define('S', Items.STICK)
                .unlockedBy("haS_topaz_pickaxe", has(ModItems.TOPAZ))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOPAZ_SHOVEL.get())
                .pattern(" T ")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TOPAZ.get())
                .define('S', Items.STICK)
                .unlockedBy("has_topaz_Shovel", has(ModItems.TOPAZ))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOPAZ_AXE.get())
                .pattern(" TT")
                .pattern(" ST")
                .pattern(" S ")
                .define('T', ModItems.TOPAZ.get())
                .define('S', Items.STICK)
                .unlockedBy("has_topaz_axe", has(ModItems.TOPAZ))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOPAZ_HOE.get())
                .pattern("TT ")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TOPAZ.get())
                .define('S', Items.STICK)
                .unlockedBy("has_topaz_hoe", has(ModItems.TOPAZ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_SWORD.get())
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald_Sword", has(Items.EMERALD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_PICKAXE.get())
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald_pickaxe", has(Items.EMERALD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_SHOVEL.get())
                .pattern(" E ")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald_Shovel", has(Items.EMERALD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_AXE.get())
                .pattern(" EE")
                .pattern(" SE")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald_axe", has(Items.EMERALD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_HOE.get())
                .pattern("EE ")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald_hoe", has(Items.EMERALD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_SWORD.get())
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .define('R', ModItems.SAPPHIRE.get())
                .define('S', Items.STICK)
                .unlockedBy("has_sapphire_sword", has(ModItems.SAPPHIRE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_PICKAXE.get())
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .define('R', ModItems.SAPPHIRE.get())
                .define('S', Items.STICK)
                .unlockedBy("has_sapphire_pickaxe", has(ModItems.SAPPHIRE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_SHOVEL.get())
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .define('R', ModItems.SAPPHIRE.get())
                .define('S', Items.STICK)
                .unlockedBy("has_sapphire_shovel", has(ModItems.SAPPHIRE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_AXE.get())
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .define('R', ModItems.SAPPHIRE.get())
                .define('S', Items.STICK)
                .unlockedBy("has_sapphire_axe", has(ModItems.SAPPHIRE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_HOE.get())
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .define('R', ModItems.SAPPHIRE.get())
                .define('S', Items.STICK)
                .unlockedBy("has_sapphire_hoe", has(ModItems.SAPPHIRE))
                .save(recipeOutput);

        //Upgrade
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(Items.NETHERITE_SWORD),                      // Base
                        Ingredient.of(ModItems.CHAROITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.CHAROITE_SWORD.get())
                .unlocks("has_charoite", has(ModItems.CHAROITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "charoite_sword_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(Items.NETHERITE_PICKAXE),                      // Base
                        Ingredient.of(ModItems.CHAROITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.CHAROITE_PICKAXE.get())
                .unlocks("has_charoite", has(ModItems.CHAROITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "charoite_pickaxe_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(Items.NETHERITE_SHOVEL),                      // Base
                        Ingredient.of(ModItems.CHAROITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.CHAROITE_SHOVEL.get())
                .unlocks("has_charoite", has(ModItems.CHAROITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "charoite_shovel_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(Items.NETHERITE_AXE),                      // Base
                        Ingredient.of(ModItems.CHAROITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.CHAROITE_AXE.get())
                .unlocks("has_charoite", has(ModItems.CHAROITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "charoite_axe_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(Items.NETHERITE_HOE),                      // Base
                        Ingredient.of(ModItems.CHAROITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.CHAROITE_HOE.get())
                .unlocks("has_charoite", has(ModItems.CHAROITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "charoite_hoe_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(Items.NETHERITE_HELMET),                      // Base
                        Ingredient.of(ModItems.CHAROITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.CHAROITE_HELMET.get())
                .unlocks("has_charoite", has(ModItems.CHAROITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "charoite_helmet_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(Items.NETHERITE_CHESTPLATE),                      // Base
                        Ingredient.of(ModItems.CHAROITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.CHAROITE_CHESTPLATE.get())
                .unlocks("has_charoite", has(ModItems.CHAROITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "charoite_chestplate_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(Items.NETHERITE_LEGGINGS),                      // Base
                        Ingredient.of(ModItems.CHAROITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.CHAROITE_LEGGINGS.get())
                .unlocks("has_charoite", has(ModItems.CHAROITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "charoite_leggings_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(Items.NETHERITE_BOOTS),                      // Base
                        Ingredient.of(ModItems.CHAROITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.CHAROITE_BOOTS.get())
                .unlocks("has_charoite", has(ModItems.CHAROITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "charoite_boots_smithing"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.CHAROITE_SWORD),                      // Base
                        Ingredient.of(ModItems.ENDERITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.ENDERITE_SWORD.get())
                .unlocks("has_enderite", has(ModItems.ENDERITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite_sword_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.CHAROITE_PICKAXE),                      // Base
                        Ingredient.of(ModItems.ENDERITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.ENDERITE_PICKAXE.get())
                .unlocks("has_enderite", has(ModItems.ENDERITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite_pickaxe_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.CHAROITE_SHOVEL),                      // Base
                        Ingredient.of(ModItems.ENDERITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.ENDERITE_SHOVEL.get())
                .unlocks("has_enderite", has(ModItems.ENDERITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite_shovel_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.CHAROITE_AXE),                      // Base
                        Ingredient.of(ModItems.ENDERITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.ENDERITE_AXE.get())
                .unlocks("has_enderite", has(ModItems.ENDERITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite_axe_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.CHAROITE_HOE),                      // Base
                        Ingredient.of(ModItems.ENDERITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.ENDERITE_HOE.get())
                .unlocks("has_enderite", has(ModItems.ENDERITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite_hoe_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.CHAROITE_HELMET),                      // Base
                        Ingredient.of(ModItems.ENDERITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.ENDERITE_HELMET.get())
                .unlocks("has_enderite", has(ModItems.ENDERITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite_helmet_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.CHAROITE_CHESTPLATE),                      // Base
                        Ingredient.of(ModItems.ENDERITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.ENDERITE_CHESTPLATE.get())
                .unlocks("has_ENDERITE", has(ModItems.ENDERITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite_chestplate_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.CHAROITE_LEGGINGS),                      // Base
                        Ingredient.of(ModItems.ENDERITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.ENDERITE_LEGGINGS.get())
                .unlocks("has_enderite", has(ModItems.ENDERITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite_leggings_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.CHAROITE_BOOTS),                      // Base
                        Ingredient.of(ModItems.ENDERITE),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.ENDERITE_BOOTS.get())
                .unlocks("has_enderite", has(ModItems.ENDERITE))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "enderite_boots_smithing"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.ENDERITE_SWORD),                      // Base
                        Ingredient.of(ModItems.PRISM),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.PRISM_SWORD.get())
                .unlocks("has_prism", has(ModItems.PRISM))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "prism_sword_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.ENDERITE_PICKAXE),                      // Base
                        Ingredient.of(ModItems.PRISM),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.PRISM_PICKAXE.get())
                .unlocks("has_prism", has(ModItems.PRISM))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "prism_pickaxe_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.ENDERITE_SHOVEL),                      // Base
                        Ingredient.of(ModItems.PRISM),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.PRISM_SHOVEL.get())
                .unlocks("has_prism", has(ModItems.PRISM))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "prism_shovel_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.ENDERITE_AXE),                      // Base
                        Ingredient.of(ModItems.PRISM),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.PRISM_AXE.get())
                .unlocks("has_prism", has(ModItems.PRISM))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "prism_axe_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.ENDERITE_HOE),                      // Base
                        Ingredient.of(ModItems.PRISM),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.PRISM_HOE.get())
                .unlocks("has_prism", has(ModItems.PRISM))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "prism_hoe_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.ENDERITE_HELMET),                      // Base
                        Ingredient.of(ModItems.PRISM),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.PRISM_HELMET.get())
                .unlocks("has_prism", has(ModItems.PRISM))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "prism_helmet_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.ENDERITE_CHESTPLATE),                      // Base
                        Ingredient.of(ModItems.PRISM),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.PRISM_CHESTPLATE.get())
                .unlocks("has_prism", has(ModItems.PRISM))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "prism_chestplate_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.ENDERITE_LEGGINGS),                      // Base
                        Ingredient.of(ModItems.PRISM),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.PRISM_LEGGINGS.get())
                .unlocks("has_prism", has(ModItems.PRISM))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "prism_leggings_smithing"));
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.PRISM_UPGRADE_SMITHING_TEMPLATE), // Template
                        Ingredient.of(ModItems.ENDERITE_BOOTS),                      // Base
                        Ingredient.of(ModItems.PRISM),                    // Addition
                        RecipeCategory.COMBAT,                                   // Categoria
                        ModItems.PRISM_BOOTS.get())
                .unlocks("has_prism", has(ModItems.PRISM))  // Critério de desbloqueio
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, "prism_boots_smithing"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("NCN")
                .pattern("NUN")
                .pattern("NNN")
                .define('U', ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE.get())
                .define('C', ModItems.CHAROITE.get())
                .define('N', Items.NETHERRACK)
                .unlockedBy("has_charoite_upgrade_smithing_template", has(ModItems.CHAROITE_UPGRADE_SMITHING_TEMPLATE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("SCS")
                .pattern("SES")
                .pattern("SSS")
                .define('E', ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get())
                .define('C', ModItems.CHAROITE.get())
                .define('S', Items.END_STONE)
                .unlockedBy("has_enderite_upgrade_smithing_template", has(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE))
                .save(recipeOutput);






    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, GemsoresMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
