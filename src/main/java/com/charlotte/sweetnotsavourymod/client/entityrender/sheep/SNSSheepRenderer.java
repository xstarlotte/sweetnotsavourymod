package com.charlotte.sweetnotsavourymod.client.entityrender.sheep;

import com.charlotte.sweetnotsavourymod.client.entitymodel.sheep.SNSSheepModel;
import com.charlotte.sweetnotsavourymod.common.entity.sheep.SNSSheepEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.SheepVariants.SheepVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSSheepRenderer extends GeoEntityRenderer<SNSSheepEntity> {
    public static final Map<SheepVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SheepVariant.class), (p_114874_) -> {
                p_114874_.put(SheepVariant.CANDYFLOSS, new ResourceLocation("sweetnotsavourymod:textures/entity/sheep/candyfloss.png"));
                p_114874_.put(SheepVariant.BLUECANDYFLOSS, new ResourceLocation("sweetnotsavourymod:textures/entity/sheep/bluecandyfloss.png"));

            });

    public SNSSheepRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SNSSheepModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSSheepEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(SNSSheepEntity entity, float entityYaw, float partialTicks, MatrixStack stack, IRenderTypeBuffer bufferIn,
                       int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Override
    public void renderEarly(SNSSheepEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
                            IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
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
