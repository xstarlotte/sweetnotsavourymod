package com.charlotte.sweetnotsavourymod.client.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.blockentities.renderers.beds.*;
import com.charlotte.sweetnotsavourymod.common.screen.IceCreamMachineScreen;
import com.charlotte.sweetnotsavourymod.common.screen.MenuTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.FluidInit;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.BeaconBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.entity.BeaconBlockEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ForgeModelBakery;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

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

    public static final ResourceLocation ORANGEICECREAMBEDHEAD = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/orangeicecreambedheadpart");
    public static final ResourceLocation ORANGEICECREAMBEDBOTTOM = new ResourceLocation( SweetNotSavouryMod.MOD_ID, "block/orangeicecreambedbottompart");
    
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

        ForgeModelBakery.addSpecialModel(ORANGEICECREAMBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(ORANGEICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGEICECREAMBED.get(), RenderType.cutout());

        ForgeModelBakery.addSpecialModel(RASPBERRYICECREAMBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(RASPBERRYICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYICECREAMBED.get(), RenderType.cutout());

        ForgeModelBakery.addSpecialModel(STRAWBERRYICECREAMBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(STRAWBERRYICECREAMBEDHEAD);
        ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYICECREAMBED.get(), RenderType.cutout());

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

        ItemBlockRenderTypes.setRenderLayer(BlockInit.ICE_CREAM_MACHINE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(FluidInit.CREAMY_MILK_BLOCK.get(), RenderType.translucent());
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
        ItemBlockRenderTypes.setRenderLayer(BlockInit.WAFER_WOOD_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATE_WAFER_WOOD_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.WAFER_PLANK_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATE_WAFER_PLANK_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.FROSTING_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYCANEBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_3.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_4.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_GRASS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDY_CANE_GRASS_LONG.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.POISONBERRYPLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.FROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGEFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONFROSTINGFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CHOCOLATECINERARIA.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRYCANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRYCANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRYCANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRYCANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.RAINBOWCANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGECANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.LEMONCANDYBUSH.get(), RenderType.cutout());

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

        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_STRAWBERRYCANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_RASPBERRYCANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_BLUEBERRYCANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_BLACKBERRYCANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_RAINBOWCANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_ORANGECANDYBUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_LEMONCANDYBUSH.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_BLACKBERRYCONEFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_BLUEBERRYCONEFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_RASPBERRYCONEFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_STRAWBERRYCONEFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_ORANGECONEFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_LEMONCONEFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_VANILLACONEFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_TOFFEECONEFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CHOCOLATECONEFLOWER.get(), RenderType.cutout());

    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_BLACKBERRY_BED_ENTITY_TYPE.get(), BlackberryIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_STRAWBERRY_BLOCK_ENTITY_TYPE.get(), StrawberryIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_RASPBERRY_BLOCK_ENTITY_TYPE.get(), RaspberryIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_LEMON_BLOCK_ENTITY_TYPE.get(), LemonIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_ORANGE_BLOCK_ENTITY_TYPE.get(), OrangeIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_BLUEBERRY_BLOCK_ENTITY_TYPE.get(), BlueberryIceCreamBedBeRenderer::new);
        MenuScreens.register(MenuTypesInit.ICE_CREAM_MACHINE_MENU.get(), IceCreamMachineScreen::new);
    }
}
