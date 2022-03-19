package com.charlotte.sweetnotsavourymod.common.fuel;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class CandyCaneSugarFuel extends Item {
    public CandyCaneSugarFuel(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 400;
    }
}
