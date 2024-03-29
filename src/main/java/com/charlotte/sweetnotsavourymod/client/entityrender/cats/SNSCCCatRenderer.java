package com.charlotte.sweetnotsavourymod.client.entityrender.cats;

import com.charlotte.sweetnotsavourymod.client.entitymodel.cats.SNSCCCatModel;
import com.charlotte.sweetnotsavourymod.common.entity.cats.SNSCCCatEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.CatVariants.CatFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSCCCatRenderer extends GeoEntityRenderer<SNSCCCatEntity> {
    public static final Map<CatFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CatFlavourVariant.class), (p_114874_) -> {
                p_114874_.put(CatFlavourVariant.CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/cats/candycanecat.png"));
                p_114874_.put(CatFlavourVariant.MINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/cats/mintcandycanecat.png"));
                p_114874_.put(CatFlavourVariant.PEPPERMINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/cats/peppermintcandycanecat.png"));
                p_114874_.put(CatFlavourVariant.SPEARMINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/cats/spearmintcandycanecat.png"));
                p_114874_.put(CatFlavourVariant.LEMONCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/cats/lemoncandycanecat.png"));
                p_114874_.put(CatFlavourVariant.MINTHUM, new ResourceLocation("sweetnotsavourymod:textures/entity/cats/minthumcat.png"));

            });

    public SNSCCCatRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSCCCatModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSCCCatEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(SNSCCCatEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
                       int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Override
    public void renderEarly(SNSCCCatEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
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
