package com.charlotte.sweetnotsavourymod.common.blockentities.beds;


import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class BlackberryIceCreamBedTe extends BlockEntity {

    public BlackberryIceCreamBedTe( BlockEntityType<?> tileEntityTypeIn ){
        super( tileEntityTypeIn );
    }

    public BlackberryIceCreamBedTe(){
        this(BlockEntityTypesInit.BLACKBERRYICECREAMBED_TILE_ENTITY_TYPE.get());
    }
}
