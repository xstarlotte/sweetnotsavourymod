package com.charlotte.sweetnotsavourymod.client.entity.model.guineapigs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.guineapigs.SNSGPRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.SNSRabbitRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.guineapigs.SNSGPEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.SNSRabbitEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSGPModel extends AnimatedGeoModel<SNSGPEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSGPEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/guineapig.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(SNSGPEntity entity) {
		return SNSGPRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(SNSGPEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/guineapig.animation.json");
	}
	
}