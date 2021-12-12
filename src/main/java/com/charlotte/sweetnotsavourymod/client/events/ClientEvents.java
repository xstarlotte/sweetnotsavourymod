package com.charlotte.sweetnotsavourymod.client.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value= {Dist.CLIENT}, modid = SweetNotSavouryMod.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {
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
    public static void onClientSetup( ModelRegistryEvent event ) {
        /*ModelLoaderRegistry.blockMaterial(STRAWBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(STRAWBERRYICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer( BlockInit.STRAWBERRYICECREAMBED.get(), RenderType.cutout() );
        
        ModelLoader.addSpecialModel(BLACKBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(BLACKBERRYICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer( BlockInit.BLACKBERRYICECREAMBED.get(), RenderType.cutout() );
        
        ModelLoader.addSpecialModel(LEMONICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(LEMONICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer( BlockInit.LEMONICECREAMBED.get(), RenderType.cutout() );

        ModelLoader.addSpecialModel(BLUEBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(BLUEBERRYICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer( BlockInit.BLUEBERRYICECREAMBED.get(), RenderType.cutout() );
        
        ModelLoader.addSpecialModel(RASPBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(RASPBERRYICECREAMBEDHEAD);*/
        // ItemBlockRenderTypes.setRenderLayer( BlockInit.RASPBERRYICECREAMBED.get(), RenderType.cutout());

        // ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANESUGARCANEBLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANEBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYPLANT.get(), RenderType.cutout());
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
    }

    @SubscribeEvent
    public static void onClientSetup( FMLClientSetupEvent event){
        // ClientRegistry.bindTileEntityRenderer( BlockEntityTypesInit.STRAWBERRYICECREAMBED_TILE_ENTITY_TYPE.get(), StrawberryIceCreamBedBeRenderer::new);
        // ClientRegistry.bindTileEntityRenderer( BlockEntityTypesInit.BLACKBERRYICECREAMBED_TILE_ENTITY_TYPE.get(), BlackberryIceCreamBedBeRenderer::new);
        // ClientRegistry.bindTileEntityRenderer( BlockEntityTypesInit.BLUEBERRYICECREAMBED_TILE_ENTITY_TYPE.get(), BlueberryIceCreamBedBeRenderer::new);
        // ClientRegistry.bindTileEntityRenderer( BlockEntityTypesInit.RASPBERRYICECREAMBED_TILE_ENTITY_TYPE.get(), RaspberryIceCreamBedBeRenderer::new);
        // ClientRegistry.bindTileEntityRenderer( BlockEntityTypesInit.LEMONICECREAMBED_TILE_ENTITY_TYPE.get(), LemonIceCreamBedBeRenderer::new);
    }
}
