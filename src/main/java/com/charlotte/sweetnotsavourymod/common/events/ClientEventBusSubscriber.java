package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.armor.renderers.*;
import com.charlotte.sweetnotsavourymod.client.entityrender.amphibians.SNSToadRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.birds.ChocolateChickenRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.birds.SNSIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.birds.SNSParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.boats.ModBoatRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.bugs.SNSPretzelflyRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.bugs.SNSSpiderRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.cats.SNSCCCatRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.cats.SNSCookieCatRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.cats.SNSLionRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.cows.IceCreamCowRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.dogs.SNSCandyCaneWolfRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.dogs.SNSIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.dogs.SNSPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.dogs.SNSWaferschundRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.fantasy.SNSElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.fantasy.SNSParfaitPixieRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.fish.*;
import com.charlotte.sweetnotsavourymod.client.entityrender.hostile.crooks.CandyCaneCrookRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.hostile.mintimperials.MintImperialRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.hostile.mummies.RSWMummyRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.hostile.poisonberries.PBArcherRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.hostile.poisonberries.PBAttackerRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.hostile.poisonberries.PBDefenderRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.rideable.SNSUnicornRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.rideable.SNSZebraRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.rodents.*;
import com.charlotte.sweetnotsavourymod.client.entityrender.sheep.SNSBoarryRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.sheep.SNSSheepRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.snakes.SNSSnakeRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.BonbonbiniRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.SNSGummyBearRenderer;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.*;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

// FIXME class is essentially a duplicate of ClientEvents and should be merged into that
@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	//Commented and moved downwards
//	@SubscribeEvent
//	public static void registerRecipeTypes(final EntityRenderersEvent.AddLayers event) {
//		GeoArmorRenderer.registerArmorRenderer(StrawberryCandyArmorItem.class, StrawberryCandyArmorRenderer::new);
//		GeoArmorRenderer.registerArmorRenderer(BlackberryCandyArmorItem.class, BlackberryCandyArmorRenderer::new);
//		GeoArmorRenderer.registerArmorRenderer(BlueberryCandyArmorItem.class, BlueberryCandyArmorRenderer::new);
//		GeoArmorRenderer.registerArmorRenderer(RaspberryCandyArmorItem.class, RaspberryCandyArmorRenderer::new);
//		GeoArmorRenderer.registerArmorRenderer(OrangeCandyArmorItem.class, OrangeCandyArmorRenderer::new);
//		GeoArmorRenderer.registerArmorRenderer(LemonCandyArmorItem.class, LemonCandyArmorRenderer::new);
//		GeoArmorRenderer.registerArmorRenderer(LimeCandyArmorItem.class, LimeCandyArmorRenderer::new);
//		GeoArmorRenderer.registerArmorRenderer(MangoCandyArmorItem.class, MangoCandyArmorRenderer::new);
//		GeoArmorRenderer.registerArmorRenderer(PeachCandyArmorItem.class, PeachCandyArmorRenderer::new);
//	}

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		
		GeoArmorRenderer.registerArmorRenderer(StrawberryCandyArmorItem.class, StrawberryCandyArmorRenderer::new);
		GeoArmorRenderer.registerArmorRenderer(BlackberryCandyArmorItem.class, BlackberryCandyArmorRenderer::new);
		GeoArmorRenderer.registerArmorRenderer(BlueberryCandyArmorItem.class, BlueberryCandyArmorRenderer::new);
		GeoArmorRenderer.registerArmorRenderer(RaspberryCandyArmorItem.class, RaspberryCandyArmorRenderer::new);
		GeoArmorRenderer.registerArmorRenderer(OrangeCandyArmorItem.class, OrangeCandyArmorRenderer::new);
		GeoArmorRenderer.registerArmorRenderer(LemonCandyArmorItem.class, LemonCandyArmorRenderer::new);
		GeoArmorRenderer.registerArmorRenderer(LimeCandyArmorItem.class, LimeCandyArmorRenderer::new);
		GeoArmorRenderer.registerArmorRenderer(MangoCandyArmorItem.class, MangoCandyArmorRenderer::new);
		GeoArmorRenderer.registerArmorRenderer(PeachCandyArmorItem.class, PeachCandyArmorRenderer::new);
		

		RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYPLANT.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANEBUSH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_FLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_2.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_3.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_4.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_GRASS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_GRASS_LONG.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.FROSTINGFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYFROSTINGFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYFROSTINGFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYFROSTINGFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYFROSTINGFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGEFROSTINGFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.LEMONFROSTINGFLOWER.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATECINERARIA.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.TOFFEETULIP.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYCANDYBUSH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYCANDYBUSH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYCANDYBUSH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYCANDYBUSH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAINBOWCANDYBUSH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGECANDYBUSH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.LEMONCANDYBUSH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.LIMECANDYBUSH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MANGOCANDYBUSH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.PEACHCANDYBUSH.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYCONEFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYCONEFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYCONEFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYCONEFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGECONEFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.LEMONCONEFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.VANILLACONEFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.TOFFEECONEFLOWER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATECONEFLOWER.get(), RenderType.cutout());

		/////////////////////////////////////////////////////////////////////////////////////////////////////////

