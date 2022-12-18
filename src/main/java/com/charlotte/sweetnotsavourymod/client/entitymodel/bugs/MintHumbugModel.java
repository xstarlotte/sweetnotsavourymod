package com.charlotte.sweetnotsavourymod.client.entitymodel.bugs;


import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.bugs.MintHumbugRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.MintHumbugEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MintHumbugModel extends AnimatedGeoModel<MintHumbugEntity> {
    @Override
    public ResourceLocation getModelResource(MintHumbugEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/mint_humbug.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MintHumbugEntity entity)	{
        return MintHumbugRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(MintHumbugEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/mint_humbug.animation.json");
    }
}