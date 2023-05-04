package com.charlotte.sweetnotsavourymod.client.entitymodel.dogs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.dogs.MintHumpugRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.dogs.SNSPugRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.MintHumpugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSPugEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MintHumpugModel extends AnimatedGeoModel<MintHumpugEntity> {
	@Override
	public ResourceLocation getModelResource(MintHumpugEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/mint_humpug.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureResource(MintHumpugEntity entity) {
		return MintHumpugRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationResource(MintHumpugEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pug.animation.json");
	}
}