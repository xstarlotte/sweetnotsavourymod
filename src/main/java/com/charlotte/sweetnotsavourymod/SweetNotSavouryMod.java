package com.charlotte.sweetnotsavourymod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.charlotte.sweetnotsavourymod.client.events.ClientEvents;
import com.charlotte.sweetnotsavourymod.common.entity.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BananaBreadRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.CarrotCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateCherryCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryAttackerEntity;
import com.charlotte.sweetnotsavourymod.common.entity.RaspberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryPigEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;
import com.charlotte.sweetnotsavourymod.common.events.EntityEvents;
import com.charlotte.sweetnotsavourymod.common.item.CustomSpawnEggItem;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.FeatureInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;

import net.minecraft.entity.EntityType;
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


		MinecraftForge.EVENT_BUS.register(new ClientEvents());
		MinecraftForge.EVENT_BUS.register(new EntityEvents());
		bus.addListener(this::commonSetup);
		
		
		
    	ItemInit.ITEMS.register(bus);
    	BlockInit.BLOCKS.register(bus);
		TileEntityTypesInit.TILE_ENTITY_TYPE.register( bus );
		EntityTypesInit.ENTITY_TYPES.register(bus);
    	
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
    
    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
    	CustomSpawnEggItem.initSpawnEggs();
    }
//Where to code my entities    
    @SuppressWarnings("deprecation")
	public void commonSetup(final FMLCommonSetupEvent event) {
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerEntity.setAttributes().create());
    	});
    	
    
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.STRAWBERRYPUG.get(), StrawberryPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.TOFFEEICECREAMPUG.get(), ToffeeIceCreamPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.BLUEBERRYICECREAMPUG.get(), BlueberryIceCreamPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.CHOCOLATEICECREAMPUG.get(), ChocolateIceCreamPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.RASPBERRYICECREAMPUG.get(), RaspberryIceCreamPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.STRAWBERRYICECREAMPUG.get(), StrawberryIceCreamPugEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.STRAWBERRYELF.get(), StrawberryElfEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.STRAWBERRYPIG.get(), StrawberryPigEntity.setAttributes().create());
    	});
      
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.CARROTCAKERABBIT.get(), CarrotCakeRabbitEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.CHOCOLATECHERRYCAKERABBIT.get(), ChocolateCherryCakeRabbitEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.BANANABREADRABBIT.get(), BananaBreadRabbitEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.ANGELCAKERABBIT.get(), AngelCakeRabbitEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.ZEBRACAKEZEBRA.get(), ZebraCakeZebraEntity.setAttributes().create());
    	});
  
    	
    	
    } 
    
}
