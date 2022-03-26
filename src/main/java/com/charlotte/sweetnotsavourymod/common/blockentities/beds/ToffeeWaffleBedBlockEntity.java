package com.charlotte.sweetnotsavourymod.common.blockentities.beds;

import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class ToffeeWaffleBedBlockEntity extends SNSBaseBedBlockEntity {
    public ToffeeWaffleBedBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityTypesInit.SNS_TOFFEE_WAFFLE_BED_ENTITY_TYPE.get(), pos, state);
    }
}