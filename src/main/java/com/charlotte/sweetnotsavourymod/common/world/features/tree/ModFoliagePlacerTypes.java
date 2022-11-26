package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFoliagePlacerTypes {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACER_TYPES
            = DeferredRegister.create(ForgeRegistries.FOLIAGE_PLACER_TYPES, SweetNotSavouryMod.MOD_ID);

    public static final RegistryObject<FoliagePlacerType<IceCreamFoliagePlacer>> ICE_CREAM_FOLIAGE_PLACER =
            FOLIAGE_PLACER_TYPES.register("coconut_foliage_placer", () -> new FoliagePlacerType<>(IceCreamFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<ChocolateIceCreamFoliagePlacer>> CHOCOLATE_ICE_CREAM_FOLIAGE_PLACER =
            FOLIAGE_PLACER_TYPES.register("coconut2_foliage_placer", () -> new FoliagePlacerType<>(ChocolateIceCreamFoliagePlacer.CODEC));
}