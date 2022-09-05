package com.ppatel.tutorialmod.Init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Tiers {
    public static final ForgeTier RUBY = new ForgeTier(5,3031,10,5,25, BlockTags.NEEDS_DIAMOND_TOOL,()-> Ingredient.of(ItemInit.RUBY.get()));
}
