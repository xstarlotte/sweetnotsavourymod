package com.charlotte.sweetnotsavourymod.common.blockentities.beds;

import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
//BLACKBERRY
public class SNSBedBlockEntity extends BlockEntity {
    public SNSBedBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityTypesInit.SNS_BLOCK_ENTITY_TYPE.get(), pos, state);
    }



    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}