package com.charlotte.sweetnotsavourymod.client.entity.model.pugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;

import com.charlotte.sweetnotsavourymod.client.entity.pugs.SNSIceCreamPugRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSIceCreamPugEntity;
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