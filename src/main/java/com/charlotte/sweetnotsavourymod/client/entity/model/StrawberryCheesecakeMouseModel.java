package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryCheesecakeMouseEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StrawberryCheesecakeMouseModel extends AnimatedGeoModel<StrawberryCheesecakeMouseEntity> {
	@Override
	public ResourceLocation getModelLocation(StrawberryCheesecakeMouseEntity strawberryCheesecakeMouseEntity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/cheesecakemouse.geo.json");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(StrawberryCheesecakeMouseEntity strawberryCheesecakeMouseEntity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/strawberrycheesecakemouse/strawberrycheesecakemouse.png");
	}

	@Override
	public ResourceLocation getTextureLocation(StrawberryCheesecakeMouseEntity strawberryCheesecakeMouseEntity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/cheesecakemouse.animations.json");
	}
}
