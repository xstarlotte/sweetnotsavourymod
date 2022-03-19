package com.charlotte.sweetnotsavourymod.client.entity.model.sheep;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.sheep.SNSSheepRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.toads.SNSToadRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.sheep.SNSSheepEntity;
import com.charlotte.sweetnotsavourymod.common.entity.toads.SNSToadEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSSheepModel extends AnimatedGeoModel<SNSSheepEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSSheepEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/sheep.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSSheepEntity entity) {
		return SNSSheepRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSSheepEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/sheep.animation.json");
	}

}