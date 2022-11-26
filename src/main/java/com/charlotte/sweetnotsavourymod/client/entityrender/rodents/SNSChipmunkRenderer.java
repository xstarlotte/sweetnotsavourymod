package com.charlotte.sweetnotsavourymod.client.entityrender.rodents;

import com.charlotte.sweetnotsavourymod.client.entitymodel.rodents.SNSChipmunkModel;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSChipmunkEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants.ChipmunkFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSChipmunkRenderer extends GeoEntityRenderer <SNSChipmunkEntity> {
	public static final Map<ChipmunkFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(ChipmunkFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(ChipmunkFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/chipmunks/chocolatechipmunk.png"));
				p_114874_.put(ChipmunkFlavourVariant.WHITECHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/chipmunks/whitechocolatechipmunk.png"));


			});

	public SNSChipmunkRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SNSChipmunkModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSChipmunkEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}	
	
	@Override
	public void render(SNSChipmunkEntity entity, float entityYaw, float partialTicks, MatrixStack stack, IRenderTypeBuffer bufferIn,
					   int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	@Override
	public void renderEarly(SNSChipmunkEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
							IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
							float partialTicks) {
		if(animatable.isBaby()) {
			stackIn.scale(0.25F, 0.25F, 0.25F);
		} else {
			stackIn.scale(0.5F, 0.5F, 0.5F);
		}


		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);

	}
}