package com.charlotte.sweetnotsavourymod.common.tileentities;


import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class BlackberryIceCreamBedTe extends TileEntity{

    public BlackberryIceCreamBedTe( TileEntityType <?> tileEntityTypeIn ){
        super( tileEntityTypeIn );
    }

    public BlackberryIceCreamBedTe(){
        this(TileEntityTypesInit.BLACKBERRYICECREAMBED_TILE_ENTITY_TYPE.get());
    }
}
