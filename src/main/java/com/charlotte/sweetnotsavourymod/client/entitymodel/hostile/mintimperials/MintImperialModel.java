package com.charlotte.sweetnotsavourymod.client.entitymodel.hostile.mintimperials;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.hostile.crooks.CandyCaneCrookRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.hostile.mintimperials.MintImperialRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.crooks.CandyCaneCrookEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.mintimperials.MintImperialEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MintImperialModel extends AnimatedGeoModel<MintImperialEntity> {
	@Override
	public ResourceLocation getModelLocation(MintImperialEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/mintimperial.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(MintImperialEntity entity)	{
		return MintImperialRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(MintImperialEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/mintimperial.animation.json");
	}
}