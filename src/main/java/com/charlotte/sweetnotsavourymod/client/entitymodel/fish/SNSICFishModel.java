package com.charlotte.sweetnotsavourymod.client.entitymodel.fish;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fish.SNSICFishRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSICFishEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSICFishModel extends AnimatedGeoModel<SNSICFishEntity> {
    @Override
    public ResourceLocation getModelResource(SNSICFishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/icecreamfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SNSICFishEntity entity) {
        return SNSICFishRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(SNSICFishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/fish.animation.json");
    }
}
