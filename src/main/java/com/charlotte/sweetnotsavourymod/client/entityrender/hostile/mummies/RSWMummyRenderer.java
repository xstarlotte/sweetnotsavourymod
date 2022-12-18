package com.charlotte.sweetnotsavourymod.client.entityrender.hostile.mummies;


import com.charlotte.sweetnotsavourymod.client.entitymodel.hostile.mummies.RSWMummyModel;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.mummies.RSWMummyEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;


public class RSWMummyRenderer extends GeoEntityRenderer<RSWMummyEntity> {

    public RSWMummyRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RSWMummyModel());
        this.shadowRadius = 0.3F;
    }


    @Override
    public RenderType getRenderType(RSWMummyEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack,
                renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
