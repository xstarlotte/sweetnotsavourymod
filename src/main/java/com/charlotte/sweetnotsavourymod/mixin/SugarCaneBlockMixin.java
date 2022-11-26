/*package com.charlotte.sweetnotsavourymod.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.tags.BlockTags;


/*@Mixin(value = SugarCaneBlock.class, priority = 1010)
public abstract class SugarCaneBlockMixin extends Block {

	private SugarCaneBlockMixin(Properties p_i48440_1_) {
		super(p_i48440_1_);
	}
	
	private static final Tag.Named<Block> SUGARCANE_CAN_LIVE_TAG = BlockTags.bind(new ResourceLocation("minecraft:sugarcane_can_live").toString());
	
	@Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;isIn(Lnet/minecraft/world/level/block/Block;)Z", ordinal = 0),
			method = "Lnet/minecraft/world/level/block/SugarCaneBlock;canSurvive(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z")
	private boolean sweetnotsavourymod$canSurvive(BlockState blockstate, Block block, BlockState methodState, LevelReader level, BlockPos pos) {
		return blockstate.is(SUGARCANE_CAN_LIVE_TAG) || blockstate.is(Blocks.GRASS_BLOCK);
	}
}
*/