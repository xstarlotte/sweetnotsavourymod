package com.charlotte.sweetnotsavourymod.client.entitymodel.fish;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entityrender.fish.GummyfishRenderer;
import com.charlotte.sweetnotsavourymod.client.entityrender.fish.SNSCandyCanefishRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.fish.GummyfishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSCandyCanefishEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GummyfishModel extends AnimatedGeoModel<GummyfishEntity> {
    @Override
    public ResourceLocation getModelResource(GummyfishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/gummyfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GummyfishEntity entity) {
        return GummyfishRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(GummyfishEntity entity) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/wafflefish.animation.json");
    }
}
