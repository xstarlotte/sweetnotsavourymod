package com.charlotte.sweetnotsavourymod.client.entitymodel.fish;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fish.SNSCandyCanefishRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSCandyCanefishEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSCandyCanefishModel extends AnimatedGeoModel<SNSCandyCanefishEntity> {
    @Override
    public ResourceLocation getModelLocation(SNSCandyCanefishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/candycanefish.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SNSCandyCanefishEntity entity) {
        return SNSCandyCanefishRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SNSCandyCanefishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/wafflefish.animation.json");
    }
}
