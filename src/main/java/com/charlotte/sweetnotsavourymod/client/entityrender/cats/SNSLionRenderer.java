package com.charlotte.sweetnotsavourymod.client.entityrender.cats;

import com.charlotte.sweetnotsavourymod.client.entitymodel.cats.SNSLionModel;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSLionEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.CatVariants.LionVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSLionRenderer extends GeoEntityRenderer<SNSLionEntity> {
    public static final Map<LionVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(LionVariant.class), (p_114874_) -> {
                p_114874_.put(LionVariant.CANDYFLOSS, new ResourceLocation("sweetnotsavourymod:textures/entity/lions/candyflosslion.png"));
                p_114874_.put(LionVariant.BLUECANDYFLOSS, new ResourceLocation("sweetnotsavourymod:textures/entity/lions/bluecandyflosslion.png"));

            });

    public SNSLionRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SNSLionModel());
        this.shadowRadius = 0.3F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSLionEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(SNSLionEntity entity, float entityYaw, float partialTicks, MatrixStack stack, IRenderTypeBuffer bufferIn,
                       int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Override
    public void renderEarly(SNSLionEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
                            IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        if(animatable.isBaby()) {
            stackIn.scale(0.8F, 0.8F, 0.8F);
        } else {
            stackIn.scale(1.6F, 1.6F, 1.6F);
        }


        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);

    }
}
