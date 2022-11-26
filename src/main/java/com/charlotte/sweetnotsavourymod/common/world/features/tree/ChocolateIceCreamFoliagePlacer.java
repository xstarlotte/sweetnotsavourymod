package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.block.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

import java.util.Random;
import java.util.function.BiConsumer;

public class ChocolateIceCreamFoliagePlacer extends FoliagePlacer {
    public static final Codec<ChocolateIceCreamFoliagePlacer> CODEC =
            RecordCodecBuilder.create((placer) -> foliagePlacerParts(placer).apply(placer, ChocolateIceCreamFoliagePlacer::new));

    private static final Direction[] DIRECTIONS = new Direction[] {Direction.NORTH, Direction.EAST, Direction.SOUTH,
            Direction.WEST };

    public ChocolateIceCreamFoliagePlacer(FeatureSpread p_161411_, FeatureSpread p_161412_) {
        super(p_161411_, p_161412_);
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.CHOCOLATE_ICE_CREAM_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader reader, BiConsumer<BlockPos, BlockState> stateBiConsumer, Random random,
                                 TreeConfiguration configuration, int p_161426_, FoliageAttachment foliageAttachment,
                                 int p_161428_, int p_161429_, int p_161430_) {
        int height = 4;
        BlockPos pos = foliageAttachment.pos();
        for(BlockPos blockpos : BlockPos.betweenClosed(pos.getX() - 2, pos.getY() + height + 1, pos.getZ() - 2,
                pos.getX() + 2, pos.getY() + height + 2, pos.getZ() + 2)
        ) {
//gets rid of all corners. All the variables of 2 get rid of the corners on height + 3 leaves layer.
            if (blockpos.getX() == (pos.getX() - 2) && blockpos.getY() == pos.getY() + height + 2 && blockpos.getZ() == pos.getZ() - 2) {
                continue;
            }

            if (blockpos.getX() == (pos.getX() + 2) && blockpos.getY() == pos.getY() + height + 2 && blockpos.getZ() == pos.getZ() + 2) {
                continue;
            }

            if (blockpos.getX() == (pos.getX() - 2) && blockpos.getY() == pos.getY() + height + 2 && blockpos.getZ() == pos.getZ() + 2) {
                continue;
            }

            if (blockpos.getX() == (pos.getX() + 2) && blockpos.getY() == pos.getY() + height + 2 && blockpos.getZ() == pos.getZ() - 2) {
                continue;
            }

            tryPlaceLeaf(reader, stateBiConsumer, random, configuration, blockpos);
           // tryPlaceLeaf(reader, stateBiConsumer, random, configuration, blockpos.offset(0, 1, 0));
        }

//for the 3x3 leaves
        for(BlockPos blockpos : BlockPos.betweenClosed
                (pos.getX() - 1, pos.getY() + height + 3, pos.getZ() - 1,
                        pos.getX() + 1, pos.getY() + height + 3, pos.getZ() + 1)
        ) {

            tryPlaceLeaf(reader, stateBiConsumer, random, configuration, blockpos);
        }

        for (Direction d : DIRECTIONS) {
            tryPlaceLeaf(reader, stateBiConsumer, random, configuration, new BlockPos(pos.getX(), pos.getY() + height + 4, pos.getZ())
                    .relative(d, 1));

        }

        for (int i = pos.getY() + height + 6; i > pos.getY() + height + 3; i--) {
            tryPlaceLeaf(reader, stateBiConsumer, random, configuration, new BlockPos(pos.getX(), i, pos.getZ()));
        }
    }

    @Override
    public int foliageHeight(Random p_68568_, int p_68569_, TreeConfiguration p_68570_) {
        return 0;
    }

    @Override
    protected boolean shouldSkipLocation(Random p_68562_, int p_68563_, int p_68564_, int p_68565_, int p_68566_, boolean p_68567_) {
        return false;
    }
}
