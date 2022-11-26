package com.charlotte.sweetnotsavourymod.common.world.dimension;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.core.Registry;
import net.minecraft.util.ResourceKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class SNSDimensions {
    public static ResourceKey<Level> HerbMayfairDim = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(SweetNotSavouryMod.MOD_ID, "herbmayfairdim"));
}
