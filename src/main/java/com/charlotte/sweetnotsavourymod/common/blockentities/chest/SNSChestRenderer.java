package com.charlotte.sweetnotsavourymod.common.blockentities.chest;

import com.charlotte.sweetnotsavourymod.common.block.SNSChestBlock;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraftforge.client.model.data.ModelData;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SNSChestRenderer implements BlockEntityRenderer<SNSChestBlockEntity> {
	private final SNSChestBlock chestBlock;
	private final double axisDistance, axisHeight;

	private final ResourceLocation base, lid, base2, lid2;

	public SNSChestRenderer(BlockEntityRendererProvider.Context ctx, SNSChestBlock chestBlock, double axisDistance, double axisHeight) {
		this.chestBlock = chestBlock;

		this.axisDistance = axisDistance;
		this.axisHeight = axisHeight;

		ResourceLocation loc = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(chestBlock));
		String ns = loc.getNamespace();
		String path = loc.getPath();

		base  = new ResourceLocation(ns, "block/" + path + "_base");
		lid   = new ResourceLocation(ns, "block/" + path + "_lid");
		base2 = new ResourceLocation(ns, "block/" + path + "_base2");
		lid2  = new ResourceLocation(ns, "block/" + path + "_lid2");
	}

	private static final float HALF_PI = (float)Math.PI / 2;
	@Override
	public void render(SNSChestBlockEntity entity, float partialTick, PoseStack stack, MultiBufferSource bufferSource, int light, int overlay) {
		Minecraft minecraft = Minecraft.getInstance();
		ModelManager models = minecraft.getModelManager();

		Level level = entity.getLevel();
		BlockPos pos = entity.getBlockPos();
		BlockState state = entity.getBlockState();
		float openness = entity.getOpenNess(partialTick);

		if (level == null)
			return;


		boolean doubleChest = false;
		if (chestBlock.doubleAble) {
			ChestType type = state.getValue(SNSChestBlock.TYPE);
			if (type == ChestType.LEFT)
				return;
			if (type == ChestType.RIGHT)
				doubleChest = true;
		}


		BakedModel baseModel = models.getModel(doubleChest ? base2 : base);
		BakedModel lidModel = models.getModel(doubleChest ? lid2 : lid);

		stack.pushPose();

		transformFacing(stack, state.getValue(SNSChestBlock.FACING));
		render(level, pos, state, stack, bufferSource, baseModel);
		transformLid(stack, openness, axisHeight, axisDistance);
		render(level, pos, state, stack, bufferSource, lidModel);

		stack.popPose();
	}

	private static void transformFacing(PoseStack stack, Direction direction) {
		switch (direction) {
			case NORTH -> {}
			case SOUTH -> {
				stack.mulPose(Vector3f.YP.rotationDegrees(180));
				stack.translate(-1, 0, -1);
			}
			case WEST -> {
				stack.mulPose(Vector3f.YP.rotationDegrees(90));
				stack.translate(-1, 0, 0);
			}
			case EAST -> {
				stack.mulPose(Vector3f.YP.rotationDegrees(270));
				stack.translate(0, 0, -1);
			}
		}
	}

	private static void transformLid(PoseStack stack, float openness, double axisHeight, double axisDistance) {
		openness = 1.0F - openness;
		openness = 1.0F - openness * openness * openness;

		stack.translate(0, axisHeight, axisDistance);
		stack.mulPose(new Quaternion(Vector3f.XP, openness * HALF_PI, false));
		stack.translate(0, -axisHeight, -axisDistance);
	}

	private void render(Level level, BlockPos pos, BlockState state, PoseStack stack, MultiBufferSource bufferIn, BakedModel model){
		RenderType renderType = ItemBlockRenderTypes.getRenderType( state , false );
		Minecraft.getInstance().getBlockRenderer().getModelRenderer().tesselateWithoutAO( level , model , state , pos , stack , bufferIn.getBuffer( renderType ) , false , level.random , state.getSeed( pos ) , OverlayTexture.NO_OVERLAY ,
				ModelData.EMPTY, renderType);

	}
}
