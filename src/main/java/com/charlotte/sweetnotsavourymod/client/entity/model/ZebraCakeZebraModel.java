package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.ZebraCakeZebraEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ZebraCakeZebraModel<T extends ZebraCakeZebraEntity> extends EntityModel<T> {
	private final ModelRenderer head;
	private final ModelRenderer mouth;
	private final ModelRenderer left_ear;
	private final ModelRenderer right_ear;
	private final ModelRenderer neck;
	private final ModelRenderer mane;
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer tailhair;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer child_front_left_leg;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer child_front_right_leg;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer child_back_left_leg;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r8;
	private final ModelRenderer child_back_right_leg;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r10;

	public ZebraCakeZebraModel() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -8.9888F, -16.85F);
		setRotationAngle(head, 0.6981F, 0.0F, 0.0F);
		head.setTextureOffset(42, 0).addBox(-3.0F, -0.2019F, -5.4284F, 6.0F, 5.0F, 7.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 0.0F, -6.0F);
		head.addChild(mouth);
		mouth.setTextureOffset(77, 0).addBox(-2.0F, -0.2019F, -4.4284F, 4.0F, 5.0F, 5.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(-1.5F, -3.6961F, 3.3815F);
		head.addChild(left_ear);
		setRotationAngle(left_ear, -0.3054F, 0.0F, 0.0F);
		left_ear.setTextureOffset(15, 0).addBox(-1.0F, 1.2716F, -1.6481F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(1.5F, -3.7733F, 3.3396F);
		head.addChild(right_ear);
		setRotationAngle(right_ear, -0.3491F, 0.0F, 0.0F);
		right_ear.setTextureOffset(15, 0).addBox(-1.0F, 1.3191F, -1.5261F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 5.5F, 1.0F);
		head.addChild(neck);
		neck.setTextureOffset(0, 0).addBox(-2.0F, -3.7019F, -5.4284F, 4.0F, 12.0F, 7.0F, 0.0F, false);

		mane = new ModelRenderer(this);
		mane.setRotationPoint(0.0F, 5.5F, 5.5F);
		head.addChild(mane);
		mane.setTextureOffset(117, 25).addBox(-1.0F, -5.7019F, -3.9284F, 2.0F, 16.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.5F, 1.5F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-5.5F, -2.0F, -11.0F, 11.0F, 10.0F, 22.0F, 0.05F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -2.8775F, 10.7789F);
		

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(0.0F, 22.3775F, -10.7789F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 0.0873F, 0.0F, 0.0F);
		tail_r1.setTextureOffset(120, 7).addBox(-1.0F, -18.3F, 11.9F, 2.0F, 14.0F, 2.0F, 0.0F, false);

		tailhair = new ModelRenderer(this);
		tailhair.setRotationPoint(0.0305F, 12.4775F, 1.7835F);
		tail.addChild(tailhair);
		tailhair.setTextureOffset(116, 0).addBox(-2.4305F, 4.0F, 0.2376F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0305F, -6.0F, -1.0624F);
		tailhair.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.setTextureOffset(116, 0).addBox(-3.4F, 10.0F, 0.3F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.0305F, -6.0F, -1.0624F);
		tailhair.addChild(cube_r2);
		setRotationAngle(cube_r2, -3.1416F, 0.9163F, 3.1416F);
		cube_r2.setTextureOffset(116, 0).addBox(-3.4F, 10.0F, -0.7F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.0305F, -6.0F, -1.0624F);
		tailhair.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.9599F, 0.0F);
		cube_r3.setTextureOffset(116, 0).addBox(-3.4F, 10.0F, 0.3F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		child_front_left_leg = new ModelRenderer(this);
		child_front_left_leg.setRotationPoint(-4.0F, 9.5F, -9.0F);
		child_front_left_leg.setTextureOffset(0, 32).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 1.5F, -0.5F);
		child_front_left_leg.addChild(bone);
		bone.setTextureOffset(0, 118).addBox(-1.0F, 12.0F, -2.7F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 124).addBox(-1.0F, 11.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(36, 124).addBox(-1.1F, 10.0F, -0.1F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(36, 124).addBox(-0.9F, 10.0F, -0.1F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone2);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 12.5F, -4.0F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.6109F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(17, 123).addBox(1.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(17, 123).addBox(0.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(17, 123).addBox(-0.9F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(17, 123).addBox(-2.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		child_front_right_leg = new ModelRenderer(this);
		child_front_right_leg.setRotationPoint(3.0F, 6.5F, -9.0F);
		child_front_right_leg.setTextureOffset(0, 32).addBox(-2.0F, 2.5F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.0F, 4.5F, -0.5F);
		child_front_right_leg.addChild(bone3);
		bone3.setTextureOffset(0, 118).addBox(-1.0F, 12.0F, -2.7F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		bone3.setTextureOffset(0, 124).addBox(-1.0F, 11.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		bone3.setTextureOffset(36, 124).addBox(-1.1F, 10.0F, -0.1F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		bone3.setTextureOffset(36, 124).addBox(-0.9F, 10.0F, -0.1F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone4);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.0F, 12.5F, -4.0F);
		bone4.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.6109F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(17, 123).addBox(1.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.setTextureOffset(17, 123).addBox(0.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.setTextureOffset(17, 123).addBox(-0.9F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.setTextureOffset(17, 123).addBox(-2.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone5);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0F, 12.5F, -4.0F);
		bone5.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.6109F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(17, 123).addBox(1.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r6.setTextureOffset(17, 123).addBox(0.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r6.setTextureOffset(17, 123).addBox(-0.9F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r6.setTextureOffset(17, 123).addBox(-2.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		child_back_left_leg = new ModelRenderer(this);
		child_back_left_leg.setRotationPoint(3.0F, 6.5F, 9.0F);
		child_back_left_leg.setTextureOffset(0, 32).addBox(-2.0F, 2.5F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-1.0F, 5.5F, 0.6F);
		child_back_left_leg.addChild(bone10);
		bone10.setTextureOffset(0, 118).addBox(-1.0F, 11.0F, -2.7F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		bone10.setTextureOffset(0, 124).addBox(-1.0F, 10.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		bone10.setTextureOffset(36, 124).addBox(-1.1F, 9.0F, -0.5F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		bone10.setTextureOffset(36, 124).addBox(-0.9F, 9.0F, -0.6F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone10.addChild(bone11);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.0F, 12.5F, -4.0F);
		bone11.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.6109F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(17, 123).addBox(1.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r7.setTextureOffset(17, 123).addBox(0.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r7.setTextureOffset(17, 123).addBox(-0.9F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r7.setTextureOffset(17, 123).addBox(-2.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -1.0F, -0.1F);
		bone10.addChild(bone9);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0F, 12.5F, -4.0F);
		bone9.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.6109F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(17, 123).addBox(1.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r8.setTextureOffset(17, 123).addBox(0.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r8.setTextureOffset(17, 123).addBox(-0.9F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r8.setTextureOffset(17, 123).addBox(-2.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		child_back_right_leg = new ModelRenderer(this);
		child_back_right_leg.setRotationPoint(-4.0F, 6.5F, 9.0F);
		child_back_right_leg.setTextureOffset(0, 32).addBox(-2.0F, 2.5F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.0F, 5.5F, 1.5F);
		child_back_right_leg.addChild(bone6);
		bone6.setTextureOffset(0, 118).addBox(-1.0F, 11.0F, -4.7F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		bone6.setTextureOffset(0, 124).addBox(-1.0F, 10.0F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		bone6.setTextureOffset(36, 124).addBox(-1.1F, 9.0F, -2.1F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		bone6.setTextureOffset(36, 124).addBox(-0.9F, 9.0F, -2.1F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(1.0F, -1.0F, -1.0F);
		bone6.addChild(bone7);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.0F, 12.5F, -4.0F);
		bone7.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.6109F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(17, 123).addBox(0.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r9.setTextureOffset(17, 123).addBox(-0.9F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -1.0F, -2.0F);
		bone6.addChild(bone8);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0F, 12.5F, -4.0F);
		bone8.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.6109F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(17, 123).addBox(1.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r10.setTextureOffset(17, 123).addBox(0.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r10.setTextureOffset(17, 123).addBox(-0.9F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r10.setTextureOffset(17, 123).addBox(-2.1F, 0.2F, 0.7F, 1.0F, 1.0F, 4.0F, 0.0F, false);
	}

	
	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		child_front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		child_front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		child_back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		child_back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}


	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.child_front_left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.855F * limbSwingAmount;
	      this.child_front_right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.85F * limbSwingAmount;
		
	      this.child_back_left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.85F * limbSwingAmount;
	      this.child_back_right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.85F * limbSwingAmount; 
		
	}
}
