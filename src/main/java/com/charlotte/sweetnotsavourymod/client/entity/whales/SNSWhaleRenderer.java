package com.charlotte.sweetnotsavourymod.client.entity.whales;


import com.charlotte.sweetnotsavourymod.client.entity.model.icecreamfish.SNSICFishModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.whales.SNSWhaleModel;
import com.charlotte.sweetnotsavourymod.common.entity.icecreamfish.SNSICFishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.whales.SNSWhaleEntity;
import com.charlotte.sweetnotsavourymod.core.util.ICFishVariant;
import com.charlotte.sweetnotsavourymod.core.util.WhaleVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSWhaleRenderer extends GeoEntityRenderer<SNSWhaleEntity> {
    public static final Map<WhaleVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WhaleVariant.class), (p_114874_) -> {
                p_114874_.put(WhaleVariant.WAFER, new ResourceLocation("sweetnotsavourymod:textures/entity/whales/waferwhale.png"));

            });

    public SNSWhaleRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSWhaleModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSWhaleEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSWhaleEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(2F, 2F, 2F);
    }
}
