package com.charlotte.sweetnotsavourymod.client.entitymodel.fish;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fish.SNSWhaleRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSWhaleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSWhaleModel extends AnimatedGeoModel<SNSWhaleEntity> {
    @Override
    public ResourceLocation getModelLocation(SNSWhaleEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/waferwhale.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SNSWhaleEntity entity) {
        return SNSWhaleRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SNSWhaleEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/waferwhale.animation.json");
    }
}
