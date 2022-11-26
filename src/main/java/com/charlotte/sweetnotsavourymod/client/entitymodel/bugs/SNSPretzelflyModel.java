package com.charlotte.sweetnotsavourymod.client.entitymodel.bugs;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.bugs.SNSPretzelflyRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSPretzelflyEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSPretzelflyModel extends AnimatedGeoModel<SNSPretzelflyEntity> {
    @Override
    public ResourceLocation getModelLocation(SNSPretzelflyEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/pretzelfly.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SNSPretzelflyEntity entity) {
        return SNSPretzelflyRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SNSPretzelflyEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pretzelfly.animation.json");
    }
}
