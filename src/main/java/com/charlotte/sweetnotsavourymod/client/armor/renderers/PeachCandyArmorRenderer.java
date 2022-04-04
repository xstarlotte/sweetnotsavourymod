package com.charlotte.sweetnotsavourymod.client.armor.renderers;

import com.charlotte.sweetnotsavourymod.client.armor.models.PeachCandyArmorModel;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.PeachCandyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class PeachCandyArmorRenderer extends GeoArmorRenderer<PeachCandyArmorItem> {
    public PeachCandyArmorRenderer() {
        super(new PeachCandyArmorModel());

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
