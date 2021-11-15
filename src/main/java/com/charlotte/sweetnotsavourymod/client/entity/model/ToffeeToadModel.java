package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.ToffeeToadEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ToffeeToadModel<T extends ToffeeToadEntity> extends EntityModel<T> {

	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer left_ear;
	private final ModelRenderer right_ear;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_thigh;
	private final ModelRenderer right_thigh;
	private final ModelRenderer left_foot;
	private final ModelRenderer right_foot;
	private final ModelRenderer tail;
	private final ModelRenderer left_arm2;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;

	public ToffeeToadModel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.5F, -3.0F);
		head.setTextureOffset(0, 12).addBox(-2.5F, -1.0F, -5.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, 16.5F, -3.0F);
		

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(0.0F, 16.5F, -3.0F);
		

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(-2.0F, 16.5F, -7.0F);
		setRotationAngle(right_ear, 0.0F, 1.5708F, 0.0F);
		right_ear.setTextureOffset(0, 3).addBox(-2.5F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		right_ear.setTextureOffset(0, 0).addBox(-2.5F, -2.0F, 4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, 7.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, 1.0F, -10.0F, 6.0F, 5.0F, 7.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-3.0F, 17.0F, -1.6F);
		setRotationAngle(left_arm, -0.48F, 0.0F, 0.0F);
		left_arm.setTextureOffset(14, 25).addBox(5.0F, 2.8F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		left_thigh = new ModelRenderer(this);
		left_thigh.setRotationPoint(-3.0F, 16.0F, 2.5F);
		setRotationAngle(left_thigh, 0.0F, -0.4363F, 0.0F);
		left_thigh.setTextureOffset(0, 19).addBox(5.0F, 3.0F, -5.6F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		right_thigh = new ModelRenderer(this);
		right_thigh.setRotationPoint(3.0F, 16.0F, 2.5F);
		setRotationAngle(right_thigh, 0.0F, 0.3491F, 0.0F);
		right_thigh.setTextureOffset(15, 14).addBox(-7.0F, 3.0F, -4.9F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		left_foot = new ModelRenderer(this);
		left_foot.setRotationPoint(-3.8F, 14.5F, 4.2F);
		setRotationAngle(left_foot, 0.0F, -0.4363F, 0.0F);
		left_foot.setTextureOffset(21, 7).addBox(5.0F, 8.5F, -8.5F, 2.0F, 1.0F, 5.0F, 0.0F, false);

		right_foot = new ModelRenderer(this);
		right_foot.setRotationPoint(3.7F, 14.5F, 4.2F);
		setRotationAngle(right_foot, 0.0F, 0.3491F, 0.0F);
		right_foot.setTextureOffset(19, 0).addBox(-7.0F, 8.5F, -7.7F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		right_foot.setTextureOffset(22, 13).addBox(-8.5F, 9.5F, -9.7F, 5.0F, 0.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 17.25F, 6.5F);
		

		left_arm2 = new ModelRenderer(this);
		left_arm2.setRotationPoint(-8.0F, 17.0F, -1.6F);
		setRotationAngle(left_arm2, -0.48F, 0.0F, 0.0F);
		left_arm2.setTextureOffset(22, 23).addBox(5.0F, 2.8F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.2F, 24.0F, -1.0F);
		setRotationAngle(bone, 0.0F, -0.4363F, 0.0F);
		bone.setTextureOffset(22, 15).addBox(1.2F, 0.0F, -3.6F, 5.0F, 0.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone2.setTextureOffset(22, 17).addBox(0.6F, 0.0F, -7.0F, 5.0F, 0.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone3.setTextureOffset(12, 23).addBox(-4.6F, 0.0F, -7.0F, 5.0F, 0.0F, 2.0F, 0.0F, false);
	}

	

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		nose.render(matrixStack, buffer, packedLight, packedOverlay);
		left_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		right_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_thigh.render(matrixStack, buffer, packedLight, packedOverlay);
		right_thigh.render(matrixStack, buffer, packedLight, packedOverlay);
		left_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		right_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm2.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}



	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// TODO Auto-generated method stub
		
	}
}
