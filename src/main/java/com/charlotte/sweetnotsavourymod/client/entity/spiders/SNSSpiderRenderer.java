package com.charlotte.sweetnotsavourymod.client.entity.spiders;

import com.charlotte.sweetnotsavourymod.client.entity.model.spiders.SNSSpiderModel;
import com.charlotte.sweetnotsavourymod.common.entity.spiders.SNSSpiderEntity;
import com.charlotte.sweetnotsavourymod.core.util.SpiderFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSSpiderRenderer extends GeoEntityRenderer<SNSSpiderEntity> {
    public static final Map<SpiderFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SpiderFlavourVariant.class), (p_114874_) -> {
                p_114874_.put(SpiderFlavourVariant.STRAWBERRYLACE, new ResourceLocation("sweetnotsavourymod:textures/entity/spiders/strawberrylacespider.png"));
                p_114874_.put(SpiderFlavourVariant.COLALACE, new ResourceLocation("sweetnotsavourymod:textures/entity/spiders/colalacespider.png"));
                p_114874_.put(SpiderFlavourVariant.LIMELACE, new ResourceLocation("sweetnotsavourymod:textures/entity/spiders/limelacespider.png"));
                p_114874_.put(SpiderFlavourVariant.LEMONLACE, new ResourceLocation("sweetnotsavourymod:textures/entity/spiders/lemonlacespider.png"));
            });

    public SNSSpiderRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSSpiderModel());
        this.shadowRadius = 0.05F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSSpiderEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(SNSSpiderEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
                       int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Override
    public void renderEarly(SNSSpiderEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.2F, 0.2F, 0.2F);
    }
}
