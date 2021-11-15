package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;

import com.charlotte.sweetnotsavourymod.common.world.surface.IceCreamForestSurfaceBuilder;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SurfaceBuilderInit {
	public static final DeferredRegister<SurfaceBuilder<?>> SURFACE_BUILDERS = DeferredRegister
			.create(ForgeRegistries.SURFACE_BUILDERS, SweetNotSavouryMod.MOD_ID);
	
	public static final RegistryObject<IceCreamForestSurfaceBuilder> ICECREAMFOREST_SURFACE_BUILDER = SURFACE_BUILDERS
			.register("icecreamforest", () -> new IceCreamForestSurfaceBuilder(SurfaceBuilderConfig.field_237203_a_));

	
	
	
	
	
	
	
	
}
