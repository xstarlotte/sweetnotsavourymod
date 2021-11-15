package com.charlotte.sweetnotsavourymod.client.entity.model;

import com.charlotte.sweetnotsavourymod.common.entity.LemonParrotEntity;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.ParrotModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class LemonParrotModel<T extends LemonParrotEntity> extends EntityModel<T> {
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

	public LemonParrotModel() {
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

	public Iterable<ModelRenderer> getParts() {
	      return ImmutableList.of(this.body, this.left_wing, this.right_wing, this.tail, this.head, this.left_leg, this.right_leg);
	   }

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	      this.setRotationAngles(getParrotState(entityIn), entityIn.ticksExisted, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	   }

	   public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
	      this.setLivingAnimations(getParrotState(entityIn));
	   }

	   public void renderOnShoulder(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float p_228284_5_, float p_228284_6_, float p_228284_7_, float p_228284_8_, int p_228284_9_) {
	      this.setLivingAnimations(LemonParrotModel.State.ON_SHOULDER);
	      this.setRotationAngles(LemonParrotModel.State.ON_SHOULDER, p_228284_9_, p_228284_5_, p_228284_6_, 0.0F, p_228284_7_, p_228284_8_);
	      this.getParts().forEach((p_228285_4_) -> {
	         p_228285_4_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
	      });
	   }

	  

		public void setRotationAngles(LemonParrotModel.State p_217162_1_, int p_217162_2_, float p_217162_3_, float p_217162_4_, float p_217162_5_, float p_217162_6_, float p_217162_7_) {
			this.head.rotateAngleX = p_217162_7_ * ((float)Math.PI / 180F);
		      this.head.rotateAngleY = p_217162_6_ * ((float)Math.PI / 180F);
		      this.head.rotateAngleZ = 0.0F;
		      this.head.rotationPointX = 0.0F;
		      this.body.rotationPointX = 0.0F;
		      this.tail.rotationPointX = 0.0F;
		      this.right_wing.rotationPointX = -1.5F;
		      this.left_wing.rotationPointX = 1.5F;
		      switch(p_217162_1_) {
		      case SITTING:
		         break;
		      case PARTY:
		         float f = MathHelper.cos((float)p_217162_2_);
		         float f1 = MathHelper.sin((float)p_217162_2_);
		         this.head.rotationPointX = f;
		         this.head.rotationPointY = 15.69F + f1;
		         this.head.rotateAngleX = 0.0F;
		         this.head.rotateAngleY = 0.0F;
		         this.head.rotateAngleZ = MathHelper.sin((float)p_217162_2_) * 0.4F;
		         this.body.rotationPointX = f;
		         this.body.rotationPointY = 16.5F + f1;
		         this.left_wing.rotateAngleZ = -0.0873F - p_217162_5_;
		         this.left_wing.rotationPointX = 1.5F + f;
		         this.left_wing.rotationPointY = 16.94F + f1;
		         this.right_wing.rotateAngleZ = 0.0873F + p_217162_5_;
		         this.right_wing.rotationPointX = -1.5F + f;
		         this.right_wing.rotationPointY = 16.94F + f1;
		         this.tail.rotationPointX = f;
		         this.tail.rotationPointY = 21.07F + f1;
		         break;
		      case STANDING:
		         this.left_leg.rotateAngleX += MathHelper.cos(p_217162_3_ * 0.6662F) * 1.4F * p_217162_4_;
		         this.right_leg.rotateAngleX += MathHelper.cos(p_217162_3_ * 0.6662F + (float)Math.PI) * 1.4F * p_217162_4_;
		      case FLYING:
		      case ON_SHOULDER:
		      default:
		         float f2 = p_217162_5_ * 0.3F;
		         this.head.rotationPointY = 15.69F + f2;
		         this.tail.rotateAngleX = 1.015F + MathHelper.cos(p_217162_3_ * 0.6662F) * 0.3F * p_217162_4_;
		         this.tail.rotationPointY = 21.07F + f2;
		         this.body.rotationPointY = 16.5F + f2;
		         this.left_wing.rotateAngleZ = -0.0873F - p_217162_5_;
		         this.left_wing.rotationPointY = 16.94F + f2;
		         this.right_wing.rotateAngleZ = 0.0873F + p_217162_5_;
		         this.right_wing.rotationPointY = 16.94F + f2;
		         this.left_leg.rotationPointY = 22.0F + f2;
		         this.right_leg.rotationPointY = 22.0F + f2;
		      }
		}    

	   private void setLivingAnimations(LemonParrotModel.State p_217160_1_) {
	      this.feather.rotateAngleX = -0.2214F;
	      this.body.rotateAngleX = 0.4937F;
	      this.left_wing.rotateAngleX = -0.6981F;
	      this.left_wing.rotateAngleY = -(float)Math.PI;
	      this.right_wing.rotateAngleX = -0.6981F;
	      this.right_wing.rotateAngleY = -(float)Math.PI;
	      this.left_leg.rotateAngleX = -0.0299F;
	      this.right_leg.rotateAngleX = -0.0299F;
	      this.left_leg.rotationPointY = 22.0F;
	      this.right_leg.rotationPointY = 22.0F;
	      this.left_leg.rotateAngleZ = 0.0F;
	      this.right_leg.rotateAngleZ = 0.0F;
	      switch(p_217160_1_) {
	      case SITTING:
	         float f = 1.9F;
	         this.head.rotationPointY = 17.59F;
	         this.tail.rotateAngleX = 1.5388988F;
	         this.tail.rotationPointY = 22.97F;
	         this.body.rotationPointY = 18.4F;
	         this.left_wing.rotateAngleZ = -0.0873F;
	         this.left_wing.rotationPointY = 18.84F;
	         this.right_wing.rotateAngleZ = 0.0873F;
	         this.right_wing.rotationPointY = 18.84F;
	         ++this.left_leg.rotationPointY;
	         ++this.right_leg.rotationPointY;
	         ++this.left_leg.rotateAngleX;
	         ++this.right_leg.rotateAngleX;
	         break;
	      case PARTY:
	         this.left_leg.rotateAngleZ = -0.34906584F;
	         this.right_leg.rotateAngleZ = 0.34906584F;
	      case STANDING:
	      case ON_SHOULDER:
	      default:
	         break;
	      case FLYING:
	         this.left_leg.rotateAngleX += 0.6981317F;
	         this.right_leg.rotateAngleX += 0.6981317F;
	      }

	   }
	   public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	      private static LemonParrotModel.State getParrotState(LemonParrotEntity entityIn) {
		      if (entityIn.isPartying()) {
		         return LemonParrotModel.State.PARTY;
		      } else if (entityIn.isEntitySleeping()) {
		         return LemonParrotModel.State.SITTING;
		      } else {
		         return entityIn.isFlying() ? LemonParrotModel.State.FLYING : LemonParrotModel.State.STANDING;
		      }
		   }

		   @OnlyIn(Dist.CLIENT)
		   public static enum State {
		      FLYING,
		      STANDING,
		      SITTING,
		      PARTY,
		      ON_SHOULDER;
		   }
	   }
		
	
	
