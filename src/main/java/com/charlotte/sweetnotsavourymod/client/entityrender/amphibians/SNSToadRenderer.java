package com.charlotte.sweetnotsavourymod.client.entityrender.amphibians;

import com.charlotte.sweetnotsavourymod.client.entitymodel.amphibians.SNSToadModel;
import com.charlotte.sweetnotsavourymod.common.entity.amphibians.SNSToadEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.AmphibianVariants.ToadFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSToadRenderer extends GeoEntityRenderer<SNSToadEntity> {
    public static final Map<ToadFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ToadFlavourVariant.class), (p_114874_) -> {
                p_114874_.put(ToadFlavourVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/toads/toffeetoad.png"));
                p_114874_.put(ToadFlavourVariant.HONEY, new ResourceLocation("sweetnotsavourymod:textures/entity/toads/honeytoad.png"));
                p_114874_.put(ToadFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/toads/chocolatetoad.png"));
                p_114874_.put(ToadFlavourVariant.WHITECHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/toads/whitechocolatetoad.png"));
            });

    public SNSToadRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSToadModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSToadEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(SNSToadEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
                       int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Override
    public void renderEarly(SNSToadEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
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
