package com.charlotte.sweetnotsavourymod.client.entitymodel.dogs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.dogs.SNSIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSIceCreamPugEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSIceCreamPugModel extends AnimatedGeoModel<SNSIceCreamPugEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSIceCreamPugEntity entity)	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/icecreampug.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSIceCreamPugEntity entity) {
		return SNSIceCreamPugRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSIceCreamPugEntity entity)	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pug.animation.json");
	}
}
