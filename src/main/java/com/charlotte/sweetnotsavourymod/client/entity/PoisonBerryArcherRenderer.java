package com.charlotte.sweetnotsavourymod.client.entity;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.model.PoisonBerryArcherModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.PoisonBerryAttackerModel;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryArcherEntity;
import com.charlotte.sweetnotsavourymod.common.entity.PoisonBerryAttackerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import org.antlr.v4.runtime.misc.NotNull;

public class PoisonBerryArcherRenderer extends MobRenderer<PoisonBerryArcherEntity,
PoisonBerryArcherModel<PoisonBerryArcherEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(SweetNotSavouryMod.MOD_ID,
			"textures/entity/poisonberryarcher/poisonberryarcher.png");

	public PoisonBerryArcherRenderer( EntityRendererManager manager) {
		
		super(manager, new PoisonBerryArcherModel <>(), 0.1f);
		
	}

	@Override
	public ResourceLocation getEntityTexture(PoisonBerryArcherEntity entity) {
		return TEXTURE;
	}
	
	@Override
	protected void preRenderCallback(@NotNull PoisonBerryArcherEntity entitylivingbaseIn, @NotNull MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(0.64F, 0.64F, 0.64F);
		
	}
}
