package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;

import java.util.Random;
import java.util.Set;

public class IceCreamFoliagePlacer extends FoliagePlacer {
    public static final Codec<IceCreamFoliagePlacer> CODEC =
            RecordCodecBuilder.create((placer) -> foliagePlacerParts(placer).apply(placer, IceCreamFoliagePlacer::new));

    private static final Direction[] DIRECTIONS = new Direction[] {Direction.NORTH, Direction.EAST, Direction.SOUTH,
            Direction.WEST };

    public IceCreamFoliagePlacer(FeatureSpread p_161411_, FeatureSpread p_161412_) {
        super(p_161411_, p_161412_);
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.ICE_CREAM_FOLIAGE_PLACER.get();
    }
    
    @Override
    protected void createFoliage(IWorldGenerationReader reader, Random random, BaseTreeFeatureConfig configuration, int p_230372_4_, Foliage foliageAttachment, int p_230372_6_, int p_230372_7_, Set<BlockPos> positions, int p_230372_9_, MutableBoundingBox resultSize) {
        //TODO fix
        int height = 4;
        BlockPos pos = foliageAttachment.foliagePos();
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
    
            tryPlaceLeaf(reader, random, configuration, blockpos, positions, resultSize);
           // tryPlaceLeaf(reader, stateBiConsumer, random, configuration, blockpos.offset(0, 1, 0));
        }

//for the 3x3 leaves
        for(BlockPos blockpos : BlockPos.betweenClosed
                (pos.getX() - 1, pos.getY() + height + 3, pos.getZ() - 1,
                        pos.getX() + 1, pos.getY() + height + 3, pos.getZ() + 1)
        ) {
    
            tryPlaceLeaf(reader, random, configuration, blockpos, positions, resultSize);
        }

        for (Direction d : DIRECTIONS) {
            tryPlaceLeaf(reader, random, configuration, new BlockPos(pos.getX(), pos.getY() + height + 4, pos.getZ())
                    .relative(d, 1), positions, resultSize);

        }

        for (int i = pos.getY() + height + 6; i > pos.getY() + height + 3; i--) {
            tryPlaceLeaf(reader, random, configuration, new BlockPos(pos.getX(), i, pos.getZ()), positions, resultSize);
        }
    }
    
    protected void tryPlaceLeaf(IWorldGenerationReader world, Random rand, BaseTreeFeatureConfig conf, BlockPos pos, Set<BlockPos> positions, MutableBoundingBox resultSize) {
        placeLeavesRow(world, rand, conf, pos, 0, positions, 0, false, resultSize);
    }
    
    @Override
    public int foliageHeight(Random pRandom, int pHeight, BaseTreeFeatureConfig pConfig) {
        return 0;
    }

    @Override
    protected boolean shouldSkipLocation(Random p_68562_, int p_68563_, int p_68564_, int p_68565_, int p_68566_, boolean p_68567_) {
        return false;
    }
}
