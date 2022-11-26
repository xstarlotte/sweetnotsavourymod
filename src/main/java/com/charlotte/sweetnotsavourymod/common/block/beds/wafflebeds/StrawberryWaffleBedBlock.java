package com.charlotte.sweetnotsavourymod.common.block.beds.wafflebeds;

import com.charlotte.sweetnotsavourymod.common.block.beds.SNSBedBlock;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.waffle.StrawberryWaffleBedBlockEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class StrawberryWaffleBedBlock extends SNSBedBlock {
    public StrawberryWaffleBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);

    }
    
    @Override
    public TileEntity newBlockEntity(IBlockReader level) {
        return new StrawberryWaffleBedBlockEntity();
    }
}