package com.charlotte.sweetnotsavourymod.common.painting;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPaintings {
    public static final DeferredRegister<PaintingType> PAINTING_MOTIVES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, SweetNotSavouryMod.MOD_ID);

    public static final RegistryObject<PaintingType> PLAIN = PAINTING_MOTIVES.register("plain",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> CANDYCANE = PAINTING_MOTIVES.register("candycane",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> COOKIE = PAINTING_MOTIVES.register("cookie",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> BLACKBERRYICECREAM = PAINTING_MOTIVES.register("blackberryicecream",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> BLUEBERRYICECREAM = PAINTING_MOTIVES.register("blueberryicecream",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> STRAWBERRYICECREAM = PAINTING_MOTIVES.register("strawberryicecream",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> RASPBERRYICECREAM = PAINTING_MOTIVES.register("raspberryicecream",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> ORANGEICECREAM = PAINTING_MOTIVES.register("orangeicecream",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> LEMONICECREAM = PAINTING_MOTIVES.register("lemonicecream",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> VANILLAICECREAM = PAINTING_MOTIVES.register("vanillaicecream",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> BLUEBERRYPUG = PAINTING_MOTIVES.register("blueberrypug",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> BLACKBERRYPUG = PAINTING_MOTIVES.register("blackberrypug",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> LEMONPUG = PAINTING_MOTIVES.register("lemonpug",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> ORANGEPUG = PAINTING_MOTIVES.register("orangepug",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> RASPBERRYPUG = PAINTING_MOTIVES.register("raspberrypug",
            () -> new PaintingType(16, 16));
    public static final RegistryObject<PaintingType> STRAWBERRYPUG = PAINTING_MOTIVES.register("strawberrypug",
            () -> new PaintingType(16, 16));

    public static void register(IEventBus eventBus) {
        PAINTING_MOTIVES.register(eventBus);
    }


}
