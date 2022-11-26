package com.charlotte.sweetnotsavourymod.client.armor.models;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.PeachCandyArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PeachCandyArmorModel extends AnimatedGeoModel <PeachCandyArmorItem> {
    @Override
    public ResourceLocation getModelLocation(PeachCandyArmorItem object) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/candy_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PeachCandyArmorItem object) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/models/armor/" +
                "peach_candy_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PeachCandyArmorItem animatable) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/armor_animation.json");
    }
}
