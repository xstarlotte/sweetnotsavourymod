package com.charlotte.sweetnotsavourymod.common.tileentities.beds;

import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class StrawberryIceCreamBedTe extends BlockEntity {

    public StrawberryIceCreamBedTe( BlockEntityType<?> tileEntityTypeIn ){
        super( tileEntityTypeIn );
    }

    public StrawberryIceCreamBedTe(){
        this(BlockEntityTypesInit.STRAWBERRYICECREAMBED_TILE_ENTITY_TYPE.get());
    }
}
