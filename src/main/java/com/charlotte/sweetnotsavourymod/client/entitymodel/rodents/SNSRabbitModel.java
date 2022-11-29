package com.charlotte.sweetnotsavourymod.client.entitymodel.rodents;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.rodents.SNSRabbitRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSRabbitEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSRabbitModel extends AnimatedGeoModel<SNSRabbitEntity> {
	@Override
	public ResourceLocation getModelResource(SNSRabbitEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/rabbit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SNSRabbitEntity entity) {
		return SNSRabbitRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(SNSRabbitEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/rabbit.animation.json");
	}

}
