package com.charlotte.sweetnotsavourymod.client.entity.squirrels;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.squirrels.CinnamonSquirrollModel;
import com.charlotte.sweetnotsavourymod.common.entity.squirrels.CinnamonSquirrollEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CinnamonSquirrollRenderer extends GeoEntityRenderer <CinnamonSquirrollEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/cinnamonsquirroll/cinnamonsquirroll.png");
	
	public CinnamonSquirrollRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new CinnamonSquirrollModel()); 
		this.shadowSize = 0.2F;			
	}

	@Override
	public ResourceLocation getEntityTexture(CinnamonSquirrollEntity entity) {
		return TEXTURE;
	}	
	
	@Override
    public void renderEarly(CinnamonSquirrollEntity animatable, MatrixStack stackIn, float ticks,
                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
                            float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.2F, 0.2F, 0.2F);
    }
	
}