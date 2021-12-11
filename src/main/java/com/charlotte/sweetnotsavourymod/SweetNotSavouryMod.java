package com.charlotte.sweetnotsavourymod;



import com.charlotte.sweetnotsavourymod.client.events.ClientEvents;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryWaferschundEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeToadEntity;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.BlueberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.LemonElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.OrangeElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.RaspberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.StrawberryElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.VanillaElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.HazelnutCheesecakeMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.MarshmallowPieMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.mice.StrawberryCheesecakeMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.monkeys.BananaMonkeyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.monkeys.BananaMonkeyKingEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.BlueberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.BlueberryParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.ChocolateIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.OrangeIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.OrangeParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.PeachIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.PeachParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.PineappleParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.RaspberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.RaspberryParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.StrawberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.StrawberryParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.ToffeeIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PoisonBerryArcherEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PoisonBerryAttackerEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PoisonBerrySpriteEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.BlueberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.BlueberryPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ChocolateIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ChocolatePugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.LemonPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.OrangeIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.OrangePugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.RaspberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.RaspberryPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.StrawberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.StrawberryPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ToffeeIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ToffeePugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.BananaBreadRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.CarrotCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.ChocolateCherryCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.LemonCurdCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.RedVelvetCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.VanillaCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.CinnamonSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.StrawberrySwissSquirrollEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wolves.CandyCaneWolfEntity;
import com.charlotte.sweetnotsavourymod.common.events.EntityEvents;
import com.charlotte.sweetnotsavourymod.common.item.CustomSpawnEggItem;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.ItemInit;

import com.charlotte.sweetnotsavourymod.core.itemgroup.SweetNotSavouryModItemGroup;
import com.charlotte.sweetnotsavourymod.core.util.StrippingMap;


import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.DefaultAttributes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
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
		EntityTypesInit.ENTITY_TYPES.register(bus);
    	
        MinecraftForge.EVENT_BUS.register(this);
        

        
      
    } 
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
    	BlockInit.BLOCKS.getEntries()
    	.stream()
    	.map(RegistryObject::get).forEach(block -> {
    		event.getRegistry()
    		.register(new BlockItem(block, new Item.Properties()
    				.tab(SweetNotSavouryModItemGroup.SWEETNOTSAVOURYMOD))
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
			DefaultAttributes.put(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerEntity.setAttributes().create());
    	});

		DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.POISONBERRYARCHER.get(), PoisonBerryArcherEntity.setAttributes().create());
		});
		
		DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.POISONBERRYSPRITE.get(), PoisonBerrySpriteEntity.setAttributes().create());
    	});
		
	//Waferschunds
		
		DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.STRAWBERRYWAFERSCHUND.get(), StrawberryWaferschundEntity.setAttributes().create());
    	});
		
		DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.STRAWBERRYPARFAITPIXIE.get(), StrawberryParfaitPixieEntity.setAttributes().create());
    	});

		DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.BLUEBERRYPARFAITPIXIE.get(), BlueberryParfaitPixieEntity.setAttributes().create());
		});
		
	//mice
		
		DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.STRAWBERRYCHEESECAKEMOUSE.get(), StrawberryCheesecakeMouseEntity.setAttributes().create());
    	});
		
		DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.HAZELNUTCHEESECAKEMOUSE.get(), HazelnutCheesecakeMouseEntity.setAttributes().create());
    	});
		
		DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.MARSHMALLOWPIEMOUSE.get(), MarshmallowPieMouseEntity.setAttributes().create());
    	});
		
		
  //Pugs  
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.STRAWBERRYPUG.get(), StrawberryPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.RASPBERRYPUG.get(), RaspberryPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.BLUEBERRYPUG.get(), BlueberryPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.TOFFEEPUG.get(), ToffeePugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.CHOCOLATEPUG.get(), ChocolatePugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.ORANGEPUG.get(), OrangePugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.TOFFEEICECREAMPUG.get(), ToffeeIceCreamPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.BLUEBERRYICECREAMPUG.get(), BlueberryIceCreamPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.CHOCOLATEICECREAMPUG.get(), ChocolateIceCreamPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.RASPBERRYICECREAMPUG.get(), RaspberryIceCreamPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.STRAWBERRYICECREAMPUG.get(), StrawberryIceCreamPugEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.ORANGEICECREAMPUG.get(), OrangeIceCreamPugEntity.setAttributes().create());
    	});
    	
  
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.LEMONPUG.get(), LemonPugEntity.setAttributes().create());
    	});
    	
  //Elves
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.STRAWBERRYELF.get(), StrawberryElfEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.BLUEBERRYELF.get(), BlueberryElfEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.LEMONELF.get(), LemonElfEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.VANILLAELF.get(), VanillaElfEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.ORANGEELF.get(), OrangeElfEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.RASPBERRYELF.get(), RaspberryElfEntity.setAttributes().create());
    	});
    	
  //Pigs

    	
 //Monkeys
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.BANANAMONKEY.get(), BananaMonkeyEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.BANANAMONKEYKING.get(), BananaMonkeyKingEntity.setAttributes().create());
    	});
    	
 //Rabbits     
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.CARROTCAKERABBIT.get(), CarrotCakeRabbitEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.CHOCOLATECHERRYCAKERABBIT.get(), ChocolateCherryCakeRabbitEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.BANANABREADRABBIT.get(), BananaBreadRabbitEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.ANGELCAKERABBIT.get(), AngelCakeRabbitEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.VANILLACAKERABBIT.get(), VanillaCakeRabbitEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.LEMONCURDCAKERABBIT.get(), LemonCurdCakeRabbitEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.REDVELVETCAKERABBIT.get(), RedVelvetCakeRabbitEntity.setAttributes().create());
    	});
    	
 //Zebra 
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.ZEBRACAKEZEBRA.get(), ZebraCakeZebraEntity.setAttributes().create());
    	});
  //Squirrolls
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.CINNAMONSQUIRROLL.get(), CinnamonSquirrollEntity.setAttributes().create());
    	});
  
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.STRAWBERRYSWISSSQUIRROLL.get(), StrawberrySwissSquirrollEntity.setAttributes().create());
    	});
    	
   //Toads
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.TOFFEETOAD.get(), ToffeeToadEntity.setAttributes().create());
    	});
   //Parrots
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.LEMONPARROT.get(), LemonParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.ORANGEPARROT.get(), OrangeParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.PEACHPARROT.get(), PeachParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.PINEAPPLEPARROT.get(), PineappleParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.BLUEBERRYPARROT.get(), BlueberryParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.RASPBERRYPARROT.get(), RaspberryParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.ORANGEICECREAMPARROT.get(), OrangeIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.PEACHICECREAMPARROT.get(), PeachIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.TOFFEEICECREAMPARROT.get(), ToffeeIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.STRAWBERRYPARROT.get(), StrawberryParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.LEMONICECREAMPARROT.get(), LemonIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.BLUEBERRYICECREAMPARROT.get(), BlueberryIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.RASPBERRYICECREAMPARROT.get(), RaspberryIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.STRAWBERRYICECREAMPARROT.get(), StrawberryIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.CHOCOLATEICECREAMPARROT.get(), ChocolateIceCreamParrotEntity.setAttributes().create());
    	});
    	
    	DeferredWorkQueue.runLater(() -> {
			DefaultAttributes.put(EntityTypesInit.CANDYCANEWOLF.get(), CandyCaneWolfEntity.setAttributes().create());
    	});
   	
    } 
    
    
    
    public void onLoadComplete(final FMLLoadCompleteEvent event) {
    	StrippingMap.registerStrippables();
    }
    
}
