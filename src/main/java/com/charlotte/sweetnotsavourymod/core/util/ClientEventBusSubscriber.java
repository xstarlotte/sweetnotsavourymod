package com.charlotte.sweetnotsavourymod.core.util;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryParfaitPixieRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryPigRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryWaferschundRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ToffeeToadRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ZebraCakeZebraRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.elves.BlueberryElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.elves.LemonElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.elves.OrangeElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.elves.RaspberryElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.elves.StrawberryElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.elves.VanillaElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.mice.HazelnutCheesecakeMouseRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.mice.MarshmallowPieMouseRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.mice.StrawberryCheesecakeMouseRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.monkeys.BananaMonkeyKingRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.monkeys.BananaMonkeyRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.BlueberryIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.BlueberryParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.ChocolateIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.LemonIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.LemonParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.OrangeIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.OrangeParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.PeachIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.PeachParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.PineappleParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.RaspberryIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.RaspberryParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.StrawberryIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.StrawberryParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.ToffeeIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.poisonberries.PoisonBerryArcherRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.poisonberries.PoisonBerryAttackerRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.poisonberries.PoisonBerrySpriteRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.BlueberryIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.BlueberryPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.ChocolateIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.ChocolatePugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.LemonPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.OrangeIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.OrangePugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.RaspberryIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.RaspberryPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.StrawberryIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.StrawberryPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.ToffeeIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.ToffeePugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.AngelCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.BananaBreadRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.CarrotCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.ChocolateCherryCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.LemonCurdCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.RedVelvetCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.VanillaCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.squirrels.CinnamonSquirrollRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.squirrels.StrawberrySwissSquirrollRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.wolves.CandyCaneWolfRenderer;
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
		
		RenderTypeLookup.setRenderLayer(BlockInit.ORANGELAMP.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYLOLLIPOPLAMP.get(), RenderType.getCutout());
		
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYLOLLIPOPLAMP.get(), RenderType.getCutout());
        
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYLOLLIPOPLAMP.get(), RenderType.getCutout());
        
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYLOLLIPOPLAMP.get(), RenderType.getCutout());
        
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGELOLLIPOPLAMP.get(), RenderType.getCutout());
        
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONLOLLIPOPLAMP.get(), RenderType.getCutout());
        
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYARCHER.get(), PoisonBerryArcherRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYSPRITE.get(), PoisonBerrySpriteRenderer::new);
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYWAFERSCHUND.get(), StrawberryWaferschundRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYPARFAITPIXIE.get(), StrawberryParfaitPixieRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BLUEBERRYPARFAITPIXIE.get(), BlueberryParfaitPixieRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYCHEESECAKEMOUSE.get(), StrawberryCheesecakeMouseRenderer::new);
		
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
		
	//parrot
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.LEMONPARROT.get(), LemonParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYPARROT.get(), manager -> new StrawberryParrotRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.PINEAPPLEPARROT.get(), manager -> new PineappleParrotRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BLUEBERRYPARROT.get(), manager -> new BlueberryParrotRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.RASPBERRYPARROT.get(), manager -> new RaspberryParrotRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.PEACHPARROT.get(), manager -> new PeachParrotRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ORANGEICECREAMPARROT.get(), manager -> new OrangeIceCreamParrotRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ORANGEPARROT.get(), manager -> new OrangeParrotRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.PEACHICECREAMPARROT.get(), manager -> new PeachIceCreamParrotRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.TOFFEEICECREAMPARROT.get(), manager -> new ToffeeIceCreamParrotRenderer(manager));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.LEMONICECREAMPARROT.get(), LemonIceCreamParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYICECREAMPARROT.get(), StrawberryIceCreamParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.RASPBERRYICECREAMPARROT.get(), RaspberryIceCreamParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BLUEBERRYICECREAMPARROT.get(), BlueberryIceCreamParrotRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CHOCOLATEICECREAMPARROT.get(), ChocolateIceCreamParrotRenderer::new);
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CANDYCANEWOLF.get(), manager -> new CandyCaneWolfRenderer(manager));
	}

}
