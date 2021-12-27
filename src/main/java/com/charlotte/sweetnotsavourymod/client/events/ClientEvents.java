package com.charlotte.sweetnotsavourymod.client.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.blockentities.renderers.beds.*;
import com.charlotte.sweetnotsavourymod.common.screen.IceCreamMachineScreen;
import com.charlotte.sweetnotsavourymod.common.screen.MenuTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ForgeModelBakery;
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
        ForgeModelBakery.addSpecialModel(BLACKBERRYICECREAMBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(BLACKBERRYICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYICECREAMBED.get(), RenderType.cutout());

        ForgeModelBakery.addSpecialModel(BLUEBERRYICECREAMBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(BLUEBERRYICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYICECREAMBED.get(), RenderType.cutout());


        ForgeModelBakery.addSpecialModel(LEMONICECREAMBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(LEMONICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONICECREAMBED.get(), RenderType.cutout());

        ForgeModelBakery.addSpecialModel(RASPBERRYICECREAMBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(RASPBERRYICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYICECREAMBED.get(), RenderType.cutout());

        ForgeModelBakery.addSpecialModel(STRAWBERRYICECREAMBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(STRAWBERRYICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYICECREAMBED.get(), RenderType.cutout());

        // ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANESUGARCANEBLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANEBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYPLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.FROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGEFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONFROSTINGFLOWER.get(), RenderType.cutout());
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
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ICE_CREAM_MACHINE.get(), RenderType.cutout());

        MenuScreens.register(MenuTypesInit.ICE_CREAM_MACHINE_MENU.get(), IceCreamMachineScreen::new);

    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_BLACKBERRY_BED_ENTITY_TYPE.get(), BlackberryIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_STRAWBERRY_BLOCK_ENTITY_TYPE.get(), StrawberryIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_RASPBERRY_BLOCK_ENTITY_TYPE.get(), RaspberryIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_LEMON_BLOCK_ENTITY_TYPE.get(), LemonIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_BLUEBERRY_BLOCK_ENTITY_TYPE.get(), BlueberryIceCreamBedBeRenderer::new);
    }
}
