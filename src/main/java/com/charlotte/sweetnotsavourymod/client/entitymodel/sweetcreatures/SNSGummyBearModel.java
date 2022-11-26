package com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.SNSGummyBearRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity;
import net.minecraft.util.ResourceLocation;
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