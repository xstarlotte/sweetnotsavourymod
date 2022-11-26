package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<IceCreamTrunkPlacer> ICE_TRUNK_PLACER
            = new TrunkPlacerType<>(IceCreamTrunkPlacer.CODEC);

    public static final TrunkPlacerType<ChocolateIceCreamTrunkPlacer> CHOCOLATE_ICE_TRUNK_PLACER
            = new TrunkPlacerType<>(ChocolateIceCreamTrunkPlacer.CODEC);

    private static <P extends TrunkPlacer> TrunkPlacerType<P> registerTrunkPlacerType(String pKey, TrunkPlacerType<P> pTrunkPlacerType) {
        return Registry.register(Registry.TRUNK_PLACER_TYPES, new ResourceLocation(SweetNotSavouryMod.MOD_ID, pKey), pTrunkPlacerType);
    }

    public static void register() {
        registerTrunkPlacerType("slanted_trunk_placer", ICE_TRUNK_PLACER);
        registerTrunkPlacerType("slanted_trunk_placer2", CHOCOLATE_ICE_TRUNK_PLACER);
    }
}
