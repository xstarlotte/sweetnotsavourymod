package com.charlotte.sweetnotsavourymod.client.entity.rabbits;

import org.antlr.v4.runtime.misc.NotNull;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.rabbits.AngelCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.rabbits.LemonCurdCakeRabbitModel;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.AngelCakeRabbitEntity;
import com.charlotte.sweetnotsavourymod.common.entity.rabbits.LemonCurdCakeRabbitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LemonCurdCakeRabbitRenderer extends GeoEntityRenderer <LemonCurdCakeRabbitEntity> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/lemoncurdcakerabbit/lemoncurdcakerabbit.png");
	
	public LemonCurdCakeRabbitRenderer(EntityRendererManager renderManager) {
		
		super(renderManager, new LemonCurdCakeRabbitModel()); 
		this.shadowSize = 0.2F;			
	}

	@Override
	public ResourceLocation getEntityTexture(LemonCurdCakeRabbitEntity entity) {
		return TEXTURE;
	}	
	
	@Override
    public void renderEarly(LemonCurdCakeRabbitEntity animatable, MatrixStack stackIn, float ticks,
                            IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn,
                            float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.6F, 0.6F, 0.6F);
    }
	
}