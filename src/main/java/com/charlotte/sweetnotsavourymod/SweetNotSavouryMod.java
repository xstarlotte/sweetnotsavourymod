package com.charlotte.sweetnotsavourymod;

import com.charlotte.sweetnotsavourymod.client.events.ClientEvents;
import com.charlotte.sweetnotsavourymod.common.events.EntityEvents;
import com.charlotte.sweetnotsavourymod.common.item.CustomSpawnEggItem;
import com.charlotte.sweetnotsavourymod.common.screen.MenuTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;

import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;
import com.charlotte.sweetnotsavourymod.core.util.StrippingMap;


import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("sweetnotsavourymod")
@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SweetNotSavouryMod {
	
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "sweetnotsavourymod";
    
    public SweetNotSavouryMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		MinecraftForge.EVENT_BUS.register(new ClientEvents());
		MinecraftForge.EVENT_BUS.register(new EntityEvents());
		bus.addListener(this::commonSetup);
		bus.addListener(this::onLoadComplete);

    	ItemInit.ITEMS.register(bus);
    	BlockInit.BLOCKS.register(bus);
    	BlockEntityTypesInit.BLOCK_ENTITY_TYPE.register( bus );
        MenuTypesInit.MENUS.register(bus);
		EntityTypesInit.ENTITY_TYPES.register(bus);
    	
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
    	//CustomSpawnEggItem.initSpawnEggs();
    }

    @SuppressWarnings("deprecation")
	public void commonSetup(final FMLCommonSetupEvent event) {
   	
    } 

    public void onLoadComplete(final FMLLoadCompleteEvent event) {
    	StrippingMap.registerStrippables();
    }
}
