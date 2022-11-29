package com.charlotte.sweetnotsavourymod.client.entitymodel.rodents;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.rodents.SNSChipmunkRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSChipmunkEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSChipmunkModel extends AnimatedGeoModel<SNSChipmunkEntity> {
	@Override
	public ResourceLocation getModelResource(SNSChipmunkEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/chipmunk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SNSChipmunkEntity entity) {
		return SNSChipmunkRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(SNSChipmunkEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/chipmunk.animation.json");
	}

}
