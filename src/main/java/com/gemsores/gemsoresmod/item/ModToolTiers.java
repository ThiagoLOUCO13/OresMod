package com.gemsores.gemsoresmod.item;

import com.gemsores.gemsoresmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier RUBY = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL,
            905, 7f, 2f, 15, () -> Ingredient.of(ModItems.RUBY));

    public static final Tier TOPAZ = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_TOPAZ_TOOL,
            495, 5f, 1.5f, 12, () -> Ingredient.of(ModItems.TOPAZ));

    public static final Tier SAPPHIRE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOL,
            936, 7f, 3f, 16, () -> Ingredient.of(ModItems.SAPPHIRE));

    public static final Tier CHAROITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_CHAROITE_TOOL,
            2132, 12f, 7f, 14, () -> Ingredient.of(ModItems.CHAROITE));

    public static final Tier ENDERITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ENDERITE_TOOL,
            3168, 18f, 14f, 9, () -> Ingredient.of(ModItems.ENDERITE));

    public static final Tier PRISM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_PRISM_TOOL,
            4041, 36f, 28f, 10, () -> Ingredient.of(ModItems.PRISM));
}
