package com.charlotte.sweetnotsavourymod.client.entityrender.fish;


import com.charlotte.sweetnotsavourymod.client.entitymodel.fish.SNSAngelFishModel;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSAngelFishEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants.AngelFishVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSAngelFishRenderer extends GeoEntityRenderer<SNSAngelFishEntity> {
    public static final Map<AngelFishVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(AngelFishVariant.class), (p_114874_) -> {
                p_114874_.put(AngelFishVariant.ANGELCAKE, new ResourceLocation("sweetnotsavourymod:textures/entity/angelfish/angelcakefish.png"));


            });

    public SNSAngelFishRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSAngelFishModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSAngelFishEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSAngelFishEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(1.2F, 1.2F, 1.2F);
    }
}
