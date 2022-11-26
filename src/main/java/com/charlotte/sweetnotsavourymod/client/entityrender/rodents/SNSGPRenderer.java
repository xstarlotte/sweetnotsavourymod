package com.charlotte.sweetnotsavourymod.client.entityrender.rodents;

import com.charlotte.sweetnotsavourymod.client.entitymodel.rodents.SNSGPModel;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSGPEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants.GPFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSGPRenderer extends GeoEntityRenderer <SNSGPEntity> {
	public static final Map<GPFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(GPFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(GPFlavourVariant.VANILLA, new ResourceLocation("sweetnotsavourymod:textures/entity/guineapigs/vanillacakeguineapig.png"));
				p_114874_.put(GPFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/guineapigs/chocolatecakeguineapig.png"));
				p_114874_.put(GPFlavourVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/guineapigs/strawberrycakeguineapig.png"));
				p_114874_.put(GPFlavourVariant.LEMONCURD, new ResourceLocation("sweetnotsavourymod:textures/entity/guineapigs/lemoncurdcakeguineapig.png"));
				p_114874_.put(GPFlavourVariant.COFFEE, new ResourceLocation("sweetnotsavourymod:textures/entity/guineapigs/coffeecakeguineapig.png"));

			});

	public SNSGPRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SNSGPModel());
		this.shadowRadius = 0.1F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSGPEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}

	@Override
	public void render(SNSGPEntity entity, float entityYaw, float partialTicks, MatrixStack stack, IRenderTypeBuffer bufferIn,
					   int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}

	@Override
	public void renderEarly(SNSGPEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
							IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.2F, 0.2F, 0.2F);
		} else {
			stackIn.scale(0.4F, 0.4F, 0.4F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}
