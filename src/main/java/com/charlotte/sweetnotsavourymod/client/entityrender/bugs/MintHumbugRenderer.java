package com.charlotte.sweetnotsavourymod.client.entityrender.bugs;


import com.charlotte.sweetnotsavourymod.client.entitymodel.bugs.MintHumbugModel;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.MintHumbugEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants.HumbugVariant;
import com.charlotte.sweetnotsavourymod.core.util.variants.FantasyVariants.WaferWitchVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class MintHumbugRenderer extends GeoEntityRenderer<MintHumbugEntity> {
    public static final Map<HumbugVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(HumbugVariant.class), (p_114874_) -> {
                p_114874_.put(HumbugVariant.MINT, new ResourceLocation("sweetnotsavourymod:textures/entity/humbug/mint_humbug.png"));
                p_114874_.put(HumbugVariant.MINT_CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/humbug/mint_candycane_humbug.png"));
                p_114874_.put(HumbugVariant.PEPPERMINT_CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/humbug/peppermint_candycane_humbug.png"));
                p_114874_.put(HumbugVariant.SPEARMINT_CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/humbug/spearmint_candycane_humbug.png"));
                p_114874_.put(HumbugVariant.CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/humbug/candycane_humbug.png"));
                p_114874_.put(HumbugVariant.LEMON_CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/humbug/lemon_candycane_humbug.png"));
            });

    public MintHumbugRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MintHumbugModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(MintHumbugEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(MintHumbugEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        if(animatable.isBaby()) {
            stackIn.scale(0.2F, 0.2F, 0.2F);
        } else {
            stackIn.scale(0.4F, 0.4F, 0.4F);
        }


        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);

    }
}
