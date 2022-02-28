package com.charlotte.sweetnotsavourymod.client.entity.model.poisonberries;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;

import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PBAttackerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class PBAttackerModel extends AnimatedGeoModel<PBAttackerEntity>
{
	@Override
	public ResourceLocation getModelLocation(PBAttackerEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/poisonberryattacker.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PBAttackerEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/poisonberryattacker/poisonberryattacker.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(PBAttackerEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/poisonberryattacker.animation.json");
	}
}
