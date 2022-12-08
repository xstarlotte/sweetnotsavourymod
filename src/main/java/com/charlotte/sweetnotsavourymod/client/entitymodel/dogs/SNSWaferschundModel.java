package com.charlotte.sweetnotsavourymod.client.entitymodel.dogs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.dogs.SNSWaferschundRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSWaferschundEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSWaferschundModel extends AnimatedGeoModel<SNSWaferschundEntity> {
    @Override
    public ResourceLocation getModelResource(SNSWaferschundEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/waferschund.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SNSWaferschundEntity entity) {
        return SNSWaferschundRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(SNSWaferschundEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/waferschund.animation.json");
    }
}