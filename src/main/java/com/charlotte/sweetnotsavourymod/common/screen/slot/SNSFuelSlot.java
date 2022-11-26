package com.charlotte.sweetnotsavourymod.common.screen.slot;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SNSFuelSlot extends SlotItemHandler {
    public SNSFuelSlot(IItemHandler itemHandler, int index, int x, int y) {
        super(itemHandler, index, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return AbstractFurnaceBlockEntity.isFuel(stack) || SNSFuelSlot.isBucket(stack);
    }

    @Override
    public int getMaxStackSize(ItemStack pStack) {
        return SNSFuelSlot.isBucket(pStack) ? 1 : super.getMaxStackSize(pStack);
    }

    public static boolean isBucket(ItemStack stack) {
        return stack.is(Items.BUCKET);
    }
}
