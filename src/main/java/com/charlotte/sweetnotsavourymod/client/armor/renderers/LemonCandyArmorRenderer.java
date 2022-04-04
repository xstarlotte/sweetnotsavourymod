package com.charlotte.sweetnotsavourymod.client.armor.renderers;

import com.charlotte.sweetnotsavourymod.client.armor.models.LemonCandyArmorModel;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.LemonCandyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LemonCandyArmorRenderer extends GeoArmorRenderer<LemonCandyArmorItem> {
    public LemonCandyArmorRenderer() {
        super(new LemonCandyArmorModel());

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
