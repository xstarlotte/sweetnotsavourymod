package com.charlotte.sweetnotsavourymod.client.entity.model.chipmunks;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.chipmunk.SNSChipmunkRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.squirrels.SNSSquirrollRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.chipmunks.SNSChipmunkEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.SNSSquirrollEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSChipmunkModel extends AnimatedGeoModel<SNSChipmunkEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSChipmunkEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/chipmunk.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSChipmunkEntity entity) {
		return SNSChipmunkRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSChipmunkEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/chipmunk.animation.json");
	}

}
