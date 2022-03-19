package com.charlotte.sweetnotsavourymod.client.entity.boarries;

import com.charlotte.sweetnotsavourymod.client.entity.model.boarries.SNSBoarryModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.toads.SNSToadModel;
import com.charlotte.sweetnotsavourymod.common.entity.boarries.SNSBoarryEntity;
import com.charlotte.sweetnotsavourymod.common.entity.toads.SNSToadEntity;
import com.charlotte.sweetnotsavourymod.core.util.BoarryVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSBoarryRenderer extends GeoEntityRenderer<SNSBoarryEntity> {
    public static final Map<BoarryVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(BoarryVariant.class), (p_114874_) -> {
                p_114874_.put(BoarryVariant.BLACKBOARRY, new ResourceLocation("sweetnotsavourymod:textures/entity/boarries/blackboarry.png"));
                p_114874_.put(BoarryVariant.RASPBOARRY, new ResourceLocation("sweetnotsavourymod:textures/entity/boarries/raspboarry.png"));
                p_114874_.put(BoarryVariant.BLUEBOARRY, new ResourceLocation("sweetnotsavourymod:textures/entity/boarries/blueboarry.png"));
                p_114874_.put(BoarryVariant.STRAWBOARRY, new ResourceLocation("sweetnotsavourymod:textures/entity/boarries/strawboarry.png"));
            });

    public SNSBoarryRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSBoarryModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSBoarryEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(SNSBoarryEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
                       int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Override
    public void renderEarly(SNSBoarryEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
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
