package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.RaspberryIceCreamParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class RaspberryIceCreamParrotModel<T extends RaspberryIceCreamParrotEntity> extends EntityModel<T> {
	private final ModelRenderer head;
	private final ModelRenderer feather;
	private final ModelRenderer body;
	private final ModelRenderer left_wing;
	private final ModelRenderer left_wing_rotation;
	private final ModelRenderer right_wing;
	private final ModelRenderer right_wing_rotation;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer tail;

	public RaspberryIceCreamParrotModel() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.0F, -0.5F);
		head.setTextureOffset(2, 2).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(10, 0).addBox(-1.0F, -2.5F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(11, 7).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 7).addBox(-0.5F, -1.75F, -2.95F, 1.0F, 2.0F, 1.0F, -0.01F, false);

		feather = new ModelRenderer(this);
		feather.setRotationPoint(-3.0F, -1.5F, 0.8F);
		head.addChild(feather);
		setRotationAngle(feather, -1.5708F, 1.309F, -1.5708F);
		feather.setTextureOffset(16, 16).addBox(0.0F, -9.0F, -1.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.5F, -1.0F);
		body.setTextureOffset(2, 8).addBox(-1.5F, 0.0F, -1.4F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(1.5F, 16.9F, -0.8F);
		

		left_wing_rotation = new ModelRenderer(this);
		left_wing_rotation.setRotationPoint(0.0F, 2.5F, 0.0F);
		left_wing.addChild(left_wing_rotation);
		setRotationAngle(left_wing_rotation, 0.0F, 3.1416F, 0.0F);
		left_wing_rotation.setTextureOffset(19, 8).addBox(-0.5F, -2.5F, -1.6F, 1.0F, 5.0F, 3.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(-1.5F, 16.9F, -0.8F);
		

		right_wing_rotation = new ModelRenderer(this);
		right_wing_rotation.setRotationPoint(0.0F, 2.5F, 0.0F);
		right_wing.addChild(right_wing_rotation);
		setRotationAngle(right_wing_rotation, 0.0F, 3.1416F, 0.0F);
		right_wing_rotation.setTextureOffset(19, 8).addBox(-0.5F, -2.5F, -1.6F, 1.0F, 5.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-1.0F, 22.0F, -1.0F);
		left_leg.setTextureOffset(14, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(1.0F, 22.0F, -1.0F);
		right_leg.setTextureOffset(14, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 21.1F, 1.2F);
		tail.setTextureOffset(22, 1).addBox(-1.5F, -1.0F, -0.9F, 3.0F, 4.0F, 1.0F, 0.0F, false);
	}

	

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.right_wing.rotateAngleZ = MathHelper.cos(limbSwing * 1.2F) * 0.8F * limbSwingAmount;
	      this.left_wing.rotateAngleZ = MathHelper.cos(limbSwing * 1.2F + (float)Math.PI) * 0.64F * limbSwingAmount;
	      this.tail.rotateAngleX = MathHelper.cos(limbSwing * 1.2F + (float)Math.PI) * 0.4F * limbSwingAmount;

	}




}
