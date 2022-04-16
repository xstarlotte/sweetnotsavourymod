package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.waffle;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class LemonWaffleBedBlockEntity extends SNSBaseBedBlockEntity {
    public LemonWaffleBedBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityTypesInit.SNS_LEMON_WAFFLE_BED_ENTITY_TYPE.get(), pos, state);
    }
}
