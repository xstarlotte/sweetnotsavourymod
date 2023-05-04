package com.charlotte.sweetnotsavourymod.client.entityrender.rodents;


import com.charlotte.sweetnotsavourymod.client.entitymodel.fantasy.WaferWitchModel;
import com.charlotte.sweetnotsavourymod.client.entitymodel.rodents.SugargliderModel;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.WaferWitchEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SugargliderEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.FantasyVariants.WaferWitchVariant;
import com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants.SugargliderVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SugargliderRenderer extends GeoEntityRenderer<SugargliderEntity> {
    public static final Map<SugargliderVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SugargliderVariant.class), (p_114874_) -> {
                p_114874_.put(SugargliderVariant.PLAIN, new ResourceLocation("sweetnotsavourymod:textures/entity/sugargliders/sugarglider.png"));
                p_114874_.put(SugargliderVariant.CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/sugargliders/candycanesugarglider.png"));
                p_114874_.put(SugargliderVariant.LEMONCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/sugargliders/lemoncandycanesugarglider.png"));
                p_114874_.put(SugargliderVariant.MINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/sugargliders/mintsugarglider.png"));
                p_114874_.put(SugargliderVariant.SPEARMINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/sugargliders/spearmintsugarglider.png"));
                p_114874_.put(SugargliderVariant.PEPPERMINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/sugargliders/peppermintsugarglider.png"));
            });

    public SugargliderRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SugargliderModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SugargliderEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SugargliderEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
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
