package com.charlotte.sweetnotsavourymod.client.entity.model.mice;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.SNSRabbitRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.mice.SNSMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.SNSRabbitEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSMouseModel extends AnimatedGeoModel<SNSMouseEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSMouseEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/mouse.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSMouseEntity entity) {
		return SNSRabbitRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSMouseEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/mouse.animation.json");
	}

}
