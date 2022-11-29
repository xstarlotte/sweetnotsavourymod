package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {

    public static void register(IEventBus bus) {
        REGISTER.register(bus);
    }

    private static final DeferredRegister<TrunkPlacerType<?>> REGISTER = DeferredRegister.create(Registry.TRUNK_PLACER_TYPE_REGISTRY, SweetNotSavouryMod.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<IceCreamTrunkPlacer>> ICE_TRUNK_PLACER = REGISTER.register("slanted_trunk_placer", () -> new TrunkPlacerType<>(IceCreamTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<ChocolateIceCreamTrunkPlacer>> CHOCOLATE_ICE_TRUNK_PLACER = REGISTER.register("slanted_trunk_placer2", () -> new TrunkPlacerType<>(ChocolateIceCreamTrunkPlacer.CODEC));
}
