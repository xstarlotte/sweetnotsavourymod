package com.charlotte.sweetnotsavourymod.client.entity.icecreamfish;


import com.charlotte.sweetnotsavourymod.client.entity.model.icecreamfish.SNSICFishModel;
import com.charlotte.sweetnotsavourymod.common.entity.icecreamfish.SNSICFishEntity;
import com.charlotte.sweetnotsavourymod.core.util.ICFishVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSICFishRenderer extends GeoEntityRenderer<SNSICFishEntity> {
    public static final Map<ICFishVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ICFishVariant.class), (p_114874_) -> {
                p_114874_.put(ICFishVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/blackberryicecreamfish.png"));
                p_114874_.put(ICFishVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/blueberryicecreamfish.png"));
                p_114874_.put(ICFishVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/strawberryicecreamfish.png"));
                p_114874_.put(ICFishVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/raspberryicecreamfish.png"));
                p_114874_.put(ICFishVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/lemonicecreamfish.png"));
                p_114874_.put(ICFishVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/orangeicecreamfish.png"));
                p_114874_.put(ICFishVariant.VANILLA, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/vanillaicecreamfish.png"));
                p_114874_.put(ICFishVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/chocolateicecreamfish.png"));
                p_114874_.put(ICFishVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/toffeeicecreamfish.png"));
                p_114874_.put(ICFishVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/peachicecreamfish.png"));
                p_114874_.put(ICFishVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/mangoicecreamfish.png"));
                p_114874_.put(ICFishVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/pineappleicecreamfish.png"));
                p_114874_.put(ICFishVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/limeicecreamfish.png"));
                p_114874_.put(ICFishVariant.WAFER, new ResourceLocation("sweetnotsavourymod:textures/entity/icecreamfish/icecreamwaferfish.png"));

            });

    public SNSICFishRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSICFishModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSICFishEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSICFishEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(1.2F, 1.2F, 1.2F);
    }
}
