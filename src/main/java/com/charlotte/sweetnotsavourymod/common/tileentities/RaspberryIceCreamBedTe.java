package com.charlotte.sweetnotsavourymod.common.tileentities;

import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class RaspberryIceCreamBedTe extends TileEntity{

    public RaspberryIceCreamBedTe( TileEntityType <?> tileEntityTypeIn ){
        super( tileEntityTypeIn );
    }

    public RaspberryIceCreamBedTe(){
        this(TileEntityTypesInit.RASPBERRYICECREAMBED_TILE_ENTITY_TYPE.get());
    }
}
