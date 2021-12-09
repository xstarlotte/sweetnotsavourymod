package com.charlotte.sweetnotsavourymod.client.entity.parrots;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.parrots.PeachParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.BlueberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.PeachParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PeachParrotRenderer extends GeoEntityRenderer <PeachParrotEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/peachparrot/peachparrot.png");
	
	public PeachParrotRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new PeachParrotModel()); 
		this.shadowSize = 0.1F;			
	}

	@Override
	public ResourceLocation getEntityTexture(PeachParrotEntity entity) {
		return TEXTURE;
	}	
	
	@Override
	public void render(PeachParrotEntity entity, float entityYaw, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		
		

		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	 @Override
	    public void renderEarly(PeachParrotEntity animatable, MatrixStack stackIn, float ticks,
	                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
	                            float red, float green, float blue, float partialTicks) {
	        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
	                red, green, blue, partialTicks);
	        stackIn.scale(0.6F, 0.6F, 0.6F);
	    }
	
}
