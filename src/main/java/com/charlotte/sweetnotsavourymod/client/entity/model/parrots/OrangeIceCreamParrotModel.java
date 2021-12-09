package com.charlotte.sweetnotsavourymod.client.entity.model.parrots;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.OrangeIceCreamParrotEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrangeIceCreamParrotModel extends AnimatedGeoModel<OrangeIceCreamParrotEntity>
{
	@Override
	public ResourceLocation getModelLocation(OrangeIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/parrot.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(OrangeIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/orangeicecreamparrot/orangeicecreamparrot.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(OrangeIceCreamParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/parrot.animation.json");
	}
	
}