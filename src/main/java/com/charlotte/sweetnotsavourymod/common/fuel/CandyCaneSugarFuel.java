package com.charlotte.sweetnotsavourymod.common.fuel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import javax.annotation.Nullable;

public class CandyCaneSugarFuel extends Item {
    public CandyCaneSugarFuel(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable IRecipeType<?> recipeType) {
        return 400;
    }
}
