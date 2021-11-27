package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.poisonberries.PoisonBerrySpriteEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class PoisonBerrySpriteModel<T extends PoisonBerrySpriteEntity> extends EntityModel<T> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer dress;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer legs;
	private final ModelRenderer leg1;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer leg2;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer arms;
	private final ModelRenderer arm1;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer arm2;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r36;

	public PoisonBerrySpriteModel() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.503F, -0.8715F, 1.5189F);
		cube_r1.setTextureOffset(10, 12).addBox(1.1F, -8.3F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(16, 14).addBox(-4.4F, -12.5F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.5175F, -0.6102F, 1.5403F);
		cube_r2.setTextureOffset(14, 4).addBox(-1.9F, -8.3F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.5244F, -0.3487F, 1.5549F);
		cube_r3.setTextureOffset(14, 7).addBox(-4.9F, -7.5F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.5268F, -0.1308F, 1.5651F);
		cube_r4.setTextureOffset(14, 14).addBox(-7.4F, -6.3F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.5261F, 0.218F, 1.5805F);
		cube_r5.setTextureOffset(2, 16).addBox(-10.1F, -3.4F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.5216F, 0.4795F, 1.5935F);
		cube_r6.setTextureOffset(4, 16).addBox(-11.6F, -0.7F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.527F, -0.0872F, 1.567F);
		cube_r7.setTextureOffset(8, 16).addBox(-10.4F, -6.8F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, -1.5227F, -0.4359F, 1.5505F);
		cube_r8.setTextureOffset(16, 10).addBox(-8.4F, -9.9F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.3717F, -1.3484F, 1.3765F);
		cube_r9.setTextureOffset(18, 0).addBox(0.9F, -13.1F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.3245F, -1.3909F, -1.3283F);
		cube_r10.setTextureOffset(18, 2).addBox(4.9F, -11.8F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r11);
		setRotationAngle(cube_r11, 1.4897F, -1.0021F, -1.5024F);
		cube_r11.setTextureOffset(18, 4).addBox(8.1F, -9.0F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.0F, 0.0F, 0.0F);
		head.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -1.5272F, 0.0F);
		cube_r12.setTextureOffset(0, 16).addBox(-1.1F, -11.5F, 0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r12.setTextureOffset(16, 4).addBox(-1.1F, -11.5F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r12.setTextureOffset(6, 16).addBox(-1.1F, -11.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r12.setTextureOffset(16, 7).addBox(-0.5F, -11.6F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r12.setTextureOffset(8, 12).addBox(0.1F, -11.1F, -0.1F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r12.setTextureOffset(14, 10).addBox(0.1F, -11.1F, 0.1F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r12.setTextureOffset(12, 14).addBox(0.1F, -11.1F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r12.setTextureOffset(16, 16).addBox(0.0F, -11.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r12.setTextureOffset(3, 19).addBox(1.0F, -12.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.0F, -1.0F, 0.0F);
		head.addChild(cube_r13);
		setRotationAngle(cube_r13, 2.3998F, -1.5272F, 0.0F);
		cube_r13.setTextureOffset(12, 16).addBox(0.0F, 7.0F, 6.6F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.0F, -1.0F, 0.0F);
		head.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.7418F, -1.5272F, 0.0F);
		cube_r14.setTextureOffset(0, 17).addBox(0.0F, -6.6F, 8.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.0F, -1.0F, 0.0F);
		head.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -1.5272F, 0.0F);
		cube_r15.setTextureOffset(0, 12).addBox(-1.0F, -10.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		dress = new ModelRenderer(this);
		dress.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.0F, -1.0F, 0.0F);
		dress.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.829F, 0.0F);
		cube_r16.setTextureOffset(8, 0).addBox(-2.8F, -8.0F, -0.5F, 4.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(1.0F, -1.0F, 0.0F);
		dress.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.6981F, 0.0F);
		cube_r17.setTextureOffset(8, 0).addBox(-2.4F, -8.0F, 0.7F, 4.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.0F, -1.0F, 0.0F);
		dress.addChild(cube_r18);
		setRotationAngle(cube_r18, 3.1416F, -1.5272F, -3.1416F);
		cube_r18.setTextureOffset(8, 0).addBox(-1.9F, -8.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.0F, -1.0F, 0.0F);
		dress.addChild(cube_r19);
		setRotationAngle(cube_r19, 3.1416F, -0.0436F, 3.1416F);
		cube_r19.setTextureOffset(8, 0).addBox(-1.0F, -8.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, false);

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(1.0F, -4.0F, 0.0F);
		legs.addChild(leg1);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 4.0F, 0.0F);
		leg1.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, -1.5272F, 0.0F);
		cube_r20.setTextureOffset(1, 30).addBox(-1.9F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);
		cube_r20.setTextureOffset(10, 20).addBox(0.0F, -3.0F, -0.4F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 4.0F, 0.0F);
		leg1.addChild(cube_r21);
		setRotationAngle(cube_r21, 3.1416F, -0.0436F, 3.1416F);
		cube_r21.setTextureOffset(10, 20).addBox(0.1F, -3.0F, -0.4F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-1.0F, -4.0F, 0.0F);
		legs.addChild(leg2);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.0F, 4.0F, 0.0F);
		leg2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, -1.5272F, 0.0F);
		cube_r22.setTextureOffset(1, 30).addBox(-1.9F, 0.0F, 0.9F, 2.0F, 0.0F, 2.0F, 0.0F, false);
		cube_r22.setTextureOffset(8, 20).addBox(0.0F, -3.0F, 1.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(2.0F, 4.0F, 0.0F);
		leg2.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0436F, 0.0F);
		cube_r23.setTextureOffset(8, 20).addBox(-2.0F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(0.5595F, -8.2819F, -0.2125F);
		arms.addChild(arm1);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.4405F, 8.2819F, 0.2125F);
		arm1.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, -1.2217F, 0.0F);
		cube_r24.setTextureOffset(15, 22).addBox(0.1F, -5.9F, -3.7F, 0.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.4405F, 8.2819F, 0.2125F);
		arm1.addChild(cube_r25);
		setRotationAngle(cube_r25, -3.1416F, -1.3526F, 3.1416F);
		cube_r25.setTextureOffset(15, 22).addBox(-0.4F, -5.9F, -3.7F, 0.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.4405F, 8.2819F, 0.2125F);
		arm1.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, -1.5272F, 0.0F);
		cube_r26.setTextureOffset(15, 22).addBox(-0.2F, -5.9F, -3.7F, 0.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.4405F, 8.2819F, 0.2125F);
		arm1.addChild(cube_r27);
		setRotationAngle(cube_r27, -3.1212F, -0.1696F, 2.6586F);
		cube_r27.setTextureOffset(4, 20).addBox(-3.5F, -7.4F, -0.9F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.4405F, 8.2819F, 0.2125F);
		arm1.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.48F, -1.5272F, 0.0F);
		cube_r28.setTextureOffset(4, 20).addBox(-0.1F, -7.4F, -4.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-0.4F, -8.3F, 0.0F);
		arms.addChild(arm2);
		

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.4F, 8.3F, 0.0F);
		arm2.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, -1.2654F, 0.0F);
		cube_r29.setTextureOffset(25, 26).addBox(-0.9F, -5.7F, 2.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(1.4F, 8.3F, 0.0F);
		arm2.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, -1.5272F, 0.0F);
		cube_r30.setTextureOffset(25, 26).addBox(-0.1F, -5.7F, 2.6F, 0.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(1.4F, 8.3F, 0.0F);
		arm2.addChild(cube_r31);
		setRotationAngle(cube_r31, -3.1416F, -1.4399F, 3.1416F);
		cube_r31.setTextureOffset(25, 26).addBox(0.4F, -5.7F, 2.6F, 0.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(1.4F, 8.3F, 0.0F);
		arm2.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0234F, -0.0068F, 0.5666F);
		cube_r32.setTextureOffset(6, 20).addBox(-5.6F, -6.0F, -0.4F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(1.4F, 8.3F, 0.0F);
		arm2.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.5672F, -1.5272F, 0.0F);
		cube_r33.setTextureOffset(6, 20).addBox(-0.1F, -6.0F, 5.2F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(1.0F, 0.0F, 0.0F);
		tail.addChild(cube_r34);
		setRotationAngle(cube_r34, -1.5091F, -0.7844F, 1.5272F);
		cube_r34.setTextureOffset(4, 12).addBox(-2.8F, -2.8F, 0.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(1.0F, 0.0F, 0.0F);
		tail.addChild(cube_r35);
		setRotationAngle(cube_r35, -1.4438F, -1.2191F, 1.4515F);
		cube_r35.setTextureOffset(14, 0).addBox(0.4F, -2.9F, 0.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -3.5F, 0.0F);
		tail.addChild(bone);
		

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(1.0F, 4.0F, 0.0F);
		bone.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, -1.5272F, 0.0F);
		cube_r36.setTextureOffset(20, 14).addBox(4.2F, -2.9F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r36.setTextureOffset(20, 10).addBox(5.2F, -2.9F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r36.setTextureOffset(20, 7).addBox(5.2F, -2.9F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r36.setTextureOffset(0, 20).addBox(6.2F, -2.9F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r36.setTextureOffset(19, 19).addBox(4.2F, -2.9F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r36.setTextureOffset(15, 19).addBox(4.2F, -2.9F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r36.setTextureOffset(11, 19).addBox(3.2F, -2.9F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r36.setTextureOffset(7, 19).addBox(3.2F, -2.9F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r36.setTextureOffset(20, 12).addBox(4.2F, -2.9F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}



	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		dress.render(matrixStack, buffer, packedLight, packedOverlay);
		legs.render(matrixStack, buffer, packedLight, packedOverlay);
		arms.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}



	@Override
	public void setRotationAngles(PoisonBerrySpriteEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	
		this.arm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.2F * limbSwingAmount;
	      this.arm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.2F * limbSwingAmount;
		
	      this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.2F * limbSwingAmount;
	      this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.2F * limbSwingAmount; 
		
	}
}
