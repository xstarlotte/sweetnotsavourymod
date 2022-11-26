package com.charlotte.sweetnotsavourymod.client.armor.models;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.OrangeCandyArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrangeCandyArmorModel extends AnimatedGeoModel <OrangeCandyArmorItem> {
    @Override
    public ResourceLocation getModelLocation(OrangeCandyArmorItem object) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/candy_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OrangeCandyArmorItem object) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/models/armor/" +
                "orange_candy_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OrangeCandyArmorItem animatable) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/armor_animation.json");
    }
}
