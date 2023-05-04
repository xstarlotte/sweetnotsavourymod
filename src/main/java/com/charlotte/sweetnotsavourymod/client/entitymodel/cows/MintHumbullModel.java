package com.charlotte.sweetnotsavourymod.client.entitymodel.cows;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.cows.IceCreamCowRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.cows.MintHumbullRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.cows.IceCreamCowEntity;
import com.charlotte.sweetnotsavourymod.common.entity.cows.MintHumbullEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MintHumbullModel extends AnimatedGeoModel<MintHumbullEntity> {
	@Override
	public ResourceLocation getModelResource(MintHumbullEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/mint_humbull.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureResource(MintHumbullEntity entity) {
		return MintHumbullRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationResource(MintHumbullEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/mint_humbull.animation.json");
	}
}