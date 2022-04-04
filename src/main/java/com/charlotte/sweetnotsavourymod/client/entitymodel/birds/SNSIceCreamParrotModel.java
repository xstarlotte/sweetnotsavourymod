package com.charlotte.sweetnotsavourymod.client.entitymodel.birds;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.birds.SNSIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.birds.SNSIceCreamParrotEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSIceCreamParrotModel extends AnimatedGeoModel<SNSIceCreamParrotEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSIceCreamParrotEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/parrot.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(SNSIceCreamParrotEntity entity) {
		return SNSIceCreamParrotRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(SNSIceCreamParrotEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/parrot.animation.json");
	}
}