package com.charlotte.sweetnotsavourymod.client.entityrender.birds;


import com.charlotte.sweetnotsavourymod.client.entitymodel.birds.ChocolateChickenModel;
import com.charlotte.sweetnotsavourymod.client.entitymodel.birds.ChocolateChickenModel;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolateChickenEntity;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolateChickenEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.BirdVariants.ChickenVariant;
import com.charlotte.sweetnotsavourymod.core.util.variants.BirdVariants.ChickenVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;


public class ChocolateChickenRenderer extends GeoEntityRenderer<ChocolateChickenEntity> {
    public static final Map<ChickenVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ChickenVariant.class), (p_114874_) -> {
                p_114874_.put(ChickenVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/birds/chocolatechicken.png"));
                p_114874_.put(ChickenVariant.DARKCHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/birds/darkchocolatechicken.png"));
                p_114874_.put(ChickenVariant.WHITECHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/birds/whitechocolatechicken.png"));

            });

    public ChocolateChickenRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ChocolateChickenModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(ChocolateChickenEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(ChocolateChickenEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        if(animatable.isBaby()) {
            stackIn.scale(0.35F, 0.35F, 0.35F);
        } else {
            stackIn.scale(0.7F, 0.7F, 0.7F);
        }


        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);

    }
}
