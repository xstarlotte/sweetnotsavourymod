package com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.JellybabyRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.SNSGummyBearRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.JellybabyEntity;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JellybabyModel extends AnimatedGeoModel<JellybabyEntity> {
	@Override
	public ResourceLocation getModelResource(JellybabyEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/jellybaby.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureResource(JellybabyEntity entity) {
		return JellybabyRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationResource(JellybabyEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/jellybaby.animation.json");
	}
}