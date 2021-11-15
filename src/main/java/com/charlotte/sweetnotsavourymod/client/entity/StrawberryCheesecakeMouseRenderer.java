package com.charlotte.sweetnotsavourymod.client.entity;
import com.charlotte.sweetnotsavourymod.client.entity.model.StrawberryCheesecakeMouseModel;
import com.charlotte.sweetnotsavourymod.common.entity.StrawberryCheesecakeMouseEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class StrawberryCheesecakeMouseRenderer extends GeoEntityRenderer <StrawberryCheesecakeMouseEntity>{	
	public StrawberryCheesecakeMouseRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new StrawberryCheesecakeMouseModel());
		this.shadowSize = 0F;
	}
	

	@Override
	public void renderEarly(StrawberryCheesecakeMouseEntity animatable, MatrixStack stackIn, float ticks,
			IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float partialTicks) {

		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn, red,
				green, blue, partialTicks);
		stackIn.scale(0.64f, 0.64f, 0.64f);
	}
	
	@Override
	public ResourceLocation getEntityTexture(StrawberryCheesecakeMouseEntity entity) {
		return null;
	}
	
	
}