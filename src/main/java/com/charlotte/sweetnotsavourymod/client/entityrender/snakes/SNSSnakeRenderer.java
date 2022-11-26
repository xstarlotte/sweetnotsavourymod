package com.charlotte.sweetnotsavourymod.client.entityrender.snakes;

import com.charlotte.sweetnotsavourymod.client.entitymodel.snakes.SNSSnakeModel;
import com.charlotte.sweetnotsavourymod.common.entity.snakes.SNSSnakeEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.SnakeVariants.SnakeFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSSnakeRenderer extends GeoEntityRenderer<SNSSnakeEntity> {
    public static final Map<SnakeFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SnakeFlavourVariant.class), (p_114874_) -> {
                p_114874_.put(SnakeFlavourVariant.STRAWBERRYLACE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/strawberrylacesnake.png"));
                p_114874_.put(SnakeFlavourVariant.COLALACE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/colalacesnake.png"));
                p_114874_.put(SnakeFlavourVariant.LIMELACE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/limelacesnake.png"));
                p_114874_.put(SnakeFlavourVariant.LEMONLACE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/lemonlacesnake.png"));
            });

    public SNSSnakeRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SNSSnakeModel());
        this.shadowRadius = 0.05F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSSnakeEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(SNSSnakeEntity entity, float entityYaw, float partialTicks, MatrixStack stack, IRenderTypeBuffer bufferIn,
                       int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Override
    public void renderEarly(SNSSnakeEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
                            IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        if(animatable.isBaby()) {
            stackIn.scale(0.25F, 0.25F, 0.25F);
        } else {
            stackIn.scale(0.5F, 0.5F, 0.5F);
        }


        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);

    }
}
