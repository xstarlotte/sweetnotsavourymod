package com.charlotte.sweetnotsavourymod.client.armor.renderers;

import com.charlotte.sweetnotsavourymod.client.armor.models.BlackberryCandyArmorModel;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.BlackberryCandyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackberryCandyArmorRenderer extends GeoArmorRenderer<BlackberryCandyArmorItem> {
    public BlackberryCandyArmorRenderer() {
        super(new BlackberryCandyArmorModel());

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
