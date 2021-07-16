package com.charlotte.sweetnotsavourymod.common.tileentities;

import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;
import net.minecraft.block.BedBlock;
import net.minecraft.item.DyeColor;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.BedTileEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class StrawberryIceCreamBedTe extends TileEntity{

    public StrawberryIceCreamBedTe( TileEntityType <?> tileEntityTypeIn ){
        super( tileEntityTypeIn );
    }

    public StrawberryIceCreamBedTe(){
        this(TileEntityTypesInit.STRAWBERRYICECREAMBED_TILE_ENTITY_TYPE.get());
    }
}
