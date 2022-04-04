package com.charlotte.sweetnotsavourymod.client.entityrender.hostile.poisonberries;

import com.charlotte.sweetnotsavourymod.client.entitymodel.hostile.poisonberries.PBArcherModel;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.poisonberries.PBArcherEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PBArcherRenderer extends GeoEntityRenderer<PBArcherEntity> {

    public PBArcherRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PBArcherModel());
        this.shadowRadius = 0.2F;
    }


    @Override
    public RenderType getRenderType(PBArcherEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.6F, 0.6F, 0.6F);
        return super.getRenderType(animatable, partialTicks, stack,
                renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}