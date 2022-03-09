package com.charlotte.sweetnotsavourymod.client.entity.model.unicorns;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.elves.SNSElfRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.unicorns.SNSUnicornRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.unicorns.SNSUnicornEntity;
import com.charlotte.sweetnotsavourymod.common.entity.zebras.SNSZebraEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSUnicornModel extends AnimatedGeoModel<SNSUnicornEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSUnicornEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/unicorn.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSUnicornEntity entity)	{
		return SNSUnicornRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSUnicornEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/unicorn.animation.json");
	}
}