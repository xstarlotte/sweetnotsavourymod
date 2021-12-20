package com.charlotte.sweetnotsavourymod.client.entity.model.gummybears;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.gummybears.SNSGummyBearRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.SNSPugRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.gummybears.SNSGummyBearEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSPugEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSGummyBearModel extends AnimatedGeoModel<SNSGummyBearEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSGummyBearEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/gummybear.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(SNSGummyBearEntity entity) {
		return SNSGummyBearRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(SNSGummyBearEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/gummybear.animation.json");
	}
}