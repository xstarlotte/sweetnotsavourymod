package com.charlotte.sweetnotsavourymod.client.armor.renderers;

import com.charlotte.sweetnotsavourymod.client.armor.models.BlueberryCandyArmorModel;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.BlueberryCandyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlueberryCandyArmorRenderer extends GeoArmorRenderer<BlueberryCandyArmorItem> {
    public BlueberryCandyArmorRenderer() {
        super(new BlueberryCandyArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
