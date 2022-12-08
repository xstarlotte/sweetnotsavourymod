package com.charlotte.sweetnotsavourymod.client.entitymodel.cats;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.cats.SNSLionRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSLionEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSLionModel extends AnimatedGeoModel<SNSLionEntity> {
	@Override
	public ResourceLocation getModelResource(SNSLionEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/lion.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SNSLionEntity entity) {
		return SNSLionRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(SNSLionEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/lion.animation.json");
	}

}