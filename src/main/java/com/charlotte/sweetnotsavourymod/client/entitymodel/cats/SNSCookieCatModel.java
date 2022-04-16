package com.charlotte.sweetnotsavourymod.client.entitymodel.cats;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.cats.SNSCookieCatRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSCookieCatEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSCookieCatModel extends AnimatedGeoModel<SNSCookieCatEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSCookieCatEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/cookiecat.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSCookieCatEntity entity) {
		return SNSCookieCatRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSCookieCatEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/cat.animation.json");
	}

}