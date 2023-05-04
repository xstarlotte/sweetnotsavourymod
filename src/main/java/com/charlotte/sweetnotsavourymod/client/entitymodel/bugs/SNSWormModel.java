package com.charlotte.sweetnotsavourymod.client.entitymodel.bugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.bugs.SNSWormRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.snakes.SNSSnakeRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSWormEntity;
import com.charlotte.sweetnotsavourymod.common.entity.snakes.SNSSnakeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSWormModel extends AnimatedGeoModel<SNSWormEntity> {
	@Override
	public ResourceLocation getModelResource(SNSWormEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/laceworm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SNSWormEntity entity) {
		return SNSWormRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(SNSWormEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/snake.animation.json");
	}

}
