package com.gemsores.gemsoresmod.datagen;

import com.gemsores.gemsoresmod.GemsoresMod;
import com.gemsores.gemsoresmod.block.ModBlock;
import com.gemsores.gemsoresmod.item.ModItems;
import com.gemsores.gemsoresmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, GemsoresMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD.get())
                .add(ModItems.TOPAZ_SWORD.get())
                .add(ModItems.SAPPHIRE_SWORD.get())
                .add(ModItems.CHAROITE_SWORD.get())
                .add(ModItems.ENDERITE_SWORD.get())
                .add(ModItems.PRISM_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE.get())
                .add(ModItems.TOPAZ_PICKAXE.get())
                .add(ModItems.SAPPHIRE_PICKAXE.get())
                .add(ModItems.CHAROITE_PICKAXE.get())
                .add(ModItems.ENDERITE_PICKAXE.get())
                .add(ModItems.PRISM_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL.get())
                .add(ModItems.TOPAZ_SHOVEL.get())
                .add(ModItems.SAPPHIRE_SHOVEL.get())
                .add(ModItems.CHAROITE_SHOVEL.get())
                .add(ModItems.ENDERITE_SHOVEL.get())
                .add(ModItems.PRISM_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.RUBY_AXE.get())
                .add(ModItems.TOPAZ_AXE.get())
                .add(ModItems.SAPPHIRE_AXE.get())
                .add(ModItems.CHAROITE_AXE.get())
                .add(ModItems.ENDERITE_AXE.get())
                .add(ModItems.PRISM_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.RUBY_HOE.get())
                .add(ModItems.TOPAZ_HOE.get())
                .add(ModItems.SAPPHIRE_HOE.get())
                .add(ModItems.CHAROITE_HOE.get())
                .add(ModItems.ENDERITE_HOE.get())
                .add(ModItems.PRISM_HOE.get());


        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET.get())
                .add(ModItems.TOPAZ_HELMET.get())
                .add(ModItems.SAPPHIRE_HELMET.get())
                .add(ModItems.CHAROITE_HELMET.get())
                .add(ModItems.ENDERITE_HELMET.get())
                .add(ModItems.PRISM_HELMET.get())
                .add(ModItems.RUBY_CHESTPLATE.get())
                .add(ModItems.TOPAZ_CHESTPLATE.get())
                .add(ModItems.SAPPHIRE_CHESTPLATE.get())
                .add(ModItems.CHAROITE_CHESTPLATE.get())
                .add(ModItems.ENDERITE_CHESTPLATE.get())
                .add(ModItems.PRISM_CHESTPLATE.get())
                .add(ModItems.RUBY_LEGGINGS.get())
                .add(ModItems.TOPAZ_LEGGINGS.get())
                .add(ModItems.SAPPHIRE_LEGGINGS.get())
                .add(ModItems.CHAROITE_LEGGINGS.get())
                .add(ModItems.ENDERITE_LEGGINGS.get())
                .add(ModItems.PRISM_LEGGINGS.get())
                .add(ModItems.RUBY_BOOTS.get())
                .add(ModItems.TOPAZ_BOOTS.get())
                .add(ModItems.SAPPHIRE_BOOTS.get())
                .add(ModItems.CHAROITE_BOOTS.get())
                .add(ModItems.ENDERITE_BOOTS.get())
                .add(ModItems.PRISM_BOOTS.get());

        this.tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.RUBY.get())
                .add(ModItems.TOPAZ.get())
                .add(ModItems.SAPPHIRE.get())
                .add(ModItems.CHAROITE.get())
                .add(ModItems.PRISM.get())
                .add(ModItems.ENDERITE.get());

        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.RUBY.get())
                .add(ModItems.SAPPHIRE.get())
                .add(ModItems.TOPAZ.get())
                .add(ModItems.CHAROITE.get())
                .add(ModItems.PRISM.get())
                .add(ModItems.ENDERITE.get());

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.RUBY_CHESTPLATE.get())
                .add(ModItems.TOPAZ_CHESTPLATE.get())
                .add(ModItems.SAPPHIRE_CHESTPLATE.get())
                .add(ModItems.CHAROITE_CHESTPLATE.get())
                .add(ModItems.ENDERITE_CHESTPLATE.get())
                .add(ModItems.PRISM_CHESTPLATE.get());

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.RUBY_BOOTS.get())
                .add(ModItems.TOPAZ_BOOTS.get())
                .add(ModItems.SAPPHIRE_BOOTS.get())
                .add(ModItems.CHAROITE_BOOTS.get())
                .add(ModItems.ENDERITE_BOOTS.get())
                .add(ModItems.PRISM_BOOTS.get());

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.RUBY_HELMET.get())
                .add(ModItems.TOPAZ_HELMET.get())
                .add(ModItems.SAPPHIRE_HELMET.get())
                .add(ModItems.CHAROITE_HELMET.get())
                .add(ModItems.ENDERITE_HELMET.get())
                .add(ModItems.PRISM_HELMET.get());

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.RUBY_LEGGINGS.get())
                .add(ModItems.TOPAZ_LEGGINGS.get())
                .add(ModItems.SAPPHIRE_LEGGINGS.get())
                .add(ModItems.CHAROITE_LEGGINGS.get())
                .add(ModItems.ENDERITE_LEGGINGS.get())
                .add(ModItems.PRISM_LEGGINGS.get());

        tag(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "gems")))
                .add(ModItems.RUBY.get())
                .add(ModItems.TOPAZ.get())
                .add(ModItems.SAPPHIRE.get())
                .add(ModItems.CHAROITE.get())
                .add(ModItems.PRISM.get())
                .add(ModItems.ENDERITE.get());
    }
}
