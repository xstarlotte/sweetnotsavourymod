package com.charlotte.sweetnotsavourymod.client.entity.parrots;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.parrots.LemonIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.parrots.StrawberryIceCreamParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.BlueberryIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.LemonIceCreamParrotEntity;
import com.charlotte.sweetnotsavourymod.common.entity.parrots.StrawberryIceCreamParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class StrawberryIceCreamParrotRenderer extends GeoEntityRenderer <StrawberryIceCreamParrotEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/strawberryicecreamparrot/strawberryicecreamparrot.png");
	
	public StrawberryIceCreamParrotRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new StrawberryIceCreamParrotModel()); 
		this.shadowSize = 0.1F;			
	}

	@Override
	public ResourceLocation getEntityTexture(StrawberryIceCreamParrotEntity entity) {
		return TEXTURE;
	}	
	
	@Override
	public void render(StrawberryIceCreamParrotEntity entity, float entityYaw, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		
		

		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);
	}
	
	 @Override
	    public void renderEarly(StrawberryIceCreamParrotEntity animatable, MatrixStack stackIn, float ticks,
	                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
	                            float red, float green, float blue, float partialTicks) {
	        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
	                red, green, blue, partialTicks);
	        stackIn.scale(0.6F, 0.6F, 0.6F);
	    }
	
}