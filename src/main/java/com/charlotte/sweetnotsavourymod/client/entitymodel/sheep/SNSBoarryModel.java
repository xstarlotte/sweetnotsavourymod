package com.charlotte.sweetnotsavourymod.client.entitymodel.sheep;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.sheep.SNSBoarryRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.sheep.SNSBoarryEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSBoarryModel extends AnimatedGeoModel<SNSBoarryEntity> {
	@Override
	public ResourceLocation getModelResource(SNSBoarryEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/boarry.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SNSBoarryEntity entity) {
		return SNSBoarryRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(SNSBoarryEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/boarry.animation.json");
	}

}