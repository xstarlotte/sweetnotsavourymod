package com.charlotte.sweetnotsavourymod.client.entity.model.pugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.RaspberryPugEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RaspberryPugModel extends AnimatedGeoModel<RaspberryPugEntity>
{
	@Override
	public ResourceLocation getModelLocation(RaspberryPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/pug.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(RaspberryPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/pugs/raspberrypug.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(RaspberryPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pug.animation.json");
	}
	
}