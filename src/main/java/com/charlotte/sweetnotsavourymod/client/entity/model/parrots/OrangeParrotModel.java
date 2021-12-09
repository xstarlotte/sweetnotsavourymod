package com.charlotte.sweetnotsavourymod.client.entity.model.parrots;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.OrangeParrotEntity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrangeParrotModel extends AnimatedGeoModel<OrangeParrotEntity>
{
	@Override
	public ResourceLocation getModelLocation(OrangeParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/parrot.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(OrangeParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/orangeparrot/orangeparrot.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(OrangeParrotEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/parrot.animation.json");
	}
	
}