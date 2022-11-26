package com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.BonbonbiniRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.BonbonbiniEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BonbonbiniModel extends AnimatedGeoModel<BonbonbiniEntity> {
	@Override
	public ResourceLocation getModelLocation(BonbonbiniEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/bonbonbini.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BonbonbiniEntity entity) {
		return BonbonbiniRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(BonbonbiniEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/bonbonbini.animation.json");
	}
}
