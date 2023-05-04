package com.charlotte.sweetnotsavourymod.client.entitymodel.birds;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.birds.ChocolateChickenRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.birds.ChocolatePenguinRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolateChickenEntity;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolatePenguinEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChocolateChickenModel extends AnimatedGeoModel<ChocolateChickenEntity> {
	@Override
	public ResourceLocation getModelResource(ChocolateChickenEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/chicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChocolateChickenEntity entity)	{
		return ChocolateChickenRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(ChocolateChickenEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/chicken.animation.json");
	}
}
