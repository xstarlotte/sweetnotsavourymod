package com.charlotte.sweetnotsavourymod.client.entity.model.toads;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.SNSRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.toads.SNSToadRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.SNSRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.toads.SNSToadEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSToadModel extends AnimatedGeoModel<SNSToadEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSToadEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/toad.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSToadEntity entity) {
		return SNSToadRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSToadEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/toad.animation.json");
	}

}