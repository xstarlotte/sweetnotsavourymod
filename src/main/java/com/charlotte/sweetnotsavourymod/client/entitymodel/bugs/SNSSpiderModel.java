package com.charlotte.sweetnotsavourymod.client.entitymodel.bugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.bugs.SNSSpiderRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSSpiderEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSSpiderModel extends AnimatedGeoModel<SNSSpiderEntity> {
	@Override
	public ResourceLocation getModelResource(SNSSpiderEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/spider.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SNSSpiderEntity entity) {
		return SNSSpiderRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(SNSSpiderEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/spider.animation.json");
	}

}