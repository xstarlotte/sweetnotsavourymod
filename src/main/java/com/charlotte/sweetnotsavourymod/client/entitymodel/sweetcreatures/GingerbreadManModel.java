package com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures.BonbonbiniRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.GingerbreadManEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GingerbreadManModel extends AnimatedGeoModel<GingerbreadManEntity> {
	@Override
	public ResourceLocation getModelLocation(GingerbreadManEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/gingerbreadman.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GingerbreadManEntity entity) {
		return BonbonbiniRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(GingerbreadManEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/gingerbreadman.animation.json");
	}
}
