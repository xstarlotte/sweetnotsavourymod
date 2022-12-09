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
import com.charlotte.sweetnotsavourymod.common.block.SNSChestBlock;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.icecream.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.waffle.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.chest.SNSChestRenderer;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.*;
import com.charlotte.sweetnotsavourymod.common.screen.*;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuType;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestScreen;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.FluidInit;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

// FIXME class is essentially a duplicate of ClientEvents and should be merged into that
@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	public static final ResourceLocation STRAWBERRYICECREAMBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/strawberryicecreambedheadpart");
	public static final ResourceLocation STRAWBERRYICECREAMBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/strawberryicecreambedbottompart");

	public static final ResourceLocation BLUEBERRYICECREAMBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/blueberryicecreambedheadpart");
	public static final ResourceLocation BLUEBERRYICECREAMBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/blueberryicecreambedbottompart");

	public static final ResourceLocation RASPBERRYICECREAMBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/raspberryicecreambedheadpart");
	public static final ResourceLocation RASPBERRYICECREAMBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/raspberryicecreambedbottompart");

	public static final ResourceLocation BLACKBERRYICECREAMBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/blackberryicecreambedheadpart");
	public static final ResourceLocation BLACKBERRYICECREAMBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/blackberryicecreambedbottompart");

	public static final ResourceLocation LEMONICECREAMBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/lemonicecreambedheadpart");
	public static final ResourceLocation LEMONICECREAMBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/lemonicecreambedbottompart");

	public static final ResourceLocation ORANGEICECREAMBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/orangeicecreambedheadpart");
	public static final ResourceLocation ORANGEICECREAMBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/orangeicecreambedbottompart");

	public static final ResourceLocation WAFFLEBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/wafflebedheadpart");
	public static final ResourceLocation WAFFLEBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/wafflebedbottompart");

	public static final ResourceLocation STRAWBERRYWAFFLEBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/strawberrywafflebedheadpart");
	public static final ResourceLocation STRAWBERRYWAFFLEBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/strawberrywafflebedbottompart");

	public static final ResourceLocation RASPBERRYWAFFLEBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/raspberrywafflebedheadpart");
	public static final ResourceLocation RASPBERRYWAFFLEBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/raspberrywafflebedbottompart");

	public static final ResourceLocation BLACKBERRYWAFFLEBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/blackberrywafflebedheadpart");
	public static final ResourceLocation BLACKBERRYWAFFLEBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/blackberrywafflebedbottompart");

	public static final ResourceLocation BLUEBERRYWAFFLEBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/blueberrywafflebedheadpart");
	public static final ResourceLocation BLUEBERRYWAFFLEBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/blueberrywafflebedbottompart");

	public static final ResourceLocation ORANGEWAFFLEBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/orangewafflebedheadpart");
	public static final ResourceLocation ORANGEWAFFLEBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/orangewafflebedbottompart");

	public static final ResourceLocation LEMONWAFFLEBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/lemonwafflebedheadpart");
	public static final ResourceLocation LEMONWAFFLEBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/lemonwafflebedbottompart");

	public static final ResourceLocation CHOCOLATEWAFFLEBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/chocolatewafflebedheadpart");
	public static final ResourceLocation CHOCOLATEWAFFLEBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/chocolatewafflebedbottompart");

	public static final ResourceLocation TOFFEEWAFFLEBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/toffeewafflebedheadpart");
	public static final ResourceLocation TOFFEEWAFFLEBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/toffeewafflebedbottompart");






	@SubscribeEvent
	public static void registerAdditional(ModelEvent.RegisterAdditional event) {
		event.register(BLACKBERRYICECREAMBEDBOTTOM);
		event.register(BLACKBERRYICECREAMBEDHEAD);

		event.register(BLUEBERRYICECREAMBEDBOTTOM);
		event.register(BLUEBERRYICECREAMBEDHEAD);

		event.register(LEMONICECREAMBEDBOTTOM);
		event.register(LEMONICECREAMBEDHEAD);

		event.register(ORANGEICECREAMBEDBOTTOM);
		event.register(ORANGEICECREAMBEDHEAD);

		event.register(RASPBERRYICECREAMBEDBOTTOM);
		event.register(RASPBERRYICECREAMBEDHEAD);

		event.register(STRAWBERRYICECREAMBEDBOTTOM);
		event.register(STRAWBERRYICECREAMBEDHEAD);

		addChestSpecialModel(BlockInit.STRAWBERRY_CHEST, event);
		addChestSpecialModel(BlockInit.WAFER_CHEST, event);

		event.register(WAFFLEBEDBOTTOM);
		event.register(WAFFLEBEDHEAD);

		event.register(STRAWBERRYWAFFLEBEDBOTTOM);
		event.register(STRAWBERRYWAFFLEBEDHEAD);

		event.register(RASPBERRYWAFFLEBEDBOTTOM);
		event.register(RASPBERRYWAFFLEBEDHEAD);

		event.register(BLACKBERRYWAFFLEBEDBOTTOM);
		event.register(BLACKBERRYWAFFLEBEDHEAD);

		event.register(BLUEBERRYWAFFLEBEDBOTTOM);
		event.register(BLUEBERRYWAFFLEBEDHEAD);

		event.register(ORANGEWAFFLEBEDBOTTOM);
		event.register(ORANGEWAFFLEBEDHEAD);

		event.register(LEMONWAFFLEBEDBOTTOM);
		event.register(LEMONWAFFLEBEDHEAD);

		event.register(CHOCOLATEWAFFLEBEDBOTTOM);
		event.register(CHOCOLATEWAFFLEBEDHEAD);

		event.register(TOFFEEWAFFLEBEDBOTTOM);
		event.register(TOFFEEWAFFLEBEDHEAD);
	}

	private static void addChestSpecialModel(RegistryObject<SNSChestBlock> chestReg, ModelEvent.RegisterAdditional event) {
		ResourceLocation id = chestReg.getId();
		String ns = id.getNamespace();
		String path = id.getPath();

		event.register(new ResourceLocation(ns, "block/" + path + "_base"));
		event.register(new ResourceLocation(ns, "block/" + path + "_lid"));

		if (chestReg.get().doubleAble) {
			event.register(new ResourceLocation(ns, "block/" + path + "_base2"));
			event.register(new ResourceLocation(ns, "block/" + path + "_lid2"));
		}
	}

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			GeoArmorRenderer.registerArmorRenderer(StrawberryCandyArmorItem.class, StrawberryCandyArmorRenderer::new);
			GeoArmorRenderer.registerArmorRenderer(BlackberryCandyArmorItem.class, BlackberryCandyArmorRenderer::new);
			GeoArmorRenderer.registerArmorRenderer(BlueberryCandyArmorItem.class, BlueberryCandyArmorRenderer::new);
			GeoArmorRenderer.registerArmorRenderer(RaspberryCandyArmorItem.class, RaspberryCandyArmorRenderer::new);
			GeoArmorRenderer.registerArmorRenderer(OrangeCandyArmorItem.class, OrangeCandyArmorRenderer::new);
			GeoArmorRenderer.registerArmorRenderer(LemonCandyArmorItem.class, LemonCandyArmorRenderer::new);
			GeoArmorRenderer.registerArmorRenderer(LimeCandyArmorItem.class, LimeCandyArmorRenderer::new);
			GeoArmorRenderer.registerArmorRenderer(MangoCandyArmorItem.class, MangoCandyArmorRenderer::new);
			GeoArmorRenderer.registerArmorRenderer(PeachCandyArmorItem.class, PeachCandyArmorRenderer::new);

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
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANE_DOOR.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR.get(), RenderType.translucent());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYWAFFLEBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.VANILLAWAFFLEBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.TOFFEEWAFFLEBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATEWAFFLEBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYWAFFLEBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYWAFFLEBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYWAFFLEBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONWAFFLEBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGEWAFFLEBED.get(), RenderType.cutout());

			// ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANESUGARCANEBLOCK.get(), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYLANTERN.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYLAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYLAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYLAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYLAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGELAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGELOLLIPOPLAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONLOLLIPOPLAMP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONLAMP.get(), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYATTACKERTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYARCHERTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYHEALERTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYDEFENDERTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGEGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.MANGOGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.PEACHGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.PINEAPPLEGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.LIMEGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.APPLEGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.COLAGUMMYBEARTEDDY.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CHERRYGUMMYBEARTEDDY.get(), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYWOODWARDROBE.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYWOODBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYLEAVESCHAIR.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONOAKSTOVE.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONOAKTELEVISION.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONOAKDRAWERS.get(), RenderType.cutout());
