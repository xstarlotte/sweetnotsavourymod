package com.charlotte.sweetnotsavourymod.client.armor.renderers;

import com.charlotte.sweetnotsavourymod.client.armor.models.RaspberryCandyArmorModel;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.RaspberryCandyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class RaspberryCandyArmorRenderer extends GeoArmorRenderer<RaspberryCandyArmorItem> {
    public RaspberryCandyArmorRenderer() {
        super(new RaspberryCandyArmorModel());

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
