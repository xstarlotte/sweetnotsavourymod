package com.charlotte.sweetnotsavourymod.client.entity.model.squirrels;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.rabbits.SNSRabbitRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.squirrels.SNSSquirrollRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.mice.SNSMouseEntity;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.SNSSquirrollEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSSquirrollModel extends AnimatedGeoModel<SNSSquirrollEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSSquirrollEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/squirroll.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSSquirrollEntity entity) {
		return SNSSquirrollRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSSquirrollEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/squirroll.animation.json");
	}

}
