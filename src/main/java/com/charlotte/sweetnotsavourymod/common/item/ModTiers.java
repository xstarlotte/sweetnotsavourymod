package com.charlotte.sweetnotsavourymod.common.item;

import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier CANDY_CANE = new ForgeTier(5, 2064, 10f, 7f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.CANDY_CANE.get()));

    public static final ForgeTier STRAWBERRY_CANDY = new ForgeTier(5, 2064, 10f, 7f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.STRAWBERRYCANDY.get()));

    public static final ForgeTier RASPBERRY_CANDY = new ForgeTier(5, 2064, 10f, 7f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.RASPBERRYCANDY.get()));

    public static final ForgeTier BLUEBERRY_CANDY = new ForgeTier(5, 2064, 10f, 7f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.BLUEBERRYCANDY.get()));

    public static final ForgeTier BLACKBERRY_CANDY = new ForgeTier(5, 2064, 10f, 7f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.BLACKBERRYCANDY.get()));

    public static final ForgeTier ORANGE_CANDY = new ForgeTier(5, 2064, 10f, 7f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.ORANGECANDY.get()));

    public static final ForgeTier LEMON_CANDY = new ForgeTier(5, 2064, 10f, 7f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.LEMONCANDY.get()));

    public static final ForgeTier LIME_CANDY = new ForgeTier(5, 2064, 10f, 7f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.LIMECANDY.get()));

    public static final ForgeTier MANGO_CANDY = new ForgeTier(5, 2064, 10f, 7f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.MANGOCANDY.get()));

    public static final ForgeTier PEACH_CANDY = new ForgeTier(5, 2064, 10f, 7f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.PEACHCANDY.get()));

}
