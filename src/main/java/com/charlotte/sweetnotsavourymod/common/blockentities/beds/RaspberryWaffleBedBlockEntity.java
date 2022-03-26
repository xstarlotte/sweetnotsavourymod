package com.charlotte.sweetnotsavourymod.common.blockentities.beds;

import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class RaspberryWaffleBedBlockEntity extends SNSBaseBedBlockEntity {
    public RaspberryWaffleBedBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityTypesInit.SNS_RASPBERRY_WAFFLE_BED_ENTITY_TYPE.get(), pos, state);
    }
}
