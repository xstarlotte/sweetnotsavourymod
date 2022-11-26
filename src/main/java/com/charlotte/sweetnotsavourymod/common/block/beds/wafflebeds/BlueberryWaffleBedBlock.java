package com.charlotte.sweetnotsavourymod.common.block.beds.wafflebeds;

import com.charlotte.sweetnotsavourymod.common.block.beds.SNSBedBlock;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.waffle.BlueberryWaffleBedBlockEntity;
import net.minecraft.world.IBlockReader;
import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.BlockState;

public class BlueberryWaffleBedBlock extends SNSBedBlock {
    public BlueberryWaffleBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public TileEntity newBlockEntity(IBlockReader world) {
        return new BlueberryWaffleBedBlockEntity();
    }
}