package com.charlotte.sweetnotsavourymod.client.entity.model.lions;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.lions.SNSLionRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.sheep.SNSSheepRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.lions.SNSLionEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sheep.SNSSheepEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSLionModel extends AnimatedGeoModel<SNSLionEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSLionEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/lion.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSLionEntity entity) {
		return SNSLionRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSLionEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/lion.animation.json");
	}

}