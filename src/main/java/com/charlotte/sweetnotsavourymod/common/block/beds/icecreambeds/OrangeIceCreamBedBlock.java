package com.charlotte.sweetnotsavourymod.common.block.beds.icecreambeds;

import com.charlotte.sweetnotsavourymod.common.block.beds.SNSBedBlock;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.icecream.OrangeIceCreamBedBlockEntity;
import net.minecraft.world.IBlockReader;
import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.BlockState;

public class OrangeIceCreamBedBlock extends SNSBedBlock {
    public OrangeIceCreamBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public TileEntity newBlockEntity(IBlockReader world) {
        return new OrangeIceCreamBedBlockEntity();
    }
}
