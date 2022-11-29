package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.block.SNSChestBlock;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.icecream.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.waffle.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.chest.SNSChestRenderer;
import com.charlotte.sweetnotsavourymod.common.screen.*;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuType;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestScreen;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.FluidInit;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = SweetNotSavouryMod.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
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
    public static void onClientSetup(ModelRegistryEvent event) {
        ModelLoader.addSpecialModel(BLACKBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(BLACKBERRYICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYICECREAMBED.get(), RenderType.cutout());

        ModelLoader.addSpecialModel(BLUEBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(BLUEBERRYICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYICECREAMBED.get(), RenderType.cutout());


        ModelLoader.addSpecialModel(LEMONICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(LEMONICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONICECREAMBED.get(), RenderType.cutout());

        ModelLoader.addSpecialModel(ORANGEICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(ORANGEICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGEICECREAMBED.get(), RenderType.cutout());

        ModelLoader.addSpecialModel(RASPBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(RASPBERRYICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYICECREAMBED.get(), RenderType.cutout());

        ModelLoader.addSpecialModel(STRAWBERRYICECREAMBEDBOTTOM);
        ModelLoader.addSpecialModel(STRAWBERRYICECREAMBEDHEAD);
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYICECREAMBED.get(), RenderType.cutout());

        addChestSpecialModel(BlockInit.STRAWBERRY_CHEST);
        addChestSpecialModel(BlockInit.WAFER_CHEST);

        ModelLoader.addSpecialModel(WAFFLEBEDBOTTOM);
        ModelLoader.addSpecialModel(WAFFLEBEDHEAD);

        ModelLoader.addSpecialModel(STRAWBERRYWAFFLEBEDBOTTOM);
        ModelLoader.addSpecialModel(STRAWBERRYWAFFLEBEDHEAD);

        ModelLoader.addSpecialModel(RASPBERRYWAFFLEBEDBOTTOM);
        ModelLoader.addSpecialModel(RASPBERRYWAFFLEBEDHEAD);

        ModelLoader.addSpecialModel(BLACKBERRYWAFFLEBEDBOTTOM);
        ModelLoader.addSpecialModel(BLACKBERRYWAFFLEBEDHEAD);

        ModelLoader.addSpecialModel(BLUEBERRYWAFFLEBEDBOTTOM);
        ModelLoader.addSpecialModel(BLUEBERRYWAFFLEBEDHEAD);

        ModelLoader.addSpecialModel(ORANGEWAFFLEBEDBOTTOM);
        ModelLoader.addSpecialModel(ORANGEWAFFLEBEDHEAD);

        ModelLoader.addSpecialModel(LEMONWAFFLEBEDBOTTOM);
        ModelLoader.addSpecialModel(LEMONWAFFLEBEDHEAD);

        ModelLoader.addSpecialModel(CHOCOLATEWAFFLEBEDBOTTOM);
        ModelLoader.addSpecialModel(CHOCOLATEWAFFLEBEDHEAD);

        ModelLoader.addSpecialModel(TOFFEEWAFFLEBEDBOTTOM);
        ModelLoader.addSpecialModel(TOFFEEWAFFLEBEDHEAD);

        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYWAFFLEBED.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.VANILLAWAFFLEBED.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.TOFFEEWAFFLEBED.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATEWAFFLEBED.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYWAFFLEBED.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYWAFFLEBED.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYWAFFLEBED.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONWAFFLEBED.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGEWAFFLEBED.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANESUGARCANEBLOCK.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYLANTERN.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYLAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYLAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYLAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYLAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGELAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYLOLLIPOPLAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGELOLLIPOPLAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONLOLLIPOPLAMP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONLAMP.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYATTACKERTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYARCHERTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYHEALERTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYDEFENDERTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGEGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MANGOGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PEACHGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PINEAPPLEGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIMEGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.APPLEGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.COLAGUMMYBEARTEDDY.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CHERRYGUMMYBEARTEDDY.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYWOODWARDROBE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYWOODBED.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYLEAVESCHAIR.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POISONOAKSTOVE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POISONOAKTELEVISION.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POISONOAKDRAWERS.get(), RenderType.cutout());
//machines
        RenderTypeLookup.setRenderLayer(BlockInit.ICE_CREAM_MACHINE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BANANA_BAKER.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.JAM_PRESSER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.WAFFLE_CONE_MACHINE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CAKE_BAKER.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.TEDDY_BEAR_PRINTER.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANE_FURNACE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CANDYFLOSS_CRYSTALIZER.get(), RenderType.translucent());

        RenderTypeLookup.setRenderLayer(FluidInit.CREAMY_MILK_BLOCK.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(FluidInit.CREAMY_MILK_FLUID.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(FluidInit.CREAMY_MILK_FLOWING.get(), RenderType.translucent());

        RenderTypeLookup.setRenderLayer(BlockInit.ROTTENMOULDYCANDYCANECHAINS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.ROTTENMOULDYCANDYCANEBARS.get(), RenderType.translucent());

        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRY_CANDY_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRY_CANDY_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRY_CANDY_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRY_CANDY_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMON_CANDY_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_CANDY_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.LIME_CANDY_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.MANGO_CANDY_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.PEACH_CANDY_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CANDYFLOSS_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.WAFER_WOOD_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATE_WAFER_WOOD_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.WAFER_PLANK_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATE_WAFER_PLANK_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.FROSTING_DOOR.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR.get(), RenderType.translucent());

        RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANEBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_FLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_2.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_3.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_FLOWER_4.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_GRASS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CANDY_CANE_GRASS_LONG.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.POISONBERRYPLANT.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.FROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGEFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATECINERARIA.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.TOFFEETULIP.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RAINBOWCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGECANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIMECANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MANGOCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PEACHCANDYBUSH.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRYCONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRYCONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRYCONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRYCONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGECONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMONCONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.VANILLACONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.TOFFEECONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CHOCOLATECONEFLOWER.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_CANDYCANEBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_CANDY_CANE_FLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_CANDY_CANE_FLOWER_2.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_CANDY_CANE_FLOWER_3.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_CANDY_CANE_FLOWER_4.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_CANDY_CANE_GRASS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_CANDY_CANE_GRASS_LONG.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_POISONBERRYPLANT.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_FROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_STRAWBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_RASPBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_BLUEBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_BLACKBERRYFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_ORANGEFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_LEMONFROSTINGFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_CHOCOLATECINERARIA.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_TOFFEETULIP.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_STRAWBERRYCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_RASPBERRYCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_BLUEBERRYCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_BLACKBERRYCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_RAINBOWCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_ORANGECANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_LEMONCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_LIMECANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_MANGOCANDYBUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_PEACHCANDYBUSH.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_BLACKBERRYCONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_BLUEBERRYCONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_RASPBERRYCONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_STRAWBERRYCONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_ORANGECONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_LEMONCONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_VANILLACONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_TOFFEECONEFLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.POTTED_CHOCOLATECONEFLOWER.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlockInit.BANANA_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PEACH_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MANGO_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PINEAPPLE_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ORANGE_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LEMON_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.LIME_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.VANILLA_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MINT_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLUEBERRY_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLACKBERRY_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.STRAWBERRY_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RASPBERRY_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CARROT_CROP.get(), RenderType.cutout());

    }

    private static void addChestSpecialModel(RegistryObject<SNSChestBlock> chestReg) {
        ResourceLocation id = chestReg.getId();
        String ns = id.getNamespace();
        String path = id.getPath();

        ModelLoader.addSpecialModel(new ResourceLocation(ns, "block/" + path + "_base"));
        ModelLoader.addSpecialModel(new ResourceLocation(ns, "block/" + path + "_lid"));

        if (chestReg.get().doubleAble) {
            ModelLoader.addSpecialModel(new ResourceLocation(ns, "block/" + path + "_base2"));
            ModelLoader.addSpecialModel(new ResourceLocation(ns, "block/" + path + "_lid2"));
        }
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_BLACKBERRY_BED_ENTITY_TYPE.get(), BlackberryIceCreamBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_STRAWBERRY_BLOCK_ENTITY_TYPE.get(), StrawberryIceCreamBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_RASPBERRY_BLOCK_ENTITY_TYPE.get(), RaspberryIceCreamBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_LEMON_BLOCK_ENTITY_TYPE.get(), LemonIceCreamBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_ORANGE_BLOCK_ENTITY_TYPE.get(), OrangeIceCreamBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_BLUEBERRY_BLOCK_ENTITY_TYPE.get(), BlueberryIceCreamBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_WAFFLE_BED_ENTITY_TYPE.get(), WaffleBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_STRAWBERRY_WAFFLE_BED_ENTITY_TYPE.get(), StrawberryWaffleBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_BLACKBERRY_WAFFLE_BED_ENTITY_TYPE.get(), BlackberryWaffleBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_RASPBERRY_WAFFLE_BED_ENTITY_TYPE.get(), RaspberryWaffleBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_BLUEBERRY_WAFFLE_BED_ENTITY_TYPE.get(), BlueberryWaffleBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_LEMON_WAFFLE_BED_ENTITY_TYPE.get(), LemonWaffleBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_ORANGE_WAFFLE_BED_ENTITY_TYPE.get(), OrangeWaffleBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_CHOCOLATE_WAFFLE_BED_ENTITY_TYPE.get(), ChocolateWaffleBedBeRenderer::new);
        ClientRegistry.bindTileEntityRenderer(BlockEntityTypesInit.SNS_TOFFEE_WAFFLE_BED_ENTITY_TYPE.get(), ToffeeWaffleBedBeRenderer::new);



        ScreenManager.register(MenuTypesInit.ICE_CREAM_MACHINE_MENU.get(), IceCreamMachineScreen::new);
        ScreenManager.register(MenuTypesInit.BANANA_BAKER_MENU.get(), BananaBakerScreen::new);
        ScreenManager.register(MenuTypesInit.WAFFLE_CONE_MACHINE_MENU.get(), WaffleConeMachineScreen::new);
        ScreenManager.register(MenuTypesInit.JAM_PRESSER_MENU.get(), JamPresserScreen::new);
        ScreenManager.register(MenuTypesInit.CAKE_BAKER_MENU.get(), CakeBakerScreen::new);
        ScreenManager.register(MenuTypesInit.CANDYCANE_FURNACE_MENU.get(), CandycaneFurnaceScreen::new);
        ScreenManager.register(MenuTypesInit.CANDYFLOSS_CRYSTALIZER_MENU.get(), CandyflossCrystalizerScreen::new);
        ScreenManager.register(MenuTypesInit.TEDDY_BEAR_PRINTER_MENU.get(), TeddyBearPrinterScreen::new);

        registerChestScreen(MenuTypesInit.STRAWBERRY_CHEST);
        registerChestScreen(MenuTypesInit.WAFER_CHEST);
        registerChestScreen(MenuTypesInit.WAFER_CHEST_2);

        registerChestRender(BlockInit.STRAWBERRY_CHEST, 14d, 10d);
        registerChestRender(BlockInit.WAFER_CHEST, 15d, 10d);
    }

    private static void registerChestScreen(RegistryObject<SNSChestMenuType> chestType) {
        ScreenManager.register(chestType.get(), SNSChestScreen::new);
    }

    private static void registerChestRender(RegistryObject<SNSChestBlock> blockReg, double axisDistance, double axisHeight) {
        SNSChestBlock block = blockReg.get();
        ClientRegistry.bindTileEntityRenderer(block.blockEntity.get(), ctx->new SNSChestRenderer(ctx, block, axisDistance / 16, axisHeight / 16));
    }
}
