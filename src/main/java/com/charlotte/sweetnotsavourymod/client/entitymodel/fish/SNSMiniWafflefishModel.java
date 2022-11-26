package com.charlotte.sweetnotsavourymod.client.entitymodel.fish;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fish.SNSMiniWafflefishRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSMiniWafflefishEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSMiniWafflefishModel extends AnimatedGeoModel<SNSMiniWafflefishEntity> {
    @Override
    public ResourceLocation getModelLocation(SNSMiniWafflefishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/miniwafflefish.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SNSMiniWafflefishEntity entity) {
        return SNSMiniWafflefishRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SNSMiniWafflefishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/wafflefish.animation.json");
    }
}
