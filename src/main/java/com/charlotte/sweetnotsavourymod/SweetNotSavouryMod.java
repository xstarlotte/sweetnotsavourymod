package com.charlotte.sweetnotsavourymod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.charlotte.sweetnotsavourymod.client.events.ClientEvents;
import com.charlotte.sweetnotsavourymod.common.entity.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BananaBreadRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BananaMonkeyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BananaMonkeyKingEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.BlueberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.CarrotCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateCherryCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ChocolateIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.CinnamonSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.LemonCurdCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.LemonElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.LemonIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.LemonParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.LemonPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.OrangeElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryArcherEntity;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryAttackerEntity;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerrySpriteEntity;
import com.charlotte.sweetnotsavourymod.common.entity.RaspberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.RaspberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.RaspberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.RedVelvetCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryPigEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberrySwissSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeToadEntity;
import com.charlotte.sweetnotsavourymod.common.entity.VanillaCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.VanillaElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;
import com.charlotte.sweetnotsavourymod.common.events.EntityEvents;
import com.charlotte.sweetnotsavourymod.common.item.CustomSpawnEggItem;
import com.charlotte.sweetnotsavourymod.core.init.BiomeInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.FeatureInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;
import com.charlotte.sweetnotsavourymod.core.init.SurfaceBuilderInit;
import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;
import com.charlotte.sweetnotsavourymod.core.util.StrippingMap;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
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
		bus.addListener(this::onLoadComplete);
		
		
    	ItemInit.ITEMS.register(bus);
    	BlockInit.BLOCKS.register(bus);
		TileEntityTypesInit.TILE_ENTITY_TYPE.register( bus );
		EntityTypesInit.ENTITY_TYPES.register(bus);
		FeatureInit.FEATURES.register(bus);
		SurfaceBuilderInit.SURFACE_BUILDERS.register(bus);
		BiomeInit.BIOMES.register(bus);
		BiomeInit.registerBiomes();
    	
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
 //Poison Berries   	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerEntity.setAttributes().create());
    	});

		DeferredWorkQueue.runLater(() -> {
			GlobalEntityTypeAttributes.put(EntityTypesInit.POISONBERRYARCHER.get(), PoisonBerryArcherEntity.setAttributes().create());
		});
		
		DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.POISONBERRYSPRITE.get(), PoisonBerrySpriteEntity.setAttributes().create());
    	});
		
	//Waferschunds
		
		DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.STRAWBERRYWAFERSCHUND.get(), StrawberryWaferschundEntity.setAttributes().create());
    	});
		
		
  //Pugs  
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
    		GlobalEntityTypeAttributes.put(EntityTypesInit.LEMONPUG.get(), LemonPugEntity.setAttributes().create());
    	});
    	
  //Elves
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.STRAWBERRYELF.get(), StrawberryElfEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.BLUEBERRYELF.get(), BlueberryElfEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.LEMONELF.get(), LemonElfEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.VANILLAELF.get(), VanillaElfEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.ORANGEELF.get(), OrangeElfEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.RASPBERRYELF.get(), RaspberryElfEntity.setAttributes().create());
    	});
    	
  //Pigs
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.STRAWBERRYPIG.get(), StrawberryPigEntity.setAttributes().create());
    	});
    	
 //Monkeys
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.BANANAMONKEY.get(), BananaMonkeyEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.BANANAMONKEYKING.get(), BananaMonkeyKingEntity.setAttributes().create());
    	});
    	
 //Rabbits     
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
    		GlobalEntityTypeAttributes.put(EntityTypesInit.VANILLACAKERABBIT.get(), VanillaCakeRabbitEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.LEMONCURDCAKERABBIT.get(), LemonCurdCakeRabbitEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.REDVELVETCAKERABBIT.get(), RedVelvetCakeRabbitEntity.setAttributes().create());
    	});
    	
 //Zebra 
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.ZEBRACAKEZEBRA.get(), ZebraCakeZebraEntity.setAttributes().create());
    	});
  //Squirrolls
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.CINNAMONSQUIRROLL.get(), CinnamonSquirrollEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.STRAWBERRYSWISSSQUIRROLL.get(), StrawberrySwissSquirrollEntity.setAttributes().create());
    	});
    	
   //Toads
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.TOFFEETOAD.get(), ToffeeToadEntity.setAttributes().create());
    	});
   //Parrots
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.LEMONPARROT.get(), LemonParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.LEMONICECREAMPARROT.get(), LemonIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.BLUEBERRYICECREAMPARROT.get(), BlueberryIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.RASPBERRYICECREAMPARROT.get(), RaspberryIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.STRAWBERRYICECREAMPARROT.get(), StrawberryIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypesInit.CHOCOLATEICECREAMPARROT.get(), ChocolateIceCreamParrotEntity.setAttributes().create());
    	});
   	
    } 
    
    public void onLoadComplete(final FMLLoadCompleteEvent event) {
    	StrippingMap.registerStrippables();
    }
    
}
