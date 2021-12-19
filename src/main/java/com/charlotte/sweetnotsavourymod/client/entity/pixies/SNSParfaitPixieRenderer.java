package com.charlotte.sweetnotsavourymod.client.entity.pixies;


import com.charlotte.sweetnotsavourymod.client.entity.model.elves.SNSElfModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.pixies.SNSParfaitPixieModel;
import com.charlotte.sweetnotsavourymod.common.entity.SNSParfaitPixieEntity;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;
import com.charlotte.sweetnotsavourymod.core.util.FlavourVariant;
import com.charlotte.sweetnotsavourymod.core.util.ParfaitPixieFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
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

    public SNSParfaitPixieRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSParfaitPixieModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSParfaitPixieEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public RenderType getRenderType(SNSParfaitPixieEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.6F, 0.6F, 0.6F);
        return super.getRenderType(animatable, partialTicks, stack,
                renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
