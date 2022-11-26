package com.charlotte.sweetnotsavourymod.client.entityrender.rodents;

import com.charlotte.sweetnotsavourymod.client.entitymodel.rodents.SNSSquirrollModel;
import com.charlotte.sweetnotsavourymod.common.entity.rodents.SNSSquirrollEntity;
import com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants.SquirrollFlavourVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.util.Util;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSSquirrollRenderer extends GeoEntityRenderer <SNSSquirrollEntity> {
	public static final Map<SquirrollFlavourVariant, ResourceLocation> LOCATION_BY_VARIANT =
			Util.make(Maps.newEnumMap(SquirrollFlavourVariant.class), (p_114874_) -> {
				p_114874_.put(SquirrollFlavourVariant.CINNAMON, new ResourceLocation("sweetnotsavourymod:textures/entity/squirrolls/cinnamonsquirroll.png"));
				p_114874_.put(SquirrollFlavourVariant.STRAWBERRYSWISS, new ResourceLocation("sweetnotsavourymod:textures/entity/squirrolls/strawberryswisssquirroll.png"));
				p_114874_.put(SquirrollFlavourVariant.CHOCOLATE, new ResourceLocation("sweetnotsavourymod:textures/entity/squirrolls/chocolatesquirroll.png"));


			});

	public SNSSquirrollRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SNSSquirrollModel());
		this.shadowRadius = 0.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(SNSSquirrollEntity entity) {
		return LOCATION_BY_VARIANT.get(entity.getVariant());
	}	
	
	@Override
	public void render(SNSSquirrollEntity entity, float entityYaw, float partialTicks, MatrixStack stack, IRenderTypeBuffer bufferIn,
					   int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	@Override
	public void renderEarly(SNSSquirrollEntity animatable, MatrixStack stackIn, float ticks, IRenderTypeBuffer renderTypeBuffer,
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