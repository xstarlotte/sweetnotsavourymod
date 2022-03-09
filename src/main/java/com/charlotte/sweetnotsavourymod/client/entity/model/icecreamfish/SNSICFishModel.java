package com.charlotte.sweetnotsavourymod.client.entity.model.icecreamfish;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.icecreamfish.SNSICFishRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.wafflefish.SNSWafflefishRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.icecreamfish.SNSICFishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wafflefish.SNSWafflefishEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSICFishModel extends AnimatedGeoModel<SNSICFishEntity> {
    @Override
    public ResourceLocation getModelLocation(SNSICFishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/icecreamfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SNSICFishEntity entity) {
        return SNSICFishRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SNSICFishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/fish.animation.json");
    }
}
