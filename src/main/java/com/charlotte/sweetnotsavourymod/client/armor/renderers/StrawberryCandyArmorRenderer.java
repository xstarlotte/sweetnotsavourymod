package com.charlotte.sweetnotsavourymod.client.armor.renderers;

import com.charlotte.sweetnotsavourymod.client.armor.models.StrawberryCandyArmorModel;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.StrawberryCandyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class StrawberryCandyArmorRenderer extends GeoArmorRenderer<StrawberryCandyArmorItem> {
    public StrawberryCandyArmorRenderer() {
        super(new StrawberryCandyArmorModel());

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
