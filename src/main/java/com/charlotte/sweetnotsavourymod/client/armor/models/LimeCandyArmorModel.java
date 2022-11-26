package com.charlotte.sweetnotsavourymod.client.armor.models;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.LimeCandyArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LimeCandyArmorModel extends AnimatedGeoModel <LimeCandyArmorItem> {
    @Override
    public ResourceLocation getModelLocation(LimeCandyArmorItem object) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/candy_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LimeCandyArmorItem object) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/models/armor/" +
                "lime_candy_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LimeCandyArmorItem animatable) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/armor_animation.json");
    }
}
