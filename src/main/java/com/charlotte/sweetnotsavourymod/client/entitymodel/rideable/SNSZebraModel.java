package com.charlotte.sweetnotsavourymod.client.entitymodel.rideable;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.rideable.SNSZebraRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.rideable.SNSZebraEntity;
import net.minecraft.util.ResourceLocation;
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
