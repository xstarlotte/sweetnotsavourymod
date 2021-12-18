package com.charlotte.sweetnotsavourymod.client.entity.model.wolves;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.wolves.SNSCandyCaneWolfEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSCandyCaneWolfModel extends AnimatedGeoModel<SNSCandyCaneWolfEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSCandyCaneWolfEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/wolf.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(SNSCandyCaneWolfEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/candycanewolf/candycanewolf.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(SNSCandyCaneWolfEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/wolf.animation.json");
	}
}