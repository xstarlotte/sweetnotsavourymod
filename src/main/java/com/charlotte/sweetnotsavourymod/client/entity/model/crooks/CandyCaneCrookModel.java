package com.charlotte.sweetnotsavourymod.client.entity.model.crooks;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.crooks.CandyCaneCrookRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.elves.SNSElfRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.crooks.CandyCaneCrookEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CandyCaneCrookModel extends AnimatedGeoModel<CandyCaneCrookEntity> {
	@Override
	public ResourceLocation getModelLocation(CandyCaneCrookEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/crook.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(CandyCaneCrookEntity entity)	{
		return CandyCaneCrookRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(CandyCaneCrookEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/crook.animation.json");
	}
}