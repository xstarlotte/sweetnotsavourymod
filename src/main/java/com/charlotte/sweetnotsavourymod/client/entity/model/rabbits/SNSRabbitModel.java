package com.charlotte.sweetnotsavourymod.client.entity.model.rabbits;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.SNSRabbitRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.SNSRabbitEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSRabbitModel extends AnimatedGeoModel<SNSRabbitEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSRabbitEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/rabbit.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(SNSRabbitEntity entity) {
		return SNSRabbitRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(SNSRabbitEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/rabbit.animation.json");
	}
	
}