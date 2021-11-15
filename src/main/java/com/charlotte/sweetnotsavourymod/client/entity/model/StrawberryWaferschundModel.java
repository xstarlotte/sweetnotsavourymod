package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.StrawberryWaferschundEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class StrawberryWaferschundModel<T extends StrawberryWaferschundEntity> extends EntityModel<T> {
	private final ModelRenderer wholebody;
	private final ModelRenderer leg4;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leg3;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leg2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leg1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer mane;
	private final ModelRenderer mane_rotation;
	private final ModelRenderer mane_sub_1;
	private final ModelRenderer body;
	private final ModelRenderer body_rotation;
	private final ModelRenderer IceCreamWolf;
	private final ModelRenderer cube_r5;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r6;
	private final ModelRenderer head;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public StrawberryWaferschundModel() {
		textureWidth = 64;
		textureHeight = 32;

		wholebody = new ModelRenderer(this);
		wholebody.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-1.5F, -4.0F, 4.5F);
		wholebody.addChild(leg4);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, 4.0F, -8.0F);
		leg4.addChild(cube_r1);
		setRotationAngle(cube_r1, -3.1416F, -0.0436F, 3.1416F);
		cube_r1.setTextureOffset(58, 9).addBox(1.0F, -1.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(58, 5).addBox(1.0F, -3.0F, -6.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(1.5F, -4.0F, -0.1F);
		wholebody.addChild(leg3);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, 4.0F, -3.0F);
		leg3.addChild(cube_r2);
		setRotationAngle(cube_r2, -3.1416F, -0.0436F, 3.1416F);
		cube_r2.setTextureOffset(58, 9).addBox(-2.0F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(58, 5).addBox(-2.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(1.5F, -4.0F, 4.6F);
		wholebody.addChild(leg2);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, 4.0F, -8.0F);
		leg2.addChild(cube_r3);
		setRotationAngle(cube_r3, -3.1416F, -0.0436F, 3.1416F);
		cube_r3.setTextureOffset(58, 9).addBox(-2.0F, -1.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(58, 5).addBox(-2.0F, -3.0F, -6.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.5F, -4.0F, -0.2F);
		wholebody.addChild(leg1);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.5F, 4.0F, -3.0F);
		leg1.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.1416F, -0.0436F, 3.1416F);
		cube_r4.setTextureOffset(58, 9).addBox(1.0F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(58, 5).addBox(1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		mane = new ModelRenderer(this);
		mane.setRotationPoint(1.0F, -6.0F, 1.0F);
		wholebody.addChild(mane);
		

		mane_rotation = new ModelRenderer(this);
		mane_rotation.setRotationPoint(-1.0F, -1.5F, -1.5F);
		mane.addChild(mane_rotation);
		setRotationAngle(mane_rotation, 1.5708F, 0.0F, 0.0F);
		

		mane_sub_1 = new ModelRenderer(this);
		mane_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		mane_rotation.addChild(mane_sub_1);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -6.0F, 2.0F);
		wholebody.addChild(body);
		setRotationAngle(body, 0.0F, 0.0F, -0.0436F);
		

		body_rotation = new ModelRenderer(this);
		body_rotation.setRotationPoint(0.0F, -3.0F, 0.0F);
		body.addChild(body_rotation);
		setRotationAngle(body_rotation, 1.5708F, 0.0F, 0.0F);
		

		IceCreamWolf = new ModelRenderer(this);
		IceCreamWolf.setRotationPoint(0.0F, 0.0F, 0.0F);
		body_rotation.addChild(IceCreamWolf);
		setRotationAngle(IceCreamWolf, -1.5708F, 0.0F, 0.0F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 5.0F, 2.0F);
		IceCreamWolf.addChild(cube_r5);
		setRotationAngle(cube_r5, -3.1416F, -0.0436F, -3.098F);
		cube_r5.setTextureOffset(42, 19).addBox(-2.18F, -3.0F, 1.1983F, 4.0F, 4.0F, 7.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -6.0F, 7.0F);
		wholebody.addChild(tail);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 7.0F, -10.0F);
		tail.addChild(cube_r6);
		setRotationAngle(cube_r6, -3.1416F, -0.0436F, 3.1416F);
		cube_r6.setTextureOffset(54, 11).addBox(0.0F, -8.0F, -8.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r6.setTextureOffset(52, 15).addBox(-1.0F, -7.0F, -8.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r6.setTextureOffset(51, 28).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r6.setTextureOffset(41, 28).addBox(-1.0F, -8.0F, -8.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r6.setTextureOffset(33, 29).addBox(-1.0F, -10.0F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r6.setTextureOffset(45, 0).addBox(-1.0F, -11.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(36, 13).addBox(0.0F, -9.0F, -8.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r6.setTextureOffset(7, 28).addBox(-1.0F, -9.0F, -8.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -5.0F, 1.0F);
		wholebody.addChild(head);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 5.5F, -4.0F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, -3.1416F, -0.0436F, 3.1416F);
		cube_r7.setTextureOffset(56, 29).addBox(0.0F, -9.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(58, 20).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(47, 14).addBox(-2.0F, -9.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(25, 29).addBox(-1.0F, -10.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(16, 29).addBox(0.0F, -10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(45, 0).addBox(0.0F, -12.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 30).addBox(-1.0F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(-1.9F, -8.0F, -1.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 5.3F, -4.5F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, -3.1416F, -0.0436F, 3.1416F);
		cube_r8.setTextureOffset(58, 0).addBox(-3.0F, -8.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.5F, -1.2F, -4.3F);
		head.addChild(cube_r9);
		setRotationAngle(cube_r9, -3.1416F, -0.0436F, 3.1416F);
		cube_r9.setTextureOffset(58, 0).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
	}

	

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		wholebody.render(matrixStack, buffer, packedLight, packedOverlay);
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
