package com.charlotte.sweetnotsavourymod.client.entity.model.zebras;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.elves.SNSElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.zebras.SNSZebraRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.common.entity.zebras.SNSZebraEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSZebraModel extends AnimatedGeoModel<SNSZebraEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSZebraEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/zebra.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSZebraEntity entity)	{
		return SNSZebraRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSZebraEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/zebra.animation.json");
	}
}