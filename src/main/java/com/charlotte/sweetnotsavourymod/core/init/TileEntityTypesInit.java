package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.tileentities.BlackberryIceCreamBedTe;
import com.charlotte.sweetnotsavourymod.common.tileentities.StrawberryIceCreamBedTe;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesInit{
    public static final DeferredRegister <TileEntityType < ? >> TILE_ENTITY_TYPE = DeferredRegister
            .create ( ForgeRegistries.TILE_ENTITIES , SweetNotSavouryMod.MOD_ID );

    public static final RegistryObject < TileEntityType < StrawberryIceCreamBedTe > > STRAWBERRYICECREAMBED_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
            .register("strawberryicecreambed", () -> TileEntityType.Builder.create( StrawberryIceCreamBedTe::new,
                    BlockInit.STRAWBERRYICECREAMBED.get ()).build(null));
    
    public static final RegistryObject < TileEntityType < BlackberryIceCreamBedTe > > BLACKBERRYICECREAMBED_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
            .register("blackberryicecreambed", () -> TileEntityType.Builder.create( BlackberryIceCreamBedTe::new,
                    BlockInit.BLACKBERRYICECREAMBED.get ()).build(null));
}
