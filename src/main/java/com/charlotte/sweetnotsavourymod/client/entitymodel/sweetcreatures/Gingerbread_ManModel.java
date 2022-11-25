package com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.BonbonbiniRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.Gingerbread_ManRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.Gingerbread_ManEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Gingerbread_ManModel extends AnimatedGeoModel<Gingerbread_ManEntity> {
	@Override
	public ResourceLocation getModelLocation(Gingerbread_ManEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/gingerbreadman.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Gingerbread_ManEntity entity) {
		return BonbonbiniRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(Gingerbread_ManEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/gingerbreadman.animation.json");
	}
}
