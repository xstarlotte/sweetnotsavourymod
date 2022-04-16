package com.charlotte.sweetnotsavourymod.client.entitymodel.amphibians;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.amphibians.SNSToadRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.amphibians.SNSToadEntity;
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