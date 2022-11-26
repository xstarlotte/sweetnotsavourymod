package com.charlotte.sweetnotsavourymod.client.entityrender.bugs;

import com.charlotte.sweetnotsavourymod.client.entitymodel.bugs.SNSPretzelflyModel;
import com.charlotte.sweetnotsavourymod.common.entity.bugs.SNSPretzelflyEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants.PretzelflyVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSPretzelflyRenderer extends GeoEntityRenderer<SNSPretzelflyEntity> {
    public static final Map<PretzelflyVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(PretzelflyVariant.class), (p_114874_) -> {
                p_114874_.put(PretzelflyVariant.SALTED, new ResourceLocation("sweetnotsavourymod:textures/entity/pretzelfly/pretzelfly.png"));
                p_114874_.put(PretzelflyVariant.HONEY, new ResourceLocation("sweetnotsavourymod:textures/entity/pretzelfly/honeycoatedpretzelfly.png"));
                p_114874_.put(PretzelflyVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/pretzelfly/strawberrycoatedpretzelfly.png"));
                p_114874_.put(PretzelflyVariant.SUGAR, new ResourceLocation("sweetnotsavourymod:textures/entity/pretzelfly/sugarcoatedpretzelfly.png"));
                p_114874_.put(PretzelflyVariant.SPRINKLE, new ResourceLocation("sweetnotsavourymod:textures/entity/pretzelfly/sprinklecoatedpretzelfly.png"));
                p_114874_.put(PretzelflyVariant.DARKCHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/pretzelfly/darkchocolatecoatedpretzelfly.png"));
                p_114874_.put(PretzelflyVariant.WHITECHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/pretzelfly/whitechocolatecoatedpretzelfly.png"));
                p_114874_.put(PretzelflyVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/pretzelfly/chocolatecoatedpretzelfly.png"));

            });

    public SNSPretzelflyRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SNSPretzelflyModel());
        this.shadowRadius = 0.2F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSPretzelflyEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSPretzelflyEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
                            IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(1F, 1F, 1F);
    }
}
