package com.charlotte.sweetnotsavourymod.client.armor.models;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.RaspberryCandyArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RaspberryCandyArmorModel extends AnimatedGeoModel <RaspberryCandyArmorItem> {
    @Override
    public ResourceLocation getModelLocation(RaspberryCandyArmorItem object) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/candy_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(RaspberryCandyArmorItem object) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/models/armor/" +
                "raspberry_candy_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RaspberryCandyArmorItem animatable) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/armor_animation.json");
    }
}
