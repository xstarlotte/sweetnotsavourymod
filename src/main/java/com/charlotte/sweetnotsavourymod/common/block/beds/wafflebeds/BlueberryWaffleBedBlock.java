package com.charlotte.sweetnotsavourymod.common.block.beds.wafflebeds;

import com.charlotte.sweetnotsavourymod.common.block.beds.SNSBedBlock;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.waffle.BlueberryWaffleBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlueberryWaffleBedBlock extends SNSBedBlock {
    public BlueberryWaffleBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BlueberryWaffleBedBlockEntity(pos, state);
    }
}