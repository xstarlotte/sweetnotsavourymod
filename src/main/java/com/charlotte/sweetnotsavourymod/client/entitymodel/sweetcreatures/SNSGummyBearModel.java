package com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.SNSGummyBearRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSGummyBearModel extends AnimatedGeoModel<SNSGummyBearEntity> {
	@Override
	public ResourceLocation getModelResource(SNSGummyBearEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/gummybear.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureResource(SNSGummyBearEntity entity) {
		return SNSGummyBearRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationResource(SNSGummyBearEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/gummybear.animation.json");
	}
}