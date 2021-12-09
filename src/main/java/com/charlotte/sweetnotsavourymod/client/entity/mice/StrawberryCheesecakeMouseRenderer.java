package com.charlotte.sweetnotsavourymod.client.entity.mice;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.mice.StrawberryCheesecakeMouseModel;
import com.charlotte.sweetnotsavourymod.common.entity.mice.StrawberryCheesecakeMouseEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class StrawberryCheesecakeMouseRenderer extends GeoEntityRenderer <StrawberryCheesecakeMouseEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/mice/strawberrycheesecakemouse.png");
	
	public StrawberryCheesecakeMouseRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new StrawberryCheesecakeMouseModel()); 
		this.shadowSize = 0.2F;			
	}

	@Override
	public ResourceLocation getEntityTexture(StrawberryCheesecakeMouseEntity entity) {
		return TEXTURE;
	}	
	
	@Override
    public void renderEarly(StrawberryCheesecakeMouseEntity animatable, MatrixStack stackIn, float ticks,
                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
                            float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.2F, 0.2F, 0.2F);
    }
	
}