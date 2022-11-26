package com.charlotte.sweetnotsavourymod.client.entityrender.dogs;

import com.charlotte.sweetnotsavourymod.client.entitymodel.dogs.SNSCandyCaneWolfModel;
import com.charlotte.sweetnotsavourymod.common.entity.dogs.SNSCandyCaneWolfEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.DogVariants.CCWolfFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
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

    public SNSCandyCaneWolfRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SNSCandyCaneWolfModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSCandyCaneWolfEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSCandyCaneWolfEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
                            IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        if(animatable.isBaby()) {
            stackIn.scale(0.5F, 0.5F, 0.5F);
        } else {
            stackIn.scale(1F, 1F, 1F);
        }


        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);

    }
}
