package com.charlotte.sweetnotsavourymod.client.armor.renderers;

import com.charlotte.sweetnotsavourymod.client.armor.models.OrangeCandyArmorModel;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.OrangeCandyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OrangeCandyArmorRenderer extends GeoArmorRenderer<OrangeCandyArmorItem> {
    public OrangeCandyArmorRenderer() {
        super(new OrangeCandyArmorModel());

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
