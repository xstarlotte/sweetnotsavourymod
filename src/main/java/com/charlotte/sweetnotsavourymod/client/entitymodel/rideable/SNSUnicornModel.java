package com.charlotte.sweetnotsavourymod.client.entitymodel.rideable;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.rideable.SNSUnicornRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSUnicornEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSUnicornModel extends AnimatedGeoModel<SNSUnicornEntity> {
	@Override
	public ResourceLocation getModelResource(SNSUnicornEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/unicorn.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SNSUnicornEntity entity)	{
		return SNSUnicornRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(SNSUnicornEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/unicorn.animation.json");
	}
}