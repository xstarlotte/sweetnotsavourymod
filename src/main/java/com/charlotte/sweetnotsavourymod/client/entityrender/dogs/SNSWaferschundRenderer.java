package com.charlotte.sweetnotsavourymod.client.entityrender.dogs;

import com.charlotte.sweetnotsavourymod.client.entitymodel.dogs.SNSWaferschundModel;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSWaferschundEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.DogVariants.WaferschundVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSWaferschundRenderer extends GeoEntityRenderer<SNSWaferschundEntity> {
    public static final Map<WaferschundVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WaferschundVariant.class), (p_114874_) -> {
                p_114874_.put(WaferschundVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/strawberrywaferschund.png"));
                p_114874_.put(WaferschundVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/peachwaferschund.png"));
                p_114874_.put(WaferschundVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/mangowaferschund.png"));
                p_114874_.put(WaferschundVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/pineapplewaferschund.png"));
                p_114874_.put(WaferschundVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/limewaferschund.png"));
                p_114874_.put(WaferschundVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/lemonwaferschund.png"));
                p_114874_.put(WaferschundVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/chocolatewaferschund.png"));
                p_114874_.put(WaferschundVariant.WHITECHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/whitechocolatewaferschund.png"));
                p_114874_.put(WaferschundVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/raspberrywaferschund.png"));
                p_114874_.put(WaferschundVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/blueberrywaferschund.png"));
                p_114874_.put(WaferschundVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/blackberrywaferschund.png"));
                p_114874_.put(WaferschundVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/orangewaferschund.png"));

            });

    public SNSWaferschundRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSWaferschundModel());
        this.shadowRadius = 0.1F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSWaferschundEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSWaferschundEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
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