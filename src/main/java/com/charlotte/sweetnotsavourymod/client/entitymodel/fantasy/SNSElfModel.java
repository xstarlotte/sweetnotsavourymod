package com.charlotte.sweetnotsavourymod.client.entitymodel.fantasy;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fantasy.SNSElfRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSElfEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSElfModel extends AnimatedGeoModel<SNSElfEntity> {
	@Override
	public ResourceLocation getModelResource(SNSElfEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/elf.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SNSElfEntity entity)	{
		return SNSElfRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(SNSElfEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/elf.animation.json");
	}
}
