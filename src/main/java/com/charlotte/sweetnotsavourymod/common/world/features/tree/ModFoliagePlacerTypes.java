package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.charlotte.sweetnotsavourymod.core.init.SNSReg;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFoliagePlacerTypes {
    public static void loadClass() {}
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACER_TYPES
            = SNSReg.createReg(ForgeRegistries.FOLIAGE_PLACER_TYPES);

    public static final RegistryObject<FoliagePlacerType<IceCreamFoliagePlacer>> ICE_CREAM_FOLIAGE_PLACER =
            FOLIAGE_PLACER_TYPES.register("coconut_foliage_placer", () -> new FoliagePlacerType<>(IceCreamFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<ChocolateIceCreamFoliagePlacer>> CHOCOLATE_ICE_CREAM_FOLIAGE_PLACER =
            FOLIAGE_PLACER_TYPES.register("coconut2_foliage_placer", () -> new FoliagePlacerType<>(ChocolateIceCreamFoliagePlacer.CODEC));
}