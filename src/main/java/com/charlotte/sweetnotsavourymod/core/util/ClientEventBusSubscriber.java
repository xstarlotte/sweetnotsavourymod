package com.charlotte.sweetnotsavourymod.core.util;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.AngelCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.BananaBreadRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.BananaMonkeyKingRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.BananaMonkeyRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.BlueberryElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.BlueberryIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.BlueberryIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.CandyCaneWolfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.CarrotCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ChocolateCherryCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ChocolateIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ChocolateIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.CinnamonSquirrollRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.LemonCurdCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.LemonElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.LemonIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.LemonParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.LemonPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.OrangeElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.PoisonBerryArcherRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.PoisonBerryAttackerRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.PoisonBerrySpriteRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.RaspberryElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.RaspberryIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.RaspberryIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.RedVelvetCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryPigRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberrySwissSquirrollRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryWaferschundRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ToffeeIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ToffeeToadRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.VanillaCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.VanillaElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ZebraCakeZebraRenderer;
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

@Mod.EventBusSubscriber(modid = SweetNotSavouryMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		
		RenderTypeLookup.setRenderLayer(BlockInit.RAINBOWFROSTINGLEAVES.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.ICECREAMTREESAPLING.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYPLANT.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANEBUSH.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.FROSTINGFLOWER.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATECINERARIA.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYCANDYBUSH.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYCANDYBUSH.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYCANDYBUSH.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGECANDYBUSH.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.LEMONCANDYBUSH.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.FROSTINGGRASS.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYLANTERN.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYLAMP.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYLAMP.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYLAMP.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYLAMP.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.LEMONLAMP.get(), RenderType.getCutout());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYARCHER.get(), PoisonBerryArcherRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYSPRITE.get(), PoisonBerrySpriteRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYWAFERSCHUND.get(), StrawberryWaferschundRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYPUG.get(), manager -> new StrawberryPugRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.LEMONPUG.get(), manager -> new LemonPugRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.TOFFEEICECREAMPUG.get(), ToffeeIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BLUEBERRYICECREAMPUG.get(), BlueberryIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CHOCOLATEICECREAMPUG.get(), ChocolateIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.RASPBERRYICECREAMPUG.get(), RaspberryIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYICECREAMPUG.get(), StrawberryIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYELF.get(), manager -> new StrawberryElfRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BLUEBERRYELF.get(), manager -> new BlueberryElfRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.LEMONELF.get(), manager -> new LemonElfRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ORANGEELF.get(), manager -> new OrangeElfRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.VANILLAELF.get(), manager -> new VanillaElfRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.RASPBERRYELF.get(), manager -> new RaspberryElfRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYPIG.get(), StrawberryPigRenderer::new);
		
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
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.LEMONPARROT.get(), LemonParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.LEMONICECREAMPARROT.get(), LemonIceCreamParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYICECREAMPARROT.get(), StrawberryIceCreamParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.RASPBERRYICECREAMPARROT.get(), RaspberryIceCreamParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BLUEBERRYICECREAMPARROT.get(), BlueberryIceCreamParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CHOCOLATEICECREAMPARROT.get(), ChocolateIceCreamParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CANDYCANEWOLF.get(), manager -> new CandyCaneWolfRenderer(manager));
	}

}
