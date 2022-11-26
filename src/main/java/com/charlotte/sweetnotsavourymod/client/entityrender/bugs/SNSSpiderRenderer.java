package com.charlotte.sweetnotsavourymod.client.entityrender.bugs;

import com.charlotte.sweetnotsavourymod.client.entitymodel.bugs.SNSSpiderModel;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSSpiderEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants.SpiderFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSSpiderRenderer extends GeoEntityRenderer<SNSSpiderEntity> {
    public static final Map<SpiderFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SpiderFlavourVariant.class), (p_114874_) -> {
                p_114874_.put(SpiderFlavourVariant.STRAWBERRYLACE, new ResourceLocation("sweetnotsavourymod:textures/entity/spiders/strawberrylacespider.png"));
                p_114874_.put(SpiderFlavourVariant.COLALACE, new ResourceLocation("sweetnotsavourymod:textures/entity/spiders/colalacespider.png"));
                p_114874_.put(SpiderFlavourVariant.LIMELACE, new ResourceLocation("sweetnotsavourymod:textures/entity/spiders/limelacespider.png"));
                p_114874_.put(SpiderFlavourVariant.LEMONLACE, new ResourceLocation("sweetnotsavourymod:textures/entity/spiders/lemonlacespider.png"));
            });

    public SNSSpiderRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SNSSpiderModel());
        this.shadowRadius = 0.05F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSSpiderEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(SNSSpiderEntity entity, float entityYaw, float partialTicks, MatrixStack stack, IRenderTypeBuffer bufferIn,
                       int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
    }

    @Override
    public void renderEarly(SNSSpiderEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
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
