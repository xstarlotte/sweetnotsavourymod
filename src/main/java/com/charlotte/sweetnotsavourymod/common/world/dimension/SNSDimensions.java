package com.charlotte.sweetnotsavourymod.common.world.dimension;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class SNSDimensions {
    public static RegistryKey<World> HerbMayfairDim = RegistryKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(SweetNotSavouryMod.MOD_ID, "herbmayfairdim"));
}
