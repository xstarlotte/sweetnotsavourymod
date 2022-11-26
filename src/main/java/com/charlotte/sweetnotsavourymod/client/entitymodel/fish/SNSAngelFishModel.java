package com.charlotte.sweetnotsavourymod.client.entitymodel.fish;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fish.SNSAngelFishRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSAngelFishEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSAngelFishModel extends AnimatedGeoModel<SNSAngelFishEntity> {
    @Override
    public ResourceLocation getModelResource(SNSAngelFishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/angelcakeangelfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SNSAngelFishEntity entity) {
        return SNSAngelFishRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(SNSAngelFishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/fish.animation.json");
    }
}
