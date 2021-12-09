package com.charlotte.sweetnotsavourymod.client.entity.model.squirrels;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.StrawberrySwissSquirrollEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StrawberrySwissSquirrollModel extends AnimatedGeoModel<StrawberrySwissSquirrollEntity>
{
	@Override
	public ResourceLocation getModelLocation(StrawberrySwissSquirrollEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/squirroll.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(StrawberrySwissSquirrollEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/strawberryswisssquirroll/strawberryswisssquirroll.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(StrawberrySwissSquirrollEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/squirroll.animation.json");
	}
	
}