package com.charlotte.sweetnotsavourymod.client.entity.model.spiders;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.spiders.SNSSpiderRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.toads.SNSToadRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.spiders.SNSSpiderEntity;
import com.charlotte.sweetnotsavourymod.common.entity.toads.SNSToadEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSSpiderModel extends AnimatedGeoModel<SNSSpiderEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSSpiderEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/spider.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSSpiderEntity entity) {
		return SNSSpiderRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSSpiderEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/spider.animation.json");
	}

}