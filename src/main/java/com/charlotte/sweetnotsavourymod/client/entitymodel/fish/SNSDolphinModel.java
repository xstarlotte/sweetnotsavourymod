package com.charlotte.sweetnotsavourymod.client.entitymodel.fish;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fish.SNSDolphinRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSDolphinEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSDolphinModel extends AnimatedGeoModel<SNSDolphinEntity> {
    @Override
    public ResourceLocation getModelResource(SNSDolphinEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/dolphin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SNSDolphinEntity entity) {
        return SNSDolphinRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(SNSDolphinEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/dolphin.animation.json");
    }
}
