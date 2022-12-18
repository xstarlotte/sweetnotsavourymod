package com.charlotte.sweetnotsavourymod.client.entitymodel.fantasy;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fantasy.SNSParfaitPixieRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.fantasy.WaferWitchRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.WaferWitchEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WaferWitchModel extends AnimatedGeoModel<WaferWitchEntity> {
    @Override
    public ResourceLocation getModelResource(WaferWitchEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/wafer_witch.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WaferWitchEntity entity)	{
        return WaferWitchRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(WaferWitchEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/wafer_witch.animation.json");
    }
}