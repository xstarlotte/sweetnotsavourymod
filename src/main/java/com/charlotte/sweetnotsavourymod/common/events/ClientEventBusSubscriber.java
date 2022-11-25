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
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.GingerbreadManRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.SNSGummyBearRenderer;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.*;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

// FIXME class is essentially a duplicate of ClientEvents and should be merged into that
@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void registerRecipeTypes(final EntityRenderersEvent.AddLayers event) {
		GeoArmorRenderer.registerArmorRenderer(StrawberryCandyArmorItem.class, new StrawberryCandyArmorRenderer());
		GeoArmorRenderer.registerArmorRenderer(BlackberryCandyArmorItem.class, new BlackberryCandyArmorRenderer());
		GeoArmorRenderer.registerArmorRenderer(BlueberryCandyArmorItem.class, new BlueberryCandyArmorRenderer());
		GeoArmorRenderer.registerArmorRenderer(RaspberryCandyArmorItem.class, new RaspberryCandyArmorRenderer());
		GeoArmorRenderer.registerArmorRenderer(OrangeCandyArmorItem.class, new OrangeCandyArmorRenderer());
		GeoArmorRenderer.registerArmorRenderer(LemonCandyArmorItem.class, new LemonCandyArmorRenderer());
		GeoArmorRenderer.registerArmorRenderer(LimeCandyArmorItem.class, new LimeCandyArmorRenderer());
		GeoArmorRenderer.registerArmorRenderer(MangoCandyArmorItem.class, new MangoCandyArmorRenderer());
		GeoArmorRenderer.registerArmorRenderer(PeachCandyArmorItem.class, new PeachCandyArmorRenderer());
	}

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
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_SUGAR_CANE.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.FROSTINGFLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYFROSTINGFLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYFROSTINGFLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYFROSTINGFLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYFROSTINGFLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGEFROSTINGFLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONFROSTINGFLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATECINERARIA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.TOFFEETULIP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYCANDYBUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYCANDYBUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYCANDYBUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYCANDYBUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAINBOWCANDYBUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGECANDYBUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONCANDYBUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LIMECANDYBUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.MANGOCANDYBUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PEACHCANDYBUSH.get(), RenderType.cutout());

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
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATERAINBOWFROSTINGLEAVES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAINBOWFROSTINGLEAVES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ICECREAMTREESAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATEICECREAMTREESAPLING.get(), RenderType.cutout());

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
		ItemBlockRenderTypes.setRenderLayer(BlockInit.JAM_PRESSER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WAFFLE_CONE_MACHINE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BANANA_BAKER.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CAKE_BAKER.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.TEDDY_BEAR_PRINTER.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANE_FURNACE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYFLOSS_CRYSTALIZER.get(), RenderType.translucent());

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
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LIME_CANDY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.MANGO_CANDY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PEACH_CANDY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYFLOSS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WAFER_WOOD_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATE_WAFER_WOOD_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WAFER_PLANK_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATE_WAFER_PLANK_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.FROSTING_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.TOOTHPASTE_DOOR.get(), RenderType.translucent());
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
		EntityRenderers.register(EntityTypesInit.CHOCOLATECHICKEN.get(), ChocolateChickenRenderer::new);
		EntityRenderers.register(EntityTypesInit.BONBONBINI.get(), BonbonbiniRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSSNAKE.get(), SNSSnakeRenderer::new);
		EntityRenderers.register(EntityTypesInit.GINGERBREAD_MAN.get(), GingerbreadManRenderer::new);

		EntityRenderers.register(EntityTypesInit.SNSCANDYCANEFISH.get(), SNSCandyCanefishRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSICFISH.get(), SNSICFishRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSWAFFLEFISH.get(), SNSWafflefishRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSWHALE.get(), SNSWhaleRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSANGELFISH.get(), SNSAngelFishRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSMINIWAFFLEFISH.get(), SNSMiniWafflefishRenderer::new);
		EntityRenderers.register(EntityTypesInit.SNSDOLPHIN.get(), SNSDolphinRenderer::new);

		EntityRenderers.register(EntityTypesInit.SNSPRETZELFLY.get(), SNSPretzelflyRenderer::new);



		EntityRenderers.register(EntityTypesInit.POISONBERRYATTACKER.get(), PBAttackerRenderer::new);
		EntityRenderers.register(EntityTypesInit.POISONBERRYDEFENDER.get(), PBDefenderRenderer::new);
		EntityRenderers.register(EntityTypesInit.POISONBERRYARCHER.get(), PBArcherRenderer::new);
		EntityRenderers.register(EntityTypesInit.CANDYCANECROOK.get(), CandyCaneCrookRenderer::new);
		EntityRenderers.register(EntityTypesInit.RSWMUMMY.get(), RSWMummyRenderer::new);
		EntityRenderers.register(EntityTypesInit.MINTIMPERIAL.get(), MintImperialRenderer::new);

		EntityRenderers.register(EntityTypesInit.BOAT_ENTITY.get(), ModBoatRenderer::new);
		/*




		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANAMONKEY.get(), BananaMonkeyRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANAMONKEYKING.get(), BananaMonkeyKingRenderer::new);

	*/}

}
