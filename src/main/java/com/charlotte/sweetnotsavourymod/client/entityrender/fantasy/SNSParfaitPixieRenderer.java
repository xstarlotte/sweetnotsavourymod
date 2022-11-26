package com.charlotte.sweetnotsavourymod.client.entityrender.fantasy;


import com.charlotte.sweetnotsavourymod.client.entitymodel.fantasy.SNSParfaitPixieModel;
import com.charlotte.sweetnotsavourymod.common.entity.fantasy.SNSParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.FantasyVariants.ParfaitPixieFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSParfaitPixieRenderer extends GeoEntityRenderer<SNSParfaitPixieEntity> {
    public static final Map<ParfaitPixieFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ParfaitPixieFlavourVariant.class), (p_114874_) -> {
                p_114874_.put(ParfaitPixieFlavourVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pixies/blueberryparfaitpixie.png"));
                p_114874_.put(ParfaitPixieFlavourVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/pixies/orangeparfaitpixie.png"));
                p_114874_.put(ParfaitPixieFlavourVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pixies/raspberryparfaitpixie.png"));
                p_114874_.put(ParfaitPixieFlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pixies/strawberryparfaitpixie.png"));
                p_114874_.put(ParfaitPixieFlavourVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pixies/blackberryparfaitpixie.png"));
                p_114874_.put(ParfaitPixieFlavourVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/pixies/lemonparfaitpixie.png"));
                p_114874_.put(ParfaitPixieFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/pixies/chocolateparfaitpixie.png"));
                p_114874_.put(ParfaitPixieFlavourVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/pixies/toffeeparfaitpixie.png"));
            });

    public SNSParfaitPixieRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SNSParfaitPixieModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSParfaitPixieEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSParfaitPixieEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
                            IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
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
