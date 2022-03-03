package com.charlotte.sweetnotsavourymod.common.painting;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<Motive> PAINTING_MOTIVES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, SweetNotSavouryMod.MOD_ID);

    public static final RegistryObject<Motive> PLAIN = PAINTING_MOTIVES.register("plain",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> CANDYCANE = PAINTING_MOTIVES.register("candycane",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> COOKIE = PAINTING_MOTIVES.register("cookie",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> BLACKBERRYICECREAM = PAINTING_MOTIVES.register("blackberryicecream",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> BLUEBERRYICECREAM = PAINTING_MOTIVES.register("blueberryicecream",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> STRAWBERRYICECREAM = PAINTING_MOTIVES.register("strawberryicecream",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> RASPBERRYICECREAM = PAINTING_MOTIVES.register("raspberryicecream",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> ORANGEICECREAM = PAINTING_MOTIVES.register("orangeicecream",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> LEMONICECREAM = PAINTING_MOTIVES.register("lemonicecream",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> VANILLAICECREAM = PAINTING_MOTIVES.register("vanillaicecream",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> BLUEBERRYPUG = PAINTING_MOTIVES.register("blueberrypug",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> BLACKBERRYPUG = PAINTING_MOTIVES.register("blackberrypug",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> LEMONPUG = PAINTING_MOTIVES.register("lemonpug",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> ORANGEPUG = PAINTING_MOTIVES.register("orangepug",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> RASPBERRYPUG = PAINTING_MOTIVES.register("raspberrypug",
            () -> new Motive(16, 16));
    public static final RegistryObject<Motive> STRAWBERRYPUG = PAINTING_MOTIVES.register("strawberrypug",
            () -> new Motive(16, 16));

    public static void register(IEventBus eventBus) {
        PAINTING_MOTIVES.register(eventBus);
    }


}
