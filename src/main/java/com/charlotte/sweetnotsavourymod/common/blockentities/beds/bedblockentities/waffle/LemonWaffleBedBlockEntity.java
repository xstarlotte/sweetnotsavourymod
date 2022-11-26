package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.waffle;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;

public class LemonWaffleBedBlockEntity extends SNSBaseBedBlockEntity {
    public LemonWaffleBedBlockEntity() {
        super(BlockEntityTypesInit.SNS_LEMON_WAFFLE_BED_ENTITY_TYPE.get());
    }
}
