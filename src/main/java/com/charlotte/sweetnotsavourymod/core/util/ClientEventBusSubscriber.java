package com.charlotte.sweetnotsavourymod.core.util;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.elves.SNSElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.SNSIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.SNSParrotRenderer;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {

		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAINBOWFROSTINGLEAVES.get(), RenderType.cutout());

		// ItemBlockRenderTypes.setRenderLayer(BlockInit.ICECREAMTREESAPLING.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYPLANT.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANEBUSH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.FROSTINGFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYFROSTINGFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYFROSTINGFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYFROSTINGFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYFROSTINGFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGEFROSTINGFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONFROSTINGFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATECINERARIA.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYCANDYBUSH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYCANDYBUSH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYCANDYBUSH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYCANDYBUSH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAINBOWCANDYBUSH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGECANDYBUSH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONCANDYBUSH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYCONEFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYCONEFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYCONEFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYCONEFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGECONEFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONCONEFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.VANILLACONEFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.TOFFEECONEFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATECONEFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.FROSTINGGRASS.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYLANTERN.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYICECREAMLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYICECREAMLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYICECREAMLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYICECREAMLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONICECREAMLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGEICECREAMLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.VANILLAICECREAMLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATEICECREAMLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.TOFFEEICECREAMLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGELAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYLOLLIPOPLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYLOLLIPOPLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYLOLLIPOPLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYLOLLIPOPLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGELOLLIPOPLAMP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONLOLLIPOPLAMP.get(), RenderType.cutout());
        
		/*
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYARCHER.get(), PoisonBerryArcherRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYSPRITE.get(), PoisonBerrySpriteRenderer::new);
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYWAFERSCHUND.get(), StrawberryWaferschundRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYPARFAITPIXIE.get(), StrawberryParfaitPixieRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BLUEBERRYPARFAITPIXIE.get(), BlueberryParfaitPixieRenderer::new);

		EntityRenderers.register(EntityTypesInit.STRAWBERRYCHEESECAKEMOUSE, StrawberryCheesecakeMouseRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.HAZELNUTCHEESECAKEMOUSE.get(), HazelnutCheesecakeMouseRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.MARSHMALLOWPIEMOUSE.get(), MarshmallowPieMouseRenderer::new);
		

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYPUG.get(), manager -> new StrawberryPugRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.LEMONPUG.get(), manager -> new LemonPugRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ORANGEPUG.get(), manager -> new OrangePugRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BLUEBERRYPUG.get(), manager -> new BlueberryPugRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.RASPBERRYPUG.get(), manager -> new RaspberryPugRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CHOCOLATEPUG.get(), manager -> new ChocolatePugRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.TOFFEEPUG.get(), manager -> new ToffeePugRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.TOFFEEICECREAMPUG.get(), ToffeeIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BLUEBERRYICECREAMPUG.get(), BlueberryIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CHOCOLATEICECREAMPUG.get(), ChocolateIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ORANGEICECREAMPUG.get(), OrangeIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.RASPBERRYICECREAMPUG.get(), RaspberryIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYICECREAMPUG.get(), StrawberryIceCreamPugRenderer::new);
		*/

		EntityRenderers.register(EntityTypesInit.SNSELF.get(), SNSElfRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSPARROT.get(), SNSParrotRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSICECREAMPARROT.get(), SNSIceCreamParrotRenderer::new);
		/*

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CARROTCAKERABBIT.get(), CarrotCakeRabbitRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CHOCOLATECHERRYCAKERABBIT.get(), ChocolateCherryCakeRabbitRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANABREADRABBIT.get(), BananaBreadRabbitRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ANGELCAKERABBIT.get(), AngelCakeRabbitRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.VANILLACAKERABBIT.get(), VanillaCakeRabbitRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.LEMONCURDCAKERABBIT.get(), LemonCurdCakeRabbitRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.REDVELVETCAKERABBIT.get(), RedVelvetCakeRabbitRenderer::new);
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ZEBRACAKEZEBRA.get(), ZebraCakeZebraRenderer::new);
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CINNAMONSQUIRROLL.get(), CinnamonSquirrollRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYSWISSSQUIRROLL.get(), StrawberrySwissSquirrollRenderer::new);
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.TOFFEETOAD.get(), ToffeeToadRenderer::new);
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANAMONKEY.get(), BananaMonkeyRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANAMONKEYKING.get(), BananaMonkeyKingRenderer::new);
		
	//parrot
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CANDYCANEWOLF.get(), manager -> new CandyCaneWolfRenderer(manager));
	*/}

}
