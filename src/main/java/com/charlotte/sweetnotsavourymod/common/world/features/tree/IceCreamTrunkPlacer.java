package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class IceCreamTrunkPlacer extends AbstractTrunkPlacer {
    public static TrunkPlacerType<?> type;

    private static final Direction[] DIRECTIONS = new Direction[] {Direction.NORTH, Direction.EAST, Direction.SOUTH,
            Direction.WEST };
    private static final BlockState LOG = BlockInit.WAFERWOODBLOCK.get().defaultBlockState();

    public static final Codec<IceCreamTrunkPlacer> CODEC = RecordCodecBuilder.create((p_70206_) -> {
        return trunkPlacerParts(p_70206_).apply(p_70206_, IceCreamTrunkPlacer::new);
    });

    public IceCreamTrunkPlacer(int p_70268_, int p_70269_, int p_70270_) {
        super(p_70268_, p_70269_, p_70270_);
    }

    @Override
    protected TrunkPlacerType<?> type() {
//        return ModTrunkPlacerTypes.ICE_TRUNK_PLACER;
        return TrunkPlacerType.STRAIGHT_TRUNK_PLACER;
    }
    
    @Override
    public List<FoliagePlacer.Foliage> placeTrunk(IWorldGenerationReader reader, Random random, int p_230382_3_, BlockPos pos, Set<BlockPos> positions, MutableBoundingBox mbb, BaseTreeFeatureConfig configuration) {
        int height = 4;
        for (int i = pos.getY(); i < pos.getY() + height + 1; i++) {
            placeLog(reader, random, new BlockPos(pos.getX(), i, pos.getZ()), positions, mbb, configuration);

            for (Direction d : DIRECTIONS) {
                placeLog(reader, random, new BlockPos(pos.getX(), i, pos.getZ()).relative(d, 1), positions, mbb, configuration);

                for (Direction di : DIRECTIONS) {
                    placeLog(reader, random, new BlockPos(pos.getX() - 1, pos.getY() + height, pos.getZ())
                            .relative(Direction.NORTH, 1), positions, mbb, configuration);
                    placeLog(reader, random, new BlockPos(pos.getX(), pos.getY() + height, pos.getZ() + 1)
                            .relative(Direction.WEST, 1), positions, mbb, configuration);
                    placeLog(reader, random, new BlockPos(pos.getX() + 1, pos.getY() + height, pos.getZ() - 2)
                            .relative(Direction.SOUTH, 1), positions, mbb, configuration);
                    placeLog(reader, random, new BlockPos(pos.getX(), pos.getY() + height, pos.getZ() + 1)
                            .relative(Direction.EAST, 1), positions, mbb, configuration);
                }
            }
        }

        BlockPos.Mutable mutableBlockPos = pos.mutable();
        return ImmutableList.of(new FoliagePlacer.Foliage(mutableBlockPos, 0, false));
    }
}
