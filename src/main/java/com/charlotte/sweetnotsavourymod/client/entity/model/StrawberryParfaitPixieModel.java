package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryParfaitPixieEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StrawberryParfaitPixieModel extends AnimatedGeoModel<StrawberryParfaitPixieEntity>
{
	@Override
	public ResourceLocation getModelLocation(StrawberryParfaitPixieEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/pixie.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(StrawberryParfaitPixieEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/pixies/strawberryparfaitpixie.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(StrawberryParfaitPixieEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pixie.animation.json");
	}
	
}