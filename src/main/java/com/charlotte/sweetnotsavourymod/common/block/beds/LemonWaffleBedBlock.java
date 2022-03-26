package com.charlotte.sweetnotsavourymod.common.block.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.LemonWaffleBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.StrawberryWaffleBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LemonWaffleBedBlock extends SNSBedBlock {
    public LemonWaffleBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LemonWaffleBedBlockEntity(pos, state);
    }
}