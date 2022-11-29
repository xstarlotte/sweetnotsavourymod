package com.charlotte.sweetnotsavourymod.client.entitymodel.cats;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.cats.SNSCCCatRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSCCCatEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSCCCatModel extends AnimatedGeoModel<SNSCCCatEntity> {
	@Override
	public ResourceLocation getModelResource(SNSCCCatEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/cat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SNSCCCatEntity entity) {
		return SNSCCCatRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(SNSCCCatEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/cat.animation.json");
	}

}