package com.charlotte.sweetnotsavourymod.common.tileentities;

import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class StrawberryIceCreamBedTe extends TileEntity{

    public StrawberryIceCreamBedTe( TileEntityType <?> tileEntityTypeIn ){
        super( tileEntityTypeIn );
    }

    public StrawberryIceCreamBedTe(){
        this(TileEntityTypesInit.STRAWBERRYICECREAMBED_TILE_ENTITY_TYPE.get());
    }
}
