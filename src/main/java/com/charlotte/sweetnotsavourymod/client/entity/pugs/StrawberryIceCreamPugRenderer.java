package com.charlotte.sweetnotsavourymod.client.entity.pugs;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.pugs.BlueberryIceCreamPugModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.pugs.StrawberryIceCreamPugModel;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.BlueberryIceCreamPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.StrawberryIceCreamPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class StrawberryIceCreamPugRenderer extends GeoEntityRenderer <StrawberryIceCreamPugEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/pugs/strawberryicecreampug.png");
	
	public StrawberryIceCreamPugRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new StrawberryIceCreamPugModel()); 
		this.shadowSize = 0.7F;			
	}

	@Override
	public ResourceLocation getEntityTexture(StrawberryIceCreamPugEntity entity) {
		return TEXTURE;
	}		
	
	@Override
    public void renderEarly(StrawberryIceCreamPugEntity animatable, MatrixStack stackIn, float ticks,
                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
                            float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.8F, 0.8F, 0.8F);
    }
	
}

