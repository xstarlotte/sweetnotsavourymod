package com.charlotte.sweetnotsavourymod.client.entity.model.pugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.OrangeIceCreamPugEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrangeIceCreamPugModel extends AnimatedGeoModel<OrangeIceCreamPugEntity>
{
	@Override
	public ResourceLocation getModelLocation(OrangeIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/icecreampug.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(OrangeIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/pugs/orangeicecreampug.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(OrangeIceCreamPugEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pug.animation.json");
	}
	
}