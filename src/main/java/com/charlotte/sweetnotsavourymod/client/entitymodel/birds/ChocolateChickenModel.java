package com.charlotte.sweetnotsavourymod.client.entitymodel.birds;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.birds.SNSParrotRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolateChickenEntity;
import com.charlotte.sweetnotsavourymod.common.entity.birds.SNSParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.mummies.RSWMummyEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChocolateChickenModel extends AnimatedGeoModel<ChocolateChickenEntity> {
	@Override
	public ResourceLocation getModelLocation(ChocolateChickenEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/chicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ChocolateChickenEntity entity)
	{
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/entity/birds/chocolatechicken.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(ChocolateChickenEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/chicken.animation.json");
	}
}