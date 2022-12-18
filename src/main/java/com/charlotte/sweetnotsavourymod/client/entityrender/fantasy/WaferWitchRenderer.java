package com.charlotte.sweetnotsavourymod.client.entityrender.fantasy;


import com.charlotte.sweetnotsavourymod.client.entitymodel.fantasy.SNSParfaitPixieModel;
import com.charlotte.sweetnotsavourymod.client.entitymodel.fantasy.WaferWitchModel;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.WaferWitchEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.FantasyVariants.ParfaitPixieFlavourVariant;
import com.charlotte.sweetnotsavourymod.core.util.variants.FantasyVariants.WaferWitchVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class WaferWitchRenderer extends GeoEntityRenderer<WaferWitchEntity> {
    public static final Map<WaferWitchVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WaferWitchVariant.class), (p_114874_) -> {
                p_114874_.put(WaferWitchVariant.VANILLA, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/vanilla_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/raspberry_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/blueberry_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/blackberry_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/strawberry_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/lemon_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/orange_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/lime_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/mango_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/peach_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/pineapple_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.WHITE_CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/white_chocolate_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/chocolate_wafer_witch.png"));
                p_114874_.put(WaferWitchVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/waferwitch/toffee_wafer_witch.png"));
            });

    public WaferWitchRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WaferWitchModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(WaferWitchEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(WaferWitchEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        if(animatable.isBaby()) {
            stackIn.scale(0.5F, 0.5F, 0.5F);
        } else {
            stackIn.scale(1F, 1F, 1F);
        }


        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);

    }
}
