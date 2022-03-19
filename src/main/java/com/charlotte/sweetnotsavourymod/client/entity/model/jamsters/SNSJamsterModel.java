package com.charlotte.sweetnotsavourymod.client.entity.model.jamsters;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.chipmunk.SNSChipmunkRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.jamsters.SNSJamsterRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.chipmunks.SNSChipmunkEntity;
import com.charlotte.sweetnotsavourymod.common.entity.jamsters.SNSJamsterEntity;
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
