package com.charlotte.sweetnotsavourymod.common.tileentities;

import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class BlueberryIceCreamBedTe extends TileEntity{

    public BlueberryIceCreamBedTe( TileEntityType <?> tileEntityTypeIn ){
        super( tileEntityTypeIn );
    }

    public BlueberryIceCreamBedTe(){
        this(TileEntityTypesInit.BLUEBERRYICECREAMBED_TILE_ENTITY_TYPE.get());
    }
}
