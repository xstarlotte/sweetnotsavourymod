package com.charlotte.sweetnotsavourymod.client.entity.model.angelfish;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.angelfish.SNSAngelFishRenderer;
import com.charlotte.sweetnotsavourymod.client.entity.icecreamfish.SNSICFishRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.angelfish.SNSAngelFishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.icecreamfish.SNSICFishEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSAngelFishModel extends AnimatedGeoModel<SNSAngelFishEntity> {
    @Override
    public ResourceLocation getModelLocation(SNSAngelFishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/angelcakeangelfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SNSAngelFishEntity entity) {
        return SNSAngelFishRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SNSAngelFishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/fish.animation.json");
    }
}
