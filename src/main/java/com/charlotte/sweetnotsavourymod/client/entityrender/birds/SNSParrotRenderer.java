package com.charlotte.sweetnotsavourymod.client.entityrender.birds;

import com.charlotte.sweetnotsavourymod.client.entitymodel.birds.SNSParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.birds.SNSParrotEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.BirdVariants.ParrotFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSParrotRenderer extends GeoEntityRenderer<SNSParrotEntity> {
	public static final Map<ParrotFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(ParrotFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(ParrotFlavourVariant.BLUEBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/blueberryparrot.png"));
				p_114874_.put(ParrotFlavourVariant.ORANGE, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/orangeparrot.png"));
				p_114874_.put(ParrotFlavourVariant.RASPBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/raspberryparrot.png"));
				p_114874_.put(ParrotFlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/strawberryparrot.png"));
				p_114874_.put(ParrotFlavourVariant.PEACH, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/peachparrot.png"));
				p_114874_.put(ParrotFlavourVariant.BLACKBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/blackberryparrot.png"));
				p_114874_.put(ParrotFlavourVariant.LEMON, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/lemonparrot.png"));
				p_114874_.put(ParrotFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/chocolateparrot.png"));
				p_114874_.put(ParrotFlavourVariant.PINEAPPLE, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/pineappleparrot.png"));
				p_114874_.put(ParrotFlavourVariant.TOFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/toffeeparrot.png"));
				p_114874_.put(ParrotFlavourVariant.MANGO, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/mangoparrot.png"));
				p_114874_.put(ParrotFlavourVariant.LIME, new ResourceLocation("sweetnotsavourymod:textures/entity/parrots/limeparrot.png"));
			});

	public SNSParrotRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SNSParrotModel());
		this.shadowRadius = 0.1F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSParrotEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public void renderEarly(SNSParrotEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
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
