package com.charlotte.sweetnotsavourymod.client.entity.model.boarries;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.boarries.SNSBoarryRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.toads.SNSToadRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.boarries.SNSBoarryEntity;
import com.charlotte.sweetnotsavourymod.common.entity.toads.SNSToadEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSBoarryModel extends AnimatedGeoModel<SNSBoarryEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSBoarryEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/boarry.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SNSBoarryEntity entity) {
		return SNSBoarryRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SNSBoarryEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/boarry.animation.json");
	}

}