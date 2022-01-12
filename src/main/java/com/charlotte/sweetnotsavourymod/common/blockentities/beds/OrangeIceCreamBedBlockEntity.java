package com.charlotte.sweetnotsavourymod.common.blockentities.beds;

import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class OrangeIceCreamBedBlockEntity extends SNSBaseBedBlockEntity {
    public OrangeIceCreamBedBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityTypesInit.SNS_ORANGE_BLOCK_ENTITY_TYPE.get(), pos, state);
    }
}
