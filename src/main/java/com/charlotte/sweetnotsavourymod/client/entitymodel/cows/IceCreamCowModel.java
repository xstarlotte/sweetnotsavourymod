package com.charlotte.sweetnotsavourymod.client.entitymodel.cows;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.cows.IceCreamCowRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.cows.IceCreamCowEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceCreamCowModel extends AnimatedGeoModel<IceCreamCowEntity> {
	@Override
	public ResourceLocation getModelLocation(IceCreamCowEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/icecreamcow.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(IceCreamCowEntity entity) {
		return IceCreamCowRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(IceCreamCowEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/icecreamcow.animation.json");
	}
}