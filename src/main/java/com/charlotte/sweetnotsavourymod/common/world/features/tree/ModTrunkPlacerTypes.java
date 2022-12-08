package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.charlotte.sweetnotsavourymod.core.init.SNSReg;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModTrunkPlacerTypes {
    public static void loadClass() {}

    private static final DeferredRegister<TrunkPlacerType<?>> REGISTER = SNSReg.createReg(Registry.TRUNK_PLACER_TYPE_REGISTRY);

    public static final RegistryObject<TrunkPlacerType<IceCreamTrunkPlacer>> ICE_TRUNK_PLACER = REGISTER.register("slanted_trunk_placer", () -> new TrunkPlacerType<>(IceCreamTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<ChocolateIceCreamTrunkPlacer>> CHOCOLATE_ICE_TRUNK_PLACER = REGISTER.register("slanted_trunk_placer2", () -> new TrunkPlacerType<>(ChocolateIceCreamTrunkPlacer.CODEC));
}
