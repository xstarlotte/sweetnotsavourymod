package com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedblockentities;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

//BLACKBERRY
public abstract class SNSBaseBedBlockEntity extends TileEntity {
    public SNSBaseBedBlockEntity(TileEntityType<?> entityType) {
        super(entityType);
    }
    
//    public ClientboundBlockEntityDataPacket getUpdatePacket() {
//        return ClientboundBlockEntityDataPacket.create(this);
//    }
}