package com.charlotte.sweetnotsavourymod.common.item;

import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier CANDY_CANE = new ForgeTier(4, 2064, 10f, 5f, 64, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.CANDY_CANE.get()));

}
