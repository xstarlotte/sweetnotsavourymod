package com.charlotte.sweetnotsavourymod.client.entitymodel.rodents;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.rodents.SNSGPRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSGPEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSGPModel extends AnimatedGeoModel<SNSGPEntity> {
	@Override
	public ResourceLocation getModelResource(SNSGPEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/guineapig.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureResource(SNSGPEntity entity) {
		return SNSGPRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationResource(SNSGPEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/guineapig.animation.json");
	}
	
}