//tree
		RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATERAINBOWFROSTINGLEAVES.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAINBOWFROSTINGLEAVES.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ICECREAMTREESAPLING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATEICECREAMTREESAPLING.get(), RenderType.cutout());

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





		RenderTypeLookup.setRenderLayer(BlockInit.FROSTINGGRASS.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYLANTERN.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYICECREAMLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYICECREAMLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYICECREAMLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYICECREAMLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.LEMONICECREAMLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGEICECREAMLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.VANILLAICECREAMLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATEICECREAMLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.TOFFEEICECREAMLAMP.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.LEMONLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGELAMP.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGELOLLIPOPLAMP.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.LEMONLOLLIPOPLAMP.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.WAFERWOODWINDOW.get(), RenderType.translucent());

		RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANEWINDOW.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANEWINDOW2.get(), RenderType.translucent());

		RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYWOODWINDOW.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.POISONOAKWINDOW.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYWOODBED.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYWOODWARDROBE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYLEAVESCHAIR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.POISONOAKSTOVE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.POISONOAKTELEVISION.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.ICE_CREAM_MACHINE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JAM_PRESSER.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WAFFLE_CONE_MACHINE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BANANA_BAKER.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.CAKE_BAKER.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.TEDDY_BEAR_PRINTER.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANE_FURNACE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDYFLOSS_CRYSTALIZER.get(), RenderType.translucent());

		RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRY_CANDY_WINDOW.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRY_CANDY_WINDOW.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRY_CANDY_WINDOW.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRY_CANDY_WINDOW.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_CANDY_WINDOW.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.LEMON_CANDY_WINDOW.get(), RenderType.translucent());

		RenderTypeLookup.setRenderLayer(BlockInit.ROTTENMOULDYCANDYCANECHAINS.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRY_CANDY_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRY_CANDY_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRY_CANDY_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRY_CANDY_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.LEMON_CANDY_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_CANDY_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.LIME_CANDY_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.MANGO_CANDY_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.PEACH_CANDY_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDYFLOSS_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.WAFER_WOOD_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATE_WAFER_WOOD_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.WAFER_PLANK_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATE_WAFER_PLANK_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.FROSTING_DOOR.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR.get(), RenderType.translucent());

		/*
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYARCHER.get(), PoisonBerryArcherRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYSPRITE.get(), PoisonBerrySpriteRenderer::new);

		*/
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSELF.get(), SNSElfRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSPUG.get(), SNSPugRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSICECREAMPUG.get(), SNSIceCreamPugRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSPARROT.get(), SNSParrotRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSICECREAMPARROT.get(), SNSIceCreamParrotRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSRABBIT.get(), SNSRabbitRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSPARFAITPIXIE.get(), SNSParfaitPixieRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSCCWOLF.get(), SNSCandyCaneWolfRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSMOUSE.get(), SNSMouseRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSSQUIRROLL.get(), SNSSquirrollRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSCHIPMUNK.get(), SNSChipmunkRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSZEBRA.get(), SNSZebraRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSWAFERSCHUND.get(), SNSWaferschundRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSTOAD.get(), SNSToadRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSGUMMYBEAR.get(), SNSGummyBearRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSBOARRY.get(), SNSBoarryRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSSPIDER.get(), SNSSpiderRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSCCCAT.get(), SNSCCCatRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSCOOKIECAT.get(), SNSCookieCatRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ICECREAMCOW.get(), IceCreamCowRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSGP.get(), SNSGPRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSUNICORN.get(), SNSUnicornRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSJAMSTER.get(), SNSJamsterRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSSHEEP.get(), SNSSheepRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSLION.get(), SNSLionRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CHOCOLATECHICKEN.get(), ChocolateChickenRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BONBONBINI.get(), BonbonbiniRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSSNAKE.get(), SNSSnakeRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSCANDYCANEFISH.get(), SNSCandyCanefishRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSICFISH.get(), SNSICFishRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSWAFFLEFISH.get(), SNSWafflefishRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSWHALE.get(), SNSWhaleRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSANGELFISH.get(), SNSAngelFishRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSMINIWAFFLEFISH.get(), SNSMiniWafflefishRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSDOLPHIN.get(), SNSDolphinRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SNSPRETZELFLY.get(), SNSPretzelflyRenderer::new);



		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYATTACKER.get(), PBAttackerRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYDEFENDER.get(), PBDefenderRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYARCHER.get(), PBArcherRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CANDYCANECROOK.get(), CandyCaneCrookRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.RSWMUMMY.get(), RSWMummyRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.MINTIMPERIAL.get(), MintImperialRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BOAT_ENTITY.get(), ModBoatRenderer::new);
		/*




		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANAMONKEY.get(), BananaMonkeyRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANAMONKEYKING.get(), BananaMonkeyKingRenderer::new);

	*/}

}
