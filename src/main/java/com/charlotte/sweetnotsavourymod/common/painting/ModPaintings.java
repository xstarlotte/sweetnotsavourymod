package com.charlotte.sweetnotsavourymod.common.painting;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.Keys.PAINTING_VARIANTS, SweetNotSavouryMod.MOD_ID);

    public static final RegistryObject<PaintingVariant> PLAIN = PAINTING_VARIANTS.register("plain",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> CANDYCANE = PAINTING_VARIANTS.register("candycane",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> COOKIE = PAINTING_VARIANTS.register("cookie",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> BLACKBERRYICECREAM = PAINTING_VARIANTS.register("blackberryicecream",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> BLUEBERRYICECREAM = PAINTING_VARIANTS.register("blueberryicecream",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> STRAWBERRYICECREAM = PAINTING_VARIANTS.register("strawberryicecream",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> RASPBERRYICECREAM = PAINTING_VARIANTS.register("raspberryicecream",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> ORANGEICECREAM = PAINTING_VARIANTS.register("orangeicecream",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> LEMONICECREAM = PAINTING_VARIANTS.register("lemonicecream",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> VANILLAICECREAM = PAINTING_VARIANTS.register("vanillaicecream",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> BLUEBERRYPUG = PAINTING_VARIANTS.register("blueberrypug",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> BLACKBERRYPUG = PAINTING_VARIANTS.register("blackberrypug",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> LEMONPUG = PAINTING_VARIANTS.register("lemonpug",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> ORANGEPUG = PAINTING_VARIANTS.register("orangepug",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> RASPBERRYPUG = PAINTING_VARIANTS.register("raspberrypug",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> STRAWBERRYPUG = PAINTING_VARIANTS.register("strawberrypug",
            () -> new PaintingVariant(16, 16));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }


}
