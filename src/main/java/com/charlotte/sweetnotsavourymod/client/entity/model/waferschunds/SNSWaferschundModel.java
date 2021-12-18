package com.charlotte.sweetnotsavourymod.client.entity.model.waferschunds;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.pugs.SNSPugRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.waferschunds.SNSWaferschundRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.waferschunds.SNSWaferschundEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSWaferschundModel extends AnimatedGeoModel<SNSWaferschundEntity> {
    @Override
    public ResourceLocation getModelLocation(SNSWaferschundEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/waferschund.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SNSWaferschundEntity entity) {
        return SNSWaferschundRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SNSWaferschundEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/waferschund.animation.json");
    }
}