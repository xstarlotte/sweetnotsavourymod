package com.charlotte.sweetnotsavourymod.client.armor.renderers;

import com.charlotte.sweetnotsavourymod.client.armor.models.MangoCandyArmorModel;
import com.charlotte.sweetnotsavourymod.common.item.CandyArmorItems.MangoCandyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MangoCandyArmorRenderer extends GeoArmorRenderer<MangoCandyArmorItem> {
    public MangoCandyArmorRenderer() {
        super(new MangoCandyArmorModel());

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
