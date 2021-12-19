package com.charlotte.sweetnotsavourymod.client.entity.wafflefish;

import com.charlotte.sweetnotsavourymod.client.entity.model.wafflefish.SNSMiniWafflefishModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.wafflefish.SNSWafflefishModel;
import com.charlotte.sweetnotsavourymod.common.entity.wafflefish.SNSMiniWafflefishEntity;
import com.charlotte.sweetnotsavourymod.common.entity.wafflefish.SNSWafflefishEntity;
import com.charlotte.sweetnotsavourymod.core.util.WafflefishVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSMiniWafflefishRenderer extends GeoEntityRenderer<SNSMiniWafflefishEntity> {
    public static final Map<WafflefishVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WafflefishVariant.class), (p_114874_) -> {
                p_114874_.put(WafflefishVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/miniwafflefish/miniblackberrywafflefish.png"));
                p_114874_.put(WafflefishVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/miniwafflefish/miniblueberrywafflefish.png"));
                p_114874_.put(WafflefishVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/miniwafflefish/ministrawberrywafflefish.png"));
                p_114874_.put(WafflefishVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/miniwafflefish/miniraspberrywafflefish.png"));
                p_114874_.put(WafflefishVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/miniwafflefish/minilemonwafflefish.png"));
                p_114874_.put(WafflefishVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/miniwafflefish/miniorangewafflefish.png"));
                p_114874_.put(WafflefishVariant.VANILLA, new ResourceLocation("sweetnotsavourymod:textures/entity/miniwafflefish/minivanillawafflefish.png"));
                p_114874_.put(WafflefishVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/miniwafflefish/minichocolatewafflefish.png"));
                p_114874_.put(WafflefishVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/miniwafflefish/minitoffeewafflefish.png"));
                p_114874_.put(WafflefishVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/miniwafflefish/minipeachwafflefish.png"));

            });

    public SNSMiniWafflefishRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSMiniWafflefishModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSMiniWafflefishEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSMiniWafflefishEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(2F, 2F, 2F);
    }
}
