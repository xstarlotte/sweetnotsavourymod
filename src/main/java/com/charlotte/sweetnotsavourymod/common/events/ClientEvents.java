package com.charlotte.sweetnotsavourymod.common.events;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.icecream.*;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.bedrenderers.waffle.*;
import com.charlotte.sweetnotsavourymod.common.screen.*;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestMenuType;
import com.charlotte.sweetnotsavourymod.common.screen.chest.SNSChestScreen;
import com.charlotte.sweetnotsavourymod.core.init.BlockEntityTypesInit;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.charlotte.sweetnotsavourymod.core.init.FluidInit;
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
import net.minecraftforge.registries.RegistryObject;

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

        ForgeModelBakery.addSpecialModel(WAFFLEBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(WAFFLEBEDHEAD);

        ForgeModelBakery.addSpecialModel(STRAWBERRYWAFFLEBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(STRAWBERRYWAFFLEBEDHEAD);

        ForgeModelBakery.addSpecialModel(RASPBERRYWAFFLEBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(RASPBERRYWAFFLEBEDHEAD);

        ForgeModelBakery.addSpecialModel(BLACKBERRYWAFFLEBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(BLACKBERRYWAFFLEBEDHEAD);

        ForgeModelBakery.addSpecialModel(BLUEBERRYWAFFLEBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(BLUEBERRYWAFFLEBEDHEAD);

        ForgeModelBakery.addSpecialModel(ORANGEWAFFLEBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(ORANGEWAFFLEBEDHEAD);

        ForgeModelBakery.addSpecialModel(LEMONWAFFLEBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(LEMONWAFFLEBEDHEAD);

        ForgeModelBakery.addSpecialModel(CHOCOLATEWAFFLEBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(CHOCOLATEWAFFLEBEDHEAD);

        ForgeModelBakery.addSpecialModel(TOFFEEWAFFLEBEDBOTTOM);
        ForgeModelBakery.addSpecialModel(TOFFEEWAFFLEBEDHEAD);

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
        ItemBlockRenderTypes.setRenderLayer(BlockInit.LIME_CANDY_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.MANGO_CANDY_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PEACH_CANDY_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CANDYFLOSS_DOOR.get(), RenderType.translucent());
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

    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_BLACKBERRY_BED_ENTITY_TYPE.get(), BlackberryIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_STRAWBERRY_BLOCK_ENTITY_TYPE.get(), StrawberryIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_RASPBERRY_BLOCK_ENTITY_TYPE.get(), RaspberryIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_LEMON_BLOCK_ENTITY_TYPE.get(), LemonIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_ORANGE_BLOCK_ENTITY_TYPE.get(), OrangeIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_BLUEBERRY_BLOCK_ENTITY_TYPE.get(), BlueberryIceCreamBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_WAFFLE_BED_ENTITY_TYPE.get(), WaffleBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_STRAWBERRY_WAFFLE_BED_ENTITY_TYPE.get(), StrawberryWaffleBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_BLACKBERRY_WAFFLE_BED_ENTITY_TYPE.get(), BlackberryWaffleBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_RASPBERRY_WAFFLE_BED_ENTITY_TYPE.get(), RaspberryWaffleBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_BLUEBERRY_WAFFLE_BED_ENTITY_TYPE.get(), BlueberryWaffleBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_LEMON_WAFFLE_BED_ENTITY_TYPE.get(), LemonWaffleBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_ORANGE_WAFFLE_BED_ENTITY_TYPE.get(), OrangeWaffleBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_CHOCOLATE_WAFFLE_BED_ENTITY_TYPE.get(), ChocolateWaffleBedBeRenderer::new);
        BlockEntityRenderers.register(BlockEntityTypesInit.SNS_TOFFEE_WAFFLE_BED_ENTITY_TYPE.get(), ToffeeWaffleBedBeRenderer::new);



        MenuScreens.register(MenuTypesInit.ICE_CREAM_MACHINE_MENU.get(), IceCreamMachineScreen::new);
        MenuScreens.register(MenuTypesInit.BANANA_BAKER_MENU.get(), BananaBakerScreen::new);
        MenuScreens.register(MenuTypesInit.WAFFLE_CONE_MACHINE_MENU.get(), WaffleConeMachineScreen::new);
        MenuScreens.register(MenuTypesInit.JAM_PRESSER_MENU.get(), JamPresserScreen::new);
        MenuScreens.register(MenuTypesInit.CAKE_BAKER_MENU.get(), CakeBakerScreen::new);
        MenuScreens.register(MenuTypesInit.CANDYCANE_FURNACE_MENU.get(), CandycaneFurnaceScreen::new);
        MenuScreens.register(MenuTypesInit.CANDYFLOSS_CRYSTALIZER_MENU.get(), CandyflossCrystalizerScreen::new);
        MenuScreens.register(MenuTypesInit.TEDDY_BEAR_PRINTER_MENU.get(), TeddyBearPrinterScreen::new);

        registerChest(MenuTypesInit.STRAWBERRY_CHEST, 15F, 10F);
        registerChest(MenuTypesInit.WAFFLE_CHEST, 15F, 10F);
        registerChest(MenuTypesInit.WAFFLE_CHEST_2, 15F, 10F);
    }

    private static void registerChest(RegistryObject<SNSChestMenuType> chestType, double axisDistance, double axisHeight) {
        MenuScreens.register(chestType.get(), SNSChestScreen::new);
        //TODO register render
    }
}
