package com.charlotte.sweetnotsavourymod.client.entityrender.fish;


import com.charlotte.sweetnotsavourymod.client.entitymodel.fish.SNSDolphinModel;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSDolphinEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants.DolphinVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSDolphinRenderer extends GeoEntityRenderer<SNSDolphinEntity> {
    public static final Map<DolphinVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(DolphinVariant.class), (p_114874_) -> {
                p_114874_.put(DolphinVariant.COLABOTTLE, new ResourceLocation("sweetnotsavourymod:textures/entity/dolphins/colabottlenosedolphin.png"));


            });

    public SNSDolphinRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSDolphinModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSDolphinEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSDolphinEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(1.2F, 1.2F, 1.2F);
    }
}
