package com.charlotte.sweetnotsavourymod.client.entity.rabbits;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.rabbits.AngelCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AngelCakeRabbitRenderer extends GeoEntityRenderer <AngelCakeRabbitEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/angelcakerabbit/angelcakerabbit.png");
	
	public AngelCakeRabbitRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new AngelCakeRabbitModel()); 
		this.shadowSize = 0.2F;	
		
	}

	@Override
	public ResourceLocation getEntityTexture(AngelCakeRabbitEntity entity) {
		return TEXTURE;
	}	
	
	@Override
	public void render(AngelCakeRabbitEntity entity, float entityYaw, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		
		

		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	 @Override
	    public void renderEarly(AngelCakeRabbitEntity animatable, MatrixStack stackIn, float ticks,
	                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
	                            float red, float green, float blue, float partialTicks) {
	        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
	                red, green, blue, partialTicks);
	        stackIn.scale(0.6F, 0.6F, 0.6F);
	    }
	
}