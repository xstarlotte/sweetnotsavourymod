package com.charlotte.sweetnotsavourymod.client.entitymodel.fish;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fish.SNSWafflefishRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSWafflefishEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSWafflefishModel extends AnimatedGeoModel<SNSWafflefishEntity> {
    @Override
    public ResourceLocation getModelLocation(SNSWafflefishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/wafflefish.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SNSWafflefishEntity entity) {
        return SNSWafflefishRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SNSWafflefishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/wafflefish.animation.json");
    }
}
