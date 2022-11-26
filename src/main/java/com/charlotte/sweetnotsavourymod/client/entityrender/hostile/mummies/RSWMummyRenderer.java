package com.charlotte.sweetnotsavourymod.client.entityrender.hostile.mummies;


import com.charlotte.sweetnotsavourymod.client.entitymodel.hostile.mummies.RSWMummyModel;
import com.charlotte.sweetnotsavourymod.common.entity.hostile.mummies.RSWMummyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;


public class RSWMummyRenderer extends GeoEntityRenderer<RSWMummyEntity> {

    public RSWMummyRenderer(EntityRendererManager renderManager) {
        super(renderManager, new RSWMummyModel());
        this.shadowRadius = 0.3F;
    }


    @Override
    public RenderType getRenderType(RSWMummyEntity animatable, float partialTicks, MatrixStack stack,
                                    IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack,
                renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
