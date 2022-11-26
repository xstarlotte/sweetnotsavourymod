package com.charlotte.sweetnotsavourymod.client.armor.models;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.MangoCandyArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MangoCandyArmorModel extends AnimatedGeoModel <MangoCandyArmorItem> {
    @Override
    public ResourceLocation getModelLocation(MangoCandyArmorItem object) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/candy_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MangoCandyArmorItem object) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "textures/models/armor/" +
                "mango_candy_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MangoCandyArmorItem animatable) {
        return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/armor_animation.json");
    }
}
