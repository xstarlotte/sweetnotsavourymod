package com.charlotte.sweetnotsavourymod.client.entity.model.pugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.ToffeePugEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ToffeePugModel extends AnimatedGeoModel<ToffeePugEntity>
{
	@Override
	public ResourceLocation getModelLocation(ToffeePugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/pug.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(ToffeePugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/pugs/toffeepug.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(ToffeePugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pug.animation.json");
	}
	
}