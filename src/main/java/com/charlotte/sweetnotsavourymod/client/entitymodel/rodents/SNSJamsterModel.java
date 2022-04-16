package com.charlotte.sweetnotsavourymod.client.entitymodel.rodents;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.rodents.SNSJamsterRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSJamsterEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSJamsterModel extends AnimatedGeoModel<SNSJamsterEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSJamsterEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/jamster.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSJamsterEntity entity) {
		return SNSJamsterRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSJamsterEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/jamster.animation.json");
	}

}
