package com.charlotte.sweetnotsavourymod.client.entityrender.fish;

import com.charlotte.sweetnotsavourymod.client.entitymodel.fish.GummyfishModel;
import com.charlotte.sweetnotsavourymod.client.entitymodel.fish.SNSCandyCanefishModel;
import com.charlotte.sweetnotsavourymod.common.entity.fish.GummyfishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSCandyCanefishEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants.CandyCanefishVariant;
import com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants.GummyfishVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class GummyfishRenderer extends GeoEntityRenderer<GummyfishEntity> {
    public static final Map<GummyfishVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(GummyfishVariant.class), (p_114874_) -> {
                p_114874_.put(GummyfishVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/strawberry_gummyfish.png"));
                p_114874_.put(GummyfishVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/raspberry_gummyfish.png"));
                p_114874_.put(GummyfishVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/blueberry_gummyfish.png"));
                p_114874_.put(GummyfishVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/blackberry_gummyfish.png"));
                p_114874_.put(GummyfishVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/lemon_gummyfish.png"));
                p_114874_.put(GummyfishVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/orange_gummyfish.png"));
                p_114874_.put(GummyfishVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/mango_gummyfish.png"));
                p_114874_.put(GummyfishVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/peach_gummyfish.png"));
                p_114874_.put(GummyfishVariant.COLA, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/cola_gummyfish.png"));
                p_114874_.put(GummyfishVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/lime_gummyfish.png"));
                p_114874_.put(GummyfishVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/gummyfish/pineapple_gummyfish.png"));

            });

    public GummyfishRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GummyfishModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(GummyfishEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(GummyfishEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(1F, 1F, 1F);
    }
}
