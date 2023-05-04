package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.candycane;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CandycaneBedBlockEntity extends SNSBaseBedBlockEntity {
    public CandycaneBedBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityTypesInit.SNS_CANDY_CANE_BED_ENTITY_TYPE.get(), pos, state);
    }
}
