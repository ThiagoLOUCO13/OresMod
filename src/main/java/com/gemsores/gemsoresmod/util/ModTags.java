package com.gemsores.gemsoresmod.util;

import com.gemsores.gemsoresmod.GemsoresMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");

        public static final TagKey<Block> NEEDS_TOPAZ_TOOL = createTag("needs_topaz_tool");
        public static final TagKey<Block> INCORRECT_FOR_TOPAZ_TOOL = createTag("incorrect_for_topaz_tool");

        public static final TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");

        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = createTag("needs_sapphire_tool");
        public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOL = createTag("incorrect_for_sapphire_tool");

        public static final TagKey<Block> NEEDS_CHAROITE_TOOL = createTag("needs_charoite_tool");
        public static final TagKey<Block> INCORRECT_FOR_CHAROITE_TOOL = createTag("incorrect_for_charoite_tool");

        public static final TagKey<Block> NEEDS_ENDERITE_TOOL = createTag("needs_enderite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENDERITE_TOOL = createTag("incorrect_for_enderite_tool");

        public static final TagKey<Block> NEEDS_PRISM_TOOL = createTag("needs_prism_tool");
        public static final TagKey<Block> INCORRECT_FOR_PRISM_TOOL = createTag("incorrect_for_prism_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, name));
        }
    }

    public static class Items {
        //public static final TagKey<Item> CHAROITE_ARMORS = createTag("charoite_armors");
        //public static final TagKey<Item> NETHERITE_ARMORS = createTag("netherite_armors");
        public static final  TagKey<Item> TOPAZ_NUGGET_SMELTABLES = createTag("topaz_nugget_smeltables");





        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(GemsoresMod.MOD_ID, name));
        }
    }
}