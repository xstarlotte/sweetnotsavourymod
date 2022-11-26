package com.charlotte.sweetnotsavourymod.client.entityrender.fish;


import com.charlotte.sweetnotsavourymod.client.entitymodel.fish.SNSDolphinModel;
import com.charlotte.sweetnotsavourymod.common.entity.fish.SNSDolphinEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants.DolphinVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSDolphinRenderer extends GeoEntityRenderer<SNSDolphinEntity> {
    public static final Map<DolphinVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(DolphinVariant.class), (p_114874_) -> {
                p_114874_.put(DolphinVariant.COLABOTTLE, new ResourceLocation("sweetnotsavourymod:textures/entity/dolphins/colabottlenosedolphin.png"));


            });

    public SNSDolphinRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SNSDolphinModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSDolphinEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSDolphinEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
                            IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(1.2F, 1.2F, 1.2F);
    }
}
