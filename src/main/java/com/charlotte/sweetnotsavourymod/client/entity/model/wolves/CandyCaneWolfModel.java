package com.charlotte.sweetnotsavourymod.client.entity.model.wolves;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.wolves.CandyCaneWolfEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CandyCaneWolfModel extends AnimatedGeoModel<CandyCaneWolfEntity> {
	@Override
	public ResourceLocation getModelLocation(CandyCaneWolfEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/wolf.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(CandyCaneWolfEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/candycanewolf/candycanewolf.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(CandyCaneWolfEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/wolf.animation.json");
	}
}