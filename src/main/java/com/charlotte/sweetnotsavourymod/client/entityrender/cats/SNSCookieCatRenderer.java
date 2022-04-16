package com.charlotte.sweetnotsavourymod.client.entityrender.cats;

import com.charlotte.sweetnotsavourymod.client.entitymodel.cats.SNSCookieCatModel;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSCookieCatEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.CatVariants.CookieCatFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSCookieCatRenderer extends GeoEntityRenderer<SNSCookieCatEntity> {
    public static final Map<CookieCatFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CookieCatFlavourVariant.class), (p_114874_) -> {
                p_114874_.put(CookieCatFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/cats/cookiecat.png"));

            });

    public SNSCookieCatRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSCookieCatModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSCookieCatEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(SNSCookieCatEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
                       int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Override
    public void renderEarly(SNSCookieCatEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        if(animatable.isBaby()) {
        stackIn.scale(0.3F, 0.3F, 0.3F);
    } else {
        stackIn.scale(0.6F, 0.6F, 0.6F);
    }


        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);

    }
}
