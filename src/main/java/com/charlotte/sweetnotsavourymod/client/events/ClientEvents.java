package com.charlotte.sweetnotsavourymod.client.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.tileentities.renderers.beds.BlackberryIceCreamBedTeRenderer;
import com.charlotte.sweetnotsavourymod.common.tileentities.renderers.beds.BlueberryIceCreamBedTeRenderer;
import com.charlotte.sweetnotsavourymod.common.tileentities.renderers.beds.LemonIceCreamBedTeRenderer;
import com.charlotte.sweetnotsavourymod.common.tileentities.renderers.beds.RaspberryIceCreamBedTeRenderer;
import com.charlotte.sweetnotsavourymod.common.tileentities.renderers.beds.StrawberryIceCreamBedTeRenderer;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.TileEntityTypesInit;

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
public class ClientEvents{
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
    
    @SubscribeEvent
    public static void onClientSetup( ModelRegistryEvent event ){
        ModelLoader.addSpecialModel(STRAWBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(STRAWBERRYICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer( BlockInit.STRAWBERRYICECREAMBED.get(), RenderType.getCutout() );
        
        ModelLoader.addSpecialModel(BLACKBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(BLACKBERRYICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer( BlockInit.BLACKBERRYICECREAMBED.get(), RenderType.getCutout() );
        
        ModelLoader.addSpecialModel(LEMONICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(LEMONICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer( BlockInit.LEMONICECREAMBED.get(), RenderType.getCutout() );
        
        ModelLoader.addSpecialModel(BLUEBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(BLUEBERRYICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer( BlockInit.BLUEBERRYICECREAMBED.get(), RenderType.getCutout() );
        
        ModelLoader.addSpecialModel(RASPBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(RASPBERRYICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer( BlockInit.RASPBERRYICECREAMBED.get(), RenderType.getCutout() );
        
        RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANESUGARCANEBLOCK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANEBUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYPLANT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYLANTERN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGELAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYLOLLIPOPLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYLOLLIPOPLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYLOLLIPOPLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYLOLLIPOPLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGELOLLIPOPLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONLOLLIPOPLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONLAMP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYCHEST.get(), RenderType.getCutout());
    }

    @SubscribeEvent
    public static void onClientSetup( FMLClientSetupEvent event){
        ClientRegistry.bindTileEntityRenderer( TileEntityTypesInit.STRAWBERRYICECREAMBED_TILE_ENTITY_TYPE.get(), StrawberryIceCreamBedTeRenderer::new);
        
        ClientRegistry.bindTileEntityRenderer( TileEntityTypesInit.BLACKBERRYICECREAMBED_TILE_ENTITY_TYPE.get(), BlackberryIceCreamBedTeRenderer::new);
        
        ClientRegistry.bindTileEntityRenderer( TileEntityTypesInit.BLUEBERRYICECREAMBED_TILE_ENTITY_TYPE.get(), BlueberryIceCreamBedTeRenderer::new);
        
        ClientRegistry.bindTileEntityRenderer( TileEntityTypesInit.RASPBERRYICECREAMBED_TILE_ENTITY_TYPE.get(), RaspberryIceCreamBedTeRenderer::new);
        
        ClientRegistry.bindTileEntityRenderer( TileEntityTypesInit.LEMONICECREAMBED_TILE_ENTITY_TYPE.get(), LemonIceCreamBedTeRenderer::new);
    }
    
    
}
