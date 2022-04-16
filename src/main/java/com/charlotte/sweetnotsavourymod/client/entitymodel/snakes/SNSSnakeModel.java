package com.charlotte.sweetnotsavourymod.client.entitymodel.snakes;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.bugs.SNSSpiderRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.snakes.SNSSnakeRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSSpiderEntity;
import com.charlotte.sweetnotsavourymod.common.entity.snakes.SNSSnakeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSSnakeModel extends AnimatedGeoModel<SNSSnakeEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSSnakeEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/lacesnake.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSSnakeEntity entity) {
		return SNSSnakeRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSSnakeEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/snake.animation.json");
	}

}