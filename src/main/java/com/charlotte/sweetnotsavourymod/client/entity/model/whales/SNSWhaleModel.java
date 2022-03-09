package com.charlotte.sweetnotsavourymod.client.entity.model.whales;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.icecreamfish.SNSICFishRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.whales.SNSWhaleRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.icecreamfish.SNSICFishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.whales.SNSWhaleEntity;
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
