package com.charlotte.sweetnotsavourymod.common.tileentities.chests;

import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;

import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class StrawberryChestTe extends ChestTileEntity{
	

	    public StrawberryChestTe( TileEntityType <?> tileEntityTypeIn ){
	        super( tileEntityTypeIn );
	    }

	    public StrawberryChestTe(){
	        this(TileEntityTypesInit.STRAWBERRY_CHEST_TILE_ENTITY_TYPE.get());
	    }
}
