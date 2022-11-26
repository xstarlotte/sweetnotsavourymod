package com.charlotte.sweetnotsavourymod.client.entitymodel.rodents;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.rodents.SNSSquirrollRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSSquirrollEntity;
import net.minecraft.util.ResourceLocation;
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
