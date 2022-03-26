package com.charlotte.sweetnotsavourymod.common.block.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.OrangeWaffleBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.StrawberryWaffleBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class OrangeWaffleBedBlock extends SNSBedBlock {
    public OrangeWaffleBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new OrangeWaffleBedBlockEntity(pos, state);
    }
}