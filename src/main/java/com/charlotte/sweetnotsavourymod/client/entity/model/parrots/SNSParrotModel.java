package com.charlotte.sweetnotsavourymod.client.entity.model.parrots;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.SNSIceCreamParrotRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.parrots.SNSParrotRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.SNSParrotEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSParrotModel extends AnimatedGeoModel<SNSParrotEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSParrotEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/parrot.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSParrotEntity entity) {
		return SNSParrotRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSParrotEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/parrot.animation.json");
	}
}