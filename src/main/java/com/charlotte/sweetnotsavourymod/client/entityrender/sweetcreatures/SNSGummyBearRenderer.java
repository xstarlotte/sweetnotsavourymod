package com.charlotte.sweetnotsavourymod.client.entityrender.sweetcreatures;

import com.charlotte.sweetnotsavourymod.client.entitymodel.sweetcreatures.SNSGummyBearModel;
import com.charlotte.sweetnotsavourymod.common.entity.sweetcreatures.SNSGummyBearEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants.GummyBearFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSGummyBearRenderer extends GeoEntityRenderer<SNSGummyBearEntity> {
	public static final Map<GummyBearFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(GummyBearFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(GummyBearFlavourVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/blackberrygummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/blueberrygummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/raspberrygummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/strawberrygummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/lemongummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/orangegummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/mangogummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/peachgummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/pineapplegummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.COLA, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/colagummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/limegummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.CHERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/cherrygummybear.png"));
				p_114874_.put(GummyBearFlavourVariant.APPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/gummybears/applegummybear.png"));
			});

	public SNSGummyBearRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SNSGummyBearModel());
		this.shadowRadius = 0.1F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSGummyBearEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
    public void renderEarly(SNSGummyBearEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
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
