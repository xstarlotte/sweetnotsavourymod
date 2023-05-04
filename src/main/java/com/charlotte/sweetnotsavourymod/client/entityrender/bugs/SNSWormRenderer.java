package com.charlotte.sweetnotsavourymod.client.entityrender.bugs;

import com.charlotte.sweetnotsavourymod.client.entitymodel.bugs.SNSWormModel;
import com.charlotte.sweetnotsavourymod.client.entitymodel.snakes.SNSSnakeModel;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSWormEntity;
import com.charlotte.sweetnotsavourymod.common.entity.snakes.SNSSnakeEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants.WormVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSWormRenderer extends GeoEntityRenderer<SNSWormEntity> {
    public static final Map<WormVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WormVariant.class), (p_114874_) -> {
                p_114874_.put(WormVariant.STRAWBERRYLACE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/strawberrylacesnake.png"));
                p_114874_.put(WormVariant.COLALACE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/colalacesnake.png"));
                p_114874_.put(WormVariant.LIMELACE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/limelacesnake.png"));
                p_114874_.put(WormVariant.LEMONLACE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/lemonlacesnake.png"));
                p_114874_.put(WormVariant.CANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/candycanesnake.png"));
                p_114874_.put(WormVariant.LEMONCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/lemoncandycanesnake.png"));
                p_114874_.put(WormVariant.MINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/mintcandycanesnake.png"));
                p_114874_.put(WormVariant.PEPPERMINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/peppermintcandycanesnake.png"));
                p_114874_.put(WormVariant.SPEARMINTCANDYCANE, new ResourceLocation("sweetnotsavourymod:textures/entity/snakes/spearmintcandycanesnake.png"));
            });

    public SNSWormRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSWormModel());
        this.shadowRadius = 0.05F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSWormEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(SNSWormEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferIn,
                       int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Override
    public void renderEarly(SNSWormEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        if(animatable.isBaby()) {
            stackIn.scale(0.1F, 0.1F, 0.1F);
        } else {
            stackIn.scale(0.2F, 0.2F, 0.2F);
        }


        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);

    }
}
