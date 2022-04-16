package com.charlotte.sweetnotsavourymod.client.armor.renderers;

import com.charlotte.sweetnotsavourymod.client.armor.models.LimeCandyArmorModel;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.LimeCandyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LimeCandyArmorRenderer extends GeoArmorRenderer<LimeCandyArmorItem> {
    public LimeCandyArmorRenderer() {
        super(new LimeCandyArmorModel());

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
