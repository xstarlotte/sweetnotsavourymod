package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ZebraCakeZebraModel extends AnimatedGeoModel<ZebraCakeZebraEntity>
{
	@Override
	public ResourceLocation getModelLocation(ZebraCakeZebraEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/zebra.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ZebraCakeZebraEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/zebracakezebra/zebracakezebra.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(ZebraCakeZebraEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/zebra.animation.json");
	}

}