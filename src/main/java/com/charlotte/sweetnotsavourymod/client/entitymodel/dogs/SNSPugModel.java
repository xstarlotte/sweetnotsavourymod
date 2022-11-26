package com.charlotte.sweetnotsavourymod.client.entitymodel.dogs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.dogs.SNSPugRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSPugEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSPugModel extends AnimatedGeoModel<SNSPugEntity> {
	@Override
	public ResourceLocation getModelResource(SNSPugEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/pug.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureResource(SNSPugEntity entity) {
		return SNSPugRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationResource(SNSPugEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pug.animation.json");
	}
}