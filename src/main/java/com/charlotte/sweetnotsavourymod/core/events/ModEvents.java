package com.charlotte.sweetnotsavourymod.core.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.block.StrawberryIceCreamBed;
import com.charlotte.sweetnotsavourymod.common.tileentities.renderers.StrawberryIceCreamBedTeRenderer;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value= {Dist.CLIENT}, modid = SweetNotSavouryMod.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents{
    public static final ResourceLocation STRAWBERRYICECREAMBED = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/strawberryicecreambed");

    @SubscribeEvent
    public static void onClientSetup( ModelRegistryEvent event ){
        ModelLoader.addSpecialModel(STRAWBERRYICECREAMBED);
        RenderTypeLookup.setRenderLayer( BlockInit.STRAWBERRYICECREAMBED.get(), RenderType.getCutout() );
    }

    @SubscribeEvent
    public static void onClientSetup( FMLClientSetupEvent event){
        ClientRegistry.bindTileEntityRenderer( TileEntityTypesInit.STRAWBERRYICECREAMBED_TILE_ENTITY_TYPE.get(), StrawberryIceCreamBedTeRenderer::new);
    }
}
