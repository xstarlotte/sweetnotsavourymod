package com.charlotte.sweetnotsavourymod.client.entityrender.fish;

import com.charlotte.sweetnotsavourymod.client.entitymodel.fish.SNSWafflefishModel;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSWafflefishEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants.WafflefishVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSWafflefishRenderer extends GeoEntityRenderer<SNSWafflefishEntity> {
    public static final Map<WafflefishVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WafflefishVariant.class), (p_114874_) -> {
                p_114874_.put(WafflefishVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/wafflefish/blackberrywafflefish.png"));
                p_114874_.put(WafflefishVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/wafflefish/blueberrywafflefish.png"));
                p_114874_.put(WafflefishVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/wafflefish/strawberrywafflefish.png"));
                p_114874_.put(WafflefishVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/wafflefish/raspberrywafflefish.png"));
                p_114874_.put(WafflefishVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/wafflefish/lemonwafflefish.png"));
                p_114874_.put(WafflefishVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/wafflefish/orangewafflefish.png"));
                p_114874_.put(WafflefishVariant.VANILLA, new ResourceLocation("sweetnotsavourymod:textures/entity/wafflefish/vanillawafflefish.png"));
                p_114874_.put(WafflefishVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/wafflefish/chocolatewafflefish.png"));
                p_114874_.put(WafflefishVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/wafflefish/toffeewafflefish.png"));
                p_114874_.put(WafflefishVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/wafflefish/peachwafflefish.png"));

            });

    public SNSWafflefishRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSWafflefishModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSWafflefishEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSWafflefishEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(2F, 2F, 2F);
    }
}
