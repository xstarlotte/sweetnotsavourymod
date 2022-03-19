package com.charlotte.sweetnotsavourymod.client.entity.model.mummies;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.mummies.RSWMummyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PBAttackerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class RSWMummyModel extends AnimatedGeoModel<RSWMummyEntity>
{
	@Override
	public ResourceLocation getModelLocation(RSWMummyEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/rswmummy.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(RSWMummyEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/mummies/rswmummy.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(RSWMummyEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/rswmummy.animation.json");
	}
}
