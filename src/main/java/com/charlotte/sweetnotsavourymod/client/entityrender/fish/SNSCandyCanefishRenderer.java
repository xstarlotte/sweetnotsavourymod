package com.charlotte.sweetnotsavourymod.client.entityrender.fish;

import com.charlotte.sweetnotsavourymod.client.entitymodel.fish.SNSCandyCanefishModel;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSCandyCanefishEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants.CandyCanefishVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSCandyCanefishRenderer extends GeoEntityRenderer<SNSCandyCanefishEntity> {
    public static final Map<CandyCanefishVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CandyCanefishVariant.class), (p_114874_) -> {
                p_114874_.put(CandyCanefishVariant.CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/candycanefish/candycanefish.png"));
                p_114874_.put(CandyCanefishVariant.MINT, new ResourceLocation("sweetnotsavourymod:textures/entity/candycanefish/mintcandycanefish.png"));
                p_114874_.put(CandyCanefishVariant.PEPPERMINT, new ResourceLocation("sweetnotsavourymod:textures/entity/candycanefish/peppermintcandycanefish.png"));
                p_114874_.put(CandyCanefishVariant.SPEARMINT, new ResourceLocation("sweetnotsavourymod:textures/entity/candycanefish/spearmintcandycanefish.png"));
                p_114874_.put(CandyCanefishVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/candycanefish/lemoncandycanefish.png"));


            });

    public SNSCandyCanefishRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSCandyCanefishModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSCandyCanefishEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSCandyCanefishEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(1F, 1F, 1F);
    }
}
