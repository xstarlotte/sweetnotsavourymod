package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.icecream;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class LemonIceCreamBedBlockEntity extends SNSBaseBedBlockEntity {
    public LemonIceCreamBedBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityTypesInit.SNS_LEMON_BLOCK_ENTITY_TYPE.get(), pos, state);
    }
}
