package com.charlotte.sweetnotsavourymod.client.entity.model.squirrels;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.CinnamonSquirrollEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CinnamonSquirrollModel extends AnimatedGeoModel<CinnamonSquirrollEntity>
{
	@Override
	public ResourceLocation getModelLocation(CinnamonSquirrollEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/squirroll.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(CinnamonSquirrollEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/cinnamonsquirroll/cinnamonsquirroll.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(CinnamonSquirrollEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/squirroll.animation.json");
	}
	
}