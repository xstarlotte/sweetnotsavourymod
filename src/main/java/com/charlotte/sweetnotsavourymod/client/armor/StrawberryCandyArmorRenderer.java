package com.charlotte.sweetnotsavourymod.client.armor;

import com.charlotte.sweetnotsavourymod.common.item.StrawberryCandyArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class StrawberryCandyArmorRenderer extends GeoArmorRenderer<StrawberryCandyArmorItem> {
    public StrawberryCandyArmorRenderer() {
        super(new StrawberryCandyArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
