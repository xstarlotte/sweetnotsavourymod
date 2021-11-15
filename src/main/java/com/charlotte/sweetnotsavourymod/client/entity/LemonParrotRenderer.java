package com.charlotte.sweetnotsavourymod.client.entity;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.LemonParrotModel;
import com.charlotte.sweetnotsavourymod.common.entity.LemonParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LemonParrotRenderer extends MobRenderer <LemonParrotEntity, 
LemonParrotModel<LemonParrotEntity>> {		

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID, 
			"textures/entity/lemonparrot/lemonparrot.png");
	
	public LemonParrotRenderer(EntityRendererManager manager) {
		
		super(manager, new LemonParrotModel<>(), 0.1f);
		
	}
	
	@Override
    public void render(LemonParrotEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
		matrixStackIn.translate(0,-3,0);
	}	
	@Override
	public ResourceLocation getEntityTexture(LemonParrotEntity entity) {
		return TEXTURE;
	
	}
		
}
