package com.charlotte.sweetnotsavourymod.core.util;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.angelfish.SNSAngelFishRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.boarries.SNSBoarryRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.boats.ModBoatRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.cats.SNSCCCatRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.cats.SNSCookieCatRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.chipmunk.SNSChipmunkRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.cows.IceCreamCowRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.crooks.CandyCaneCrookRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.guineapigs.SNSGPRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.gummybears.SNSGummyBearRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.icecreamfish.SNSICFishRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.jamsters.SNSJamsterRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.lions.SNSLionRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.mice.SNSMouseRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.mummies.RSWMummyRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pixies.SNSParfaitPixieRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.elves.SNSElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.SNSIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.SNSParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.poisonberries.PBArcherRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.poisonberries.PBAttackerRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.poisonberries.PBDefenderRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pretzelflies.SNSPretzelflyRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.SNSIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.SNSPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.SNSRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.sheep.SNSSheepRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.spiders.SNSSpiderRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.squirrels.SNSSquirrollRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.toads.SNSToadRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.unicorns.SNSUnicornRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.waferschunds.SNSWaferschundRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.wafflefish.SNSMiniWafflefishRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.wafflefish.SNSWafflefishRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.whales.SNSWhaleRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.wolves.SNSCandyCaneWolfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.zebras.SNSZebraRenderer;
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

		ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYPLANT.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANEBUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_2.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_3.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_4.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_GRASS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_GRASS_LONG.get(), RenderType.cutout());

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

		/////////////////////////////////////////////////////////////////////////////////////////////////////////

//tree
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAINBOWFROSTINGLEAVES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ICECREAMTREESAPLING.get(), RenderType.cutout());

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





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

		ItemBlockRenderTypes.setRenderLayer(BlockInit.WAFERWOODWINDOW.get(), RenderType.translucent());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANEWINDOW.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANEWINDOW2.get(), RenderType.translucent());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYWOODWINDOW.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONOAKWINDOW.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYWOODBED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYWOODWARDROBE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYLEAVESCHAIR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONOAKSTOVE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONOAKTELEVISION.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.ICE_CREAM_MACHINE.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRY_CANDY_WINDOW.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRY_CANDY_WINDOW.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRY_CANDY_WINDOW.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRY_CANDY_WINDOW.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGE_CANDY_WINDOW.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMON_CANDY_WINDOW.get(), RenderType.translucent());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.ROTTENMOULDYCANDYCANECHAINS.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRY_CANDY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRY_CANDY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRY_CANDY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRY_CANDY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMON_CANDY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGE_CANDY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WAFER_WOOD_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATE_WAFER_WOOD_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WAFER_PLANK_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATE_WAFER_PLANK_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.FROSTING_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR.get(), RenderType.translucent());
        
		/*
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYARCHER.get(), PoisonBerryArcherRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYSPRITE.get(), PoisonBerrySpriteRenderer::new);

		*/
		EntityRenderers.register(EntityTypesInit.SNSELF.get(), SNSElfRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSPUG.get(), SNSPugRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSICECREAMPUG.get(), SNSIceCreamPugRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSPARROT.get(), SNSParrotRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSICECREAMPARROT.get(), SNSIceCreamParrotRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSRABBIT.get(), SNSRabbitRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSPARFAITPIXIE.get(), SNSParfaitPixieRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSCCWOLF.get(), SNSCandyCaneWolfRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSMOUSE.get(), SNSMouseRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSSQUIRROLL.get(), SNSSquirrollRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSCHIPMUNK.get(), SNSChipmunkRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSZEBRA.get(), SNSZebraRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSWAFERSCHUND.get(), SNSWaferschundRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSTOAD.get(), SNSToadRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSICFISH.get(), SNSICFishRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSWAFFLEFISH.get(), SNSWafflefishRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSWHALE.get(), SNSWhaleRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSANGELFISH.get(), SNSAngelFishRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSMINIWAFFLEFISH.get(), SNSMiniWafflefishRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSPRETZELFLY.get(), SNSPretzelflyRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSGUMMYBEAR.get(), SNSGummyBearRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSBOARRY.get(), SNSBoarryRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSSPIDER.get(), SNSSpiderRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSCCCAT.get(), SNSCCCatRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSCOOKIECAT.get(), SNSCookieCatRenderer::new);
		EntityRenderers.register(EntityTypesInit.ICECREAMCOW.get(), IceCreamCowRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSGP.get(), SNSGPRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSUNICORN.get(), SNSUnicornRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSJAMSTER.get(), SNSJamsterRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSSHEEP.get(), SNSSheepRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSLION.get(), SNSLionRenderer::new);

		EntityRenderers.register(EntityTypesInit.POISONBERRYATTACKER.get(), PBAttackerRenderer::new);
		EntityRenderers.register(EntityTypesInit.POISONBERRYDEFENDER.get(), PBDefenderRenderer::new);
		EntityRenderers.register(EntityTypesInit.POISONBERRYARCHER.get(), PBArcherRenderer::new);
		EntityRenderers.register(EntityTypesInit.CANDYCANECROOK.get(), CandyCaneCrookRenderer::new);
		EntityRenderers.register(EntityTypesInit.RSWMUMMY.get(), RSWMummyRenderer::new);

		EntityRenderers.register(EntityTypesInit.BOAT_ENTITY.get(), ModBoatRenderer::new);
		/*


		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANAMONKEY.get(), BananaMonkeyRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANAMONKEYKING.get(), BananaMonkeyKingRenderer::new);

	*/}

}
