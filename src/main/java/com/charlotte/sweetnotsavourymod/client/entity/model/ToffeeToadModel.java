package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.ToffeeToadEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ToffeeToadModel extends AnimatedGeoModel<ToffeeToadEntity> {
	@Override
	public ResourceLocation getModelLocation(ToffeeToadEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/toad.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(ToffeeToadEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/toffeetoad/toffeetoad.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(ToffeeToadEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/toad.animation.json");
	}
}