package com.charlotte.sweetnotsavourymod.common.block.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.StrawberryWaffleBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.ToffeeWaffleBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ToffeeWaffleBedBlock extends SNSBedBlock {
    public ToffeeWaffleBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ToffeeWaffleBedBlockEntity(pos, state);
    }
}