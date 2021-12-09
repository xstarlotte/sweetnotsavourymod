package com.charlotte.sweetnotsavourymod.client.entity.model.pugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.OrangePugEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrangePugModel extends AnimatedGeoModel<OrangePugEntity>
{
	@Override
	public ResourceLocation getModelLocation(OrangePugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/pug.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(OrangePugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/pugs/orangepug.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(OrangePugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pug.animation.json");
	}
	
}