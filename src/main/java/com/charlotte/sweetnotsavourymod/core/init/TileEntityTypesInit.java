package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.tileentities.BlackberryIceCreamBedTe;
import com.charlotte.sweetnotsavourymod.common.tileentities.BlueberryIceCreamBedTe;
import com.charlotte.sweetnotsavourymod.common.tileentities.LemonIceCreamBedTe;
import com.charlotte.sweetnotsavourymod.common.tileentities.RaspberryIceCreamBedTe;
import com.charlotte.sweetnotsavourymod.common.tileentities.StrawberryChestTe;
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
    
    public static final RegistryObject < TileEntityType < BlueberryIceCreamBedTe > > BLUEBERRYICECREAMBED_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
            .register("blueberryicecreambed", () -> TileEntityType.Builder.create( BlueberryIceCreamBedTe::new,
                    BlockInit.BLUEBERRYICECREAMBED.get ()).build(null));
    
    public static final RegistryObject < TileEntityType < RaspberryIceCreamBedTe > > RASPBERRYICECREAMBED_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
            .register("raspberryicecreambed", () -> TileEntityType.Builder.create( RaspberryIceCreamBedTe::new,
                    BlockInit.RASPBERRYICECREAMBED.get ()).build(null));
    
    public static final RegistryObject < TileEntityType < LemonIceCreamBedTe > > LEMONICECREAMBED_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
            .register("lemonicecreambed", () -> TileEntityType.Builder.create( LemonIceCreamBedTe::new,
                    BlockInit.LEMONICECREAMBED.get ()).build(null));
    
    public static final RegistryObject < TileEntityType < StrawberryChestTe > > STRAWBERRY_CHEST_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
    		.register("strawberrychest", () -> TileEntityType.Builder.create( StrawberryChestTe::new, 
    				BlockInit.STRAWBERRYCHEST.get ()).build(null));
}
