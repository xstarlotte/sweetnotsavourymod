package com.charlotte.sweetnotsavourymod.client.entitymodel.rodents;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.rodents.SNSRabbitRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSMouseEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSMouseModel extends AnimatedGeoModel<SNSMouseEntity> {
	@Override
	public ResourceLocation getModelResource(SNSMouseEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/mouse.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SNSMouseEntity entity) {
		return SNSRabbitRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(SNSMouseEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/mouse.animation.json");
	}

}
