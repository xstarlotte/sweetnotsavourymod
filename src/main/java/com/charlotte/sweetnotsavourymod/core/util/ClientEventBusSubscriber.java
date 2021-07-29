package com.charlotte.sweetnotsavourymod.core.util;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.AngelCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.BananaBreadRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.BlueberryIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.CarrotCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ChocolateCherryCakeRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ChocolateIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.PoisonBerryAttackerRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.RaspberryIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryPigRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.StrawberryPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ToffeeIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.ZebraCakeZebraRenderer;
import com.charlotte.sweetnotsavourymod.core.init.EntityTypesInit;

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
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.POISONBERRYATTACKER.get(), PoisonBerryAttackerRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYPUG.get(), StrawberryPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.TOFFEEICECREAMPUG.get(), ToffeeIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BLUEBERRYICECREAMPUG.get(), BlueberryIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CHOCOLATEICECREAMPUG.get(), ChocolateIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.RASPBERRYICECREAMPUG.get(), RaspberryIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYICECREAMPUG.get(), StrawberryIceCreamPugRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYELF.get(), StrawberryElfRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.STRAWBERRYPIG.get(), StrawberryPigRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CARROTCAKERABBIT.get(), CarrotCakeRabbitRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.CHOCOLATECHERRYCAKERABBIT.get(), ChocolateCherryCakeRabbitRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BANANABREADRABBIT.get(), BananaBreadRabbitRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ANGELCAKERABBIT.get(), AngelCakeRabbitRenderer::new);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.ZEBRACAKEZEBRA.get(), ZebraCakeZebraRenderer::new);
		
	}

}
