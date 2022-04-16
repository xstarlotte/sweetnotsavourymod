package com.charlotte.sweetnotsavourymod.client.entityrender.birds;


import com.charlotte.sweetnotsavourymod.client.entitymodel.birds.ChocolateChickenModel;
import com.charlotte.sweetnotsavourymod.common.entity.birds.ChocolateChickenEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;


public class ChocolateChickenRenderer extends GeoEntityRenderer<ChocolateChickenEntity> {

    public ChocolateChickenRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ChocolateChickenModel());
        this.shadowRadius = 0.3F;
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
