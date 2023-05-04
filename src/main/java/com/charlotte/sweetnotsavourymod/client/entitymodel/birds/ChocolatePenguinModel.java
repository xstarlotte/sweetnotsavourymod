package com.charlotte.sweetnotsavourymod.client.entitymodel.birds;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.birds.ChocolatePenguinRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.fantasy.SNSElfRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolatePenguinEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSElfEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChocolatePenguinModel extends AnimatedGeoModel<ChocolatePenguinEntity> {
	@Override
	public ResourceLocation getModelResource(ChocolatePenguinEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/penguin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChocolatePenguinEntity entity)	{
		return ChocolatePenguinRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(ChocolatePenguinEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/penguin.animation.json");
	}
}
