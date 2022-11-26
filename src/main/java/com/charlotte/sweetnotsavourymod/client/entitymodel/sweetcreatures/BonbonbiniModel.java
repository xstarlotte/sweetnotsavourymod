package com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.BonbonbiniRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.BonbonbiniEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BonbonbiniModel extends AnimatedGeoModel<BonbonbiniEntity> {
	@Override
	public ResourceLocation getModelResource(BonbonbiniEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/bonbonbini.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonbonbiniEntity entity) {
		return BonbonbiniRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationResource(BonbonbiniEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/bonbonbini.animation.json");
	}
}
