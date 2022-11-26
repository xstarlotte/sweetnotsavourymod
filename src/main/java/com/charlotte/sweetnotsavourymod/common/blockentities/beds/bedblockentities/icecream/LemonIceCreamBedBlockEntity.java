package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.icecream;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities.SNSBaseBedBlockEntity;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;

public class LemonIceCreamBedBlockEntity extends SNSBaseBedBlockEntity {
    public LemonIceCreamBedBlockEntity() {
        super(BlockEntityTypesInit.SNS_LEMON_BLOCK_ENTITY_TYPE.get());
    }
}
