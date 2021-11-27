package com.charlotte.sweetnotsavourymod.common.tileentities;

import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class LemonIceCreamBedTe extends TileEntity{

    public LemonIceCreamBedTe( TileEntityType <?> tileEntityTypeIn ){
        super( tileEntityTypeIn );
    }

    public LemonIceCreamBedTe(){
        this(TileEntityTypesInit.LEMONICECREAMBED_TILE_ENTITY_TYPE.get());
    }
}
