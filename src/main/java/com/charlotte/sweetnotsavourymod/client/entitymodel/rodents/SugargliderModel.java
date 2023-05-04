package com.charlotte.sweetnotsavourymod.client.entitymodel.rodents;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fantasy.WaferWitchRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.rodents.SugargliderRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.WaferWitchEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SugargliderEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SugargliderModel extends AnimatedGeoModel<SugargliderEntity> {
    @Override
    public ResourceLocation getModelResource(SugargliderEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/sugarglider.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SugargliderEntity entity)	{
        return SugargliderRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(SugargliderEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/sugarglider.animation.json");
    }
}