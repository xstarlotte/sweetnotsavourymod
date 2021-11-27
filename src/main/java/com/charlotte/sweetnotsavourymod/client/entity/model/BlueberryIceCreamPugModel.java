package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.pugs.BlueberryIceCreamPugEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class BlueberryIceCreamPugModel<T extends BlueberryIceCreamPugEntity> extends EntityModel<T> {
	private final ModelRenderer head;
	private final ModelRenderer ears;
	private final ModelRenderer ear1;
	private final ModelRenderer ear2;
	private final ModelRenderer body;
	private final ModelRenderer body_rotation;
	private final ModelRenderer mane;
	private final ModelRenderer mane_rotation;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer tail;

	public BlueberryIceCreamPugModel() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, 13.5F, -7.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -3.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 10).addBox(-3.9F, 1.98F, -3.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 10).addBox(-4.1F, 1.98F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		ears = new ModelRenderer(this);
		ears.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(ears);
		setRotationAngle(ears, 0.0F, 1.5708F, 0.0F);
		

		ear1 = new ModelRenderer(this);
		ear1.setRotationPoint(-1.0F, 3.5F, -1.0F);
		ears.addChild(ear1);
		setRotationAngle(ear1, -0.3491F, 0.0F, 0.0F);
		ear1.setTextureOffset(16, 14).addBox(0.0F, -2.5F, -4.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		ear2 = new ModelRenderer(this);
		ear2.setRotationPoint(0.0F, 0.0F, 0.0F);
		ears.addChild(ear2);
		setRotationAngle(ear2, 0.48F, 0.0F, 0.0F);
		ear2.setTextureOffset(16, 14).addBox(-1.0F, 0.75F, 1.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 14.0F, 2.0F);
		

		body_rotation = new ModelRenderer(this);
		body_rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_rotation);
		setRotationAngle(body_rotation, 1.5708F, 0.0F, 0.0F);
		body_rotation.setTextureOffset(18, 14).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 7.0F, 6.0F, 0.0F, false);

		mane = new ModelRenderer(this);
		mane.setRotationPoint(1.0F, 14.0F, 2.0F);
		

		mane_rotation = new ModelRenderer(this);
		mane_rotation.setRotationPoint(-1.0F, 2.5F, -2.5F);
		mane.addChild(mane_rotation);
		setRotationAngle(mane_rotation, 1.5708F, 0.0F, 0.0F);
		mane_rotation.setTextureOffset(21, 0).addBox(-4.0F, -5.5F, -3.5F, 8.0F, 4.0F, 7.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.5F, 20.0F, 4.0F);
		leg1.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(1.5F, 20.0F, 4.0F);
		leg2.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-1.5F, 20.0F, -4.0F);
		leg3.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(1.5F, 20.0F, -4.0F);
		leg4.setTextureOffset(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(1.0F, 12.0F, 10.0F);
		tail.setTextureOffset(9, 18).addBox(-2.0F, 1.25F, -5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(9, 18).addBox(-2.0F, -0.75F, -5.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(9, 18).addBox(-2.0F, -0.25F, -7.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		mane.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}



	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.855F * limbSwingAmount;
	      this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.85F * limbSwingAmount;
		
	      this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.85F * limbSwingAmount;
	      this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.85F * limbSwingAmount; 
		
	}

	
	
}
