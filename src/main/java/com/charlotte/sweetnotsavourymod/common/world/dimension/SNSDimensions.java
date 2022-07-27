package com.charlotte.sweetnotsavourymod.common.world.dimension;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class SNSDimensions {
    public static ResourceKey<Level> HerbMayfairDim = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(SweetNotSavouryMod.MOD_ID, "herbmayfairdim"));
}
