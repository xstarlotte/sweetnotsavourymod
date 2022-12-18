package com.charlotte.sweetnotsavourymod.data;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModBlockTagsProvider extends BlockTagsProvider {
	public ModBlockTagsProvider(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
		super(pGenerator, SweetNotSavouryMod.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags() {
		addTags(
				BlockTags.MINEABLE_WITH_AXE,
				BlockInit.POISONOAKMINIDOOR,
				BlockInit.STRAWBERRY_CANDY_DOOR,
				BlockInit.BLUEBERRY_CANDY_DOOR,
				BlockInit.BLACKBERRY_CANDY_DOOR,
				BlockInit.RASPBERRY_CANDY_DOOR,
				BlockInit.ORANGE_CANDY_DOOR,
				BlockInit.LEMON_CANDY_DOOR,
				BlockInit.LIME_CANDY_DOOR,
				BlockInit.MANGO_CANDY_DOOR,
				BlockInit.PEACH_CANDY_DOOR,
				BlockInit.PINEAPPLE_CANDY_DOOR,
				BlockInit.CANDYFLOSS_DOOR,
				BlockInit.WAFER_WOOD_DOOR,
				BlockInit.CHOCOLATE_WAFER_WOOD_DOOR,
				BlockInit.WAFER_PLANK_DOOR,
				BlockInit.CHOCOLATE_WAFER_PLANK_DOOR,
				BlockInit.FROSTING_DOOR,
				BlockInit.ROTTEN_MOULDY_CANDY_CANE_DOOR,
				BlockInit.TOOTHPASTE_DOOR
		);
	}
	
	@SafeVarargs
	private void addTags(TagKey<Block> tag, Supplier<? extends Block> ... blocks) {
		this.tag(tag).add(Stream.of(blocks).map(Supplier::get).toArray(Block[]::new));
	}
}
