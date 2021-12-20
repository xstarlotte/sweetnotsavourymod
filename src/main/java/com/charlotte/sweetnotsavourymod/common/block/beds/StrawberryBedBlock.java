package com.charlotte.sweetnotsavourymod.common.block.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.RaspberryIceCreamBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.StrawberryIceCreamBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class StrawberryBedBlock extends SNSBedBlock {
    public StrawberryBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new StrawberryIceCreamBedBlockEntity(pos, state);
    }
}
