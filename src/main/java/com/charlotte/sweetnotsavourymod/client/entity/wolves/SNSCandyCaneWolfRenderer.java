package com.charlotte.sweetnotsavourymod.client.entity.wolves;

import com.charlotte.sweetnotsavourymod.client.entity.model.wolves.SNSCandyCaneWolfModel;
import com.charlotte.sweetnotsavourymod.common.entity.wolves.SNSCandyCaneWolfEntity;

import com.charlotte.sweetnotsavourymod.core.util.CCWolfFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSCandyCaneWolfRenderer extends GeoEntityRenderer<SNSCandyCaneWolfEntity> {
    public static final Map<CCWolfFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CCWolfFlavourVariant.class), (p_114874_) -> {
                p_114874_.put(CCWolfFlavourVariant.CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/candycanewolf/candycanewolf.png"));
                p_114874_.put(CCWolfFlavourVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/candycanewolf/lemoncandycanewolf.png"));
                p_114874_.put(CCWolfFlavourVariant.MINT, new ResourceLocation("sweetnotsavourymod:textures/entity/candycanewolf/mintcandycanewolf.png"));
                p_114874_.put(CCWolfFlavourVariant.PEPPERMINT, new ResourceLocation("sweetnotsavourymod:textures/entity/candycanewolf/peppermintcandycanewolf.png"));
                p_114874_.put(CCWolfFlavourVariant.SPEARMINT, new ResourceLocation("sweetnotsavourymod:textures/entity/candycanewolf/spearmintcandycanewolf.png"));
            });

    public SNSCandyCaneWolfRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSCandyCaneWolfModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSCandyCaneWolfEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public RenderType getRenderType(SNSCandyCaneWolfEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack,
                renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
