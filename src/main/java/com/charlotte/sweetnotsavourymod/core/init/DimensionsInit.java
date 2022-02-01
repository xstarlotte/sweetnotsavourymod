package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class DimensionsInit {
    public static ResourceKey<Level> SnsDimension = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(SweetNotSavouryMod.MOD_ID, "snsdimension"));
}
