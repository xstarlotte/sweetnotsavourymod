package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryParfaitPixieEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueberryParfaitPixieModel extends AnimatedGeoModel<BlueberryParfaitPixieEntity>
{
	@Override
	public ResourceLocation getModelLocation(BlueberryParfaitPixieEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/pixie.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(BlueberryParfaitPixieEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/pixies/blueberryparfaitpixie.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(BlueberryParfaitPixieEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pixie.animation.json");
	}
	
}