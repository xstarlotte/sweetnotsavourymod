package com.charlotte.sweetnotsavourymod.client.entity.model.parrots;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.ToffeeIceCreamParrotEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ToffeeIceCreamParrotModel extends AnimatedGeoModel<ToffeeIceCreamParrotEntity>
{
	@Override
	public ResourceLocation getModelLocation(ToffeeIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/parrot.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(ToffeeIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/toffeeicecreamparrot/toffeeicecreamparrot.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(ToffeeIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/parrot.animation.json");
	}
	
}