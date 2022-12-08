package com.charlotte.sweetnotsavourymod.client.entitymodel.fantasy;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fantasy.SNSParfaitPixieRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSParfaitPixieEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSParfaitPixieModel extends AnimatedGeoModel<SNSParfaitPixieEntity> {
    @Override
    public ResourceLocation getModelResource(SNSParfaitPixieEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/pixie.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SNSParfaitPixieEntity entity)	{
        return SNSParfaitPixieRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(SNSParfaitPixieEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/pixie.animation.json");
    }
}