//machines
			ItemBlockRenderTypes.setRenderLayer(BlockInit.ICE_CREAM_MACHINE.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BANANA_BAKER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.JAM_PRESSER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.WAFFLE_CONE_MACHINE.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CAKE_BAKER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.TEDDY_BEAR_PRINTER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANE_FURNACE.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYFLOSS_CRYSTALIZER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CREAMY_MILK_BLOCK.get(), RenderType.translucent());

			ItemBlockRenderTypes.setRenderLayer(FluidInit.CREAMY_MILK_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FluidInit.CREAMY_MILK_FLOWING.get(), RenderType.translucent());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.ROTTENMOULDYCANDYCANECHAINS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.ROTTENMOULDYCANDYCANEBARS.get(), RenderType.translucent());

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
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANE_DOOR.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR.get(), RenderType.translucent());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANEBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_2.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_3.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_4.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_GRASS.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_GRASS_LONG.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_SUGAR_CANE.get(), RenderType.cutout());


			ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYPLANT.get(), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.FROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYFROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYFROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYFROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYFROSTINGFLOWER.get(), RenderType.cutout());
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

			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CANDYCANEBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CANDY_CANE_FLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CANDY_CANE_FLOWER_2.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CANDY_CANE_FLOWER_3.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CANDY_CANE_FLOWER_4.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CANDY_CANE_GRASS.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CANDY_CANE_GRASS_LONG.get(), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_POISONBERRYPLANT.get(), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_FROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_STRAWBERRYFROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_RASPBERRYFROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_BLUEBERRYFROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_BLACKBERRYFROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_ORANGEFROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_LEMONFROSTINGFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CHOCOLATECINERARIA.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_TOFFEETULIP.get(), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_STRAWBERRYCANDYBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_RASPBERRYCANDYBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_BLUEBERRYCANDYBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_BLACKBERRYCANDYBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_RAINBOWCANDYBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_ORANGECANDYBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_LEMONCANDYBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_LIMECANDYBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_MANGOCANDYBUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_PEACHCANDYBUSH.get(), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_BLACKBERRYCONEFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_BLUEBERRYCONEFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_RASPBERRYCONEFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_STRAWBERRYCONEFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_ORANGECONEFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_LEMONCONEFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_VANILLACONEFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_TOFFEECONEFLOWER.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CHOCOLATECONEFLOWER.get(), RenderType.cutout());

			ItemBlockRenderTypes.setRenderLayer(BlockInit.BANANA_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.PEACH_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.MANGO_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.PINEAPPLE_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGE_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMON_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.LIME_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.VANILLA_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.MINT_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRY_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRY_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRY_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRY_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.CARROT_CROP.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYICECREAMBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYICECREAMBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGEICECREAMBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONICECREAMBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYICECREAMBED.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYICECREAMBED.get(), RenderType.cutout());

			MenuScreens.register(MenuTypesInit.ICE_CREAM_MACHINE_MENU.get(), IceCreamMachineScreen::new);
			MenuScreens.register(MenuTypesInit.BANANA_BAKER_MENU.get(), BananaBakerScreen::new);
			MenuScreens.register(MenuTypesInit.WAFFLE_CONE_MACHINE_MENU.get(), WaffleConeMachineScreen::new);
			MenuScreens.register(MenuTypesInit.JAM_PRESSER_MENU.get(), JamPresserScreen::new);
			MenuScreens.register(MenuTypesInit.CAKE_BAKER_MENU.get(), CakeBakerScreen::new);
			MenuScreens.register(MenuTypesInit.CANDYCANE_FURNACE_MENU.get(), CandycaneFurnaceScreen::new);
			MenuScreens.register(MenuTypesInit.CANDYFLOSS_CRYSTALIZER_MENU.get(), CandyflossCrystalizerScreen::new);
			MenuScreens.register(MenuTypesInit.TEDDY_BEAR_PRINTER_MENU.get(), TeddyBearPrinterScreen::new);

			registerChestScreen(MenuTypesInit.STRAWBERRY_CHEST);
			registerChestScreen(MenuTypesInit.WAFER_CHEST);
			registerChestScreen(MenuTypesInit.WAFER_CHEST_2);
		});
	}

	private static void registerChestScreen(RegistryObject<SNSChestMenuType> chestType) {
		MenuScreens.register(chestType.get(), SNSChestScreen::new);
	}

	@SubscribeEvent
	static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		/*/
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANAMONKEY.get(), BananaMonkeyRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANAMONKEYKING.get(), BananaMonkeyKingRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYARCHER.get(), PoisonBerryArcherRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYSPRITE.get(), PoisonBerrySpriteRenderer::new);

		/**/

		event.registerEntityRenderer(EntityTypesInit.SNSELF.get(), SNSElfRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSPUG.get(), SNSPugRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSICECREAMPUG.get(), SNSIceCreamPugRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSPARROT.get(), SNSParrotRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSICECREAMPARROT.get(), SNSIceCreamParrotRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSRABBIT.get(), SNSRabbitRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSPARFAITPIXIE.get(), SNSParfaitPixieRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSCCWOLF.get(), SNSCandyCaneWolfRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSMOUSE.get(), SNSMouseRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSSQUIRROLL.get(), SNSSquirrollRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSCHIPMUNK.get(), SNSChipmunkRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSZEBRA.get(), SNSZebraRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSWAFERSCHUND.get(), SNSWaferschundRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSTOAD.get(), SNSToadRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSGUMMYBEAR.get(), SNSGummyBearRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSBOARRY.get(), SNSBoarryRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSSPIDER.get(), SNSSpiderRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSCCCAT.get(), SNSCCCatRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSCOOKIECAT.get(), SNSCookieCatRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.ICECREAMCOW.get(), IceCreamCowRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSGP.get(), SNSGPRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSUNICORN.get(), SNSUnicornRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSJAMSTER.get(), SNSJamsterRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSSHEEP.get(), SNSSheepRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSLION.get(), SNSLionRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.CHOCOLATECHICKEN.get(), ChocolateChickenRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.BONBONBINI.get(), BonbonbiniRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSSNAKE.get(), SNSSnakeRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.GINGERBREAD_MAN.get(), GingerbreadManRenderer::new);

		event.registerEntityRenderer(EntityTypesInit.SNSCANDYCANEFISH.get(), SNSCandyCanefishRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSICFISH.get(), SNSICFishRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSWAFFLEFISH.get(), SNSWafflefishRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSWHALE.get(), SNSWhaleRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSANGELFISH.get(), SNSAngelFishRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSMINIWAFFLEFISH.get(), SNSMiniWafflefishRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.SNSDOLPHIN.get(), SNSDolphinRenderer::new);

		event.registerEntityRenderer(EntityTypesInit.SNSPRETZELFLY.get(), SNSPretzelflyRenderer::new);



		event.registerEntityRenderer(EntityTypesInit.POISONBERRYATTACKER.get(), PBAttackerRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.POISONBERRYDEFENDER.get(), PBDefenderRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.POISONBERRYARCHER.get(), PBArcherRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.CANDYCANECROOK.get(), CandyCaneCrookRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.RSWMUMMY.get(), RSWMummyRenderer::new);
		event.registerEntityRenderer(EntityTypesInit.MINTIMPERIAL.get(), MintImperialRenderer::new);

		event.registerEntityRenderer(EntityTypesInit.BOAT_ENTITY.get(), pContext -> new ModBoatRenderer(pContext, false));

		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_BLACKBERRY_BED_ENTITY_TYPE.get(), BlackberryIceCreamBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_STRAWBERRY_BLOCK_ENTITY_TYPE.get(), StrawberryIceCreamBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_RASPBERRY_BLOCK_ENTITY_TYPE.get(), RaspberryIceCreamBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_LEMON_BLOCK_ENTITY_TYPE.get(), LemonIceCreamBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_ORANGE_BLOCK_ENTITY_TYPE.get(), OrangeIceCreamBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_BLUEBERRY_BLOCK_ENTITY_TYPE.get(), BlueberryIceCreamBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_WAFFLE_BED_ENTITY_TYPE.get(), WaffleBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_STRAWBERRY_WAFFLE_BED_ENTITY_TYPE.get(), StrawberryWaffleBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_BLACKBERRY_WAFFLE_BED_ENTITY_TYPE.get(), BlackberryWaffleBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_RASPBERRY_WAFFLE_BED_ENTITY_TYPE.get(), RaspberryWaffleBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_BLUEBERRY_WAFFLE_BED_ENTITY_TYPE.get(), BlueberryWaffleBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_LEMON_WAFFLE_BED_ENTITY_TYPE.get(), LemonWaffleBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_ORANGE_WAFFLE_BED_ENTITY_TYPE.get(), OrangeWaffleBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_CHOCOLATE_WAFFLE_BED_ENTITY_TYPE.get(), ChocolateWaffleBedBeRenderer::new);
		event.registerBlockEntityRenderer(BlockEntityTypesInit.SNS_TOFFEE_WAFFLE_BED_ENTITY_TYPE.get(), ToffeeWaffleBedBeRenderer::new);

		registerChestRender(event, BlockInit.STRAWBERRY_CHEST, 14d, 10d);
		registerChestRender(event, BlockInit.WAFER_CHEST, 15d, 10d);
	}

	private static void registerChestRender(EntityRenderersEvent.RegisterRenderers event, RegistryObject<SNSChestBlock> blockReg, double axisDistance, double axisHeight) {
		SNSChestBlock block = blockReg.get();
		event.registerBlockEntityRenderer(block.blockEntity.get(), ctx-> new SNSChestRenderer(ctx, block, axisDistance / 16, axisHeight / 16));
	}
}
