package com.charlotte.sweetnotsavourymod;

import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryAttackerEntity;
import com.charlotte.sweetnotsavourymod.core.events.ModEvents;
import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.FeatureInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;

import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("sweetnotsavourymod")
@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Bus.MOD)
public class SweetNotSavouryMod {
	
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "sweetnotsavourymod";
    
    public SweetNotSavouryMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		MinecraftForge.EVENT_BUS.register(new ModEvents());
		
		
		
		EntityTypesInit.ENTITY_TYPES.register(bus);
    	ItemInit.ITEMS.register(bus);
    	BlockInit.BLOCKS.register(bus);
		TileEntityTypesInit.TILE_ENTITY_TYPE.register( bus );
    	
    	MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
    	
        MinecraftForge.EVENT_BUS.register(this);
    } 
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
    	BlockInit.BLOCKS.getEntries()
    	.stream()
    	.map(RegistryObject::get).forEach(block -> {
    		event.getRegistry()
    		.register(new BlockItem(block, new Item.Properties()
    				.group(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD))
    				.setRegistryName(block.getRegistryName()));
    	});
    }
    
    @SuppressWarnings("deprecation")
	public void commonSetup(final FMLCommonSetupEvent event) {
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerEntity.setAttributes().create());
    	});
    	
    	
    }
    
    
}
