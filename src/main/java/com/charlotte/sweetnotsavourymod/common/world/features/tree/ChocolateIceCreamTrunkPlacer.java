package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.charlotte.sweetnotsavourymod.core.init.BlockInit;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

public class ChocolateIceCreamTrunkPlacer extends TrunkPlacer {
    public static TrunkPlacerType<?> type;

    private static final Direction[] DIRECTIONS = new Direction[] {Direction.NORTH, Direction.EAST, Direction.SOUTH,
            Direction.WEST };
    private static final BlockState LOG = BlockInit.CHOCOLATEWAFERWOODBLOCK.get().defaultBlockState();

    public static final Codec<ChocolateIceCreamTrunkPlacer> CODEC = RecordCodecBuilder.create((p_70206_) -> {
        return trunkPlacerParts(p_70206_).apply(p_70206_, ChocolateIceCreamTrunkPlacer::new);
    });

    public ChocolateIceCreamTrunkPlacer(int p_70268_, int p_70269_, int p_70270_) {
        super(p_70268_, p_70269_, p_70270_);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.CHOCOLATE_ICE_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader reader,
                                                            BiConsumer<BlockPos, BlockState> stateBiConsumer,
                                                            Random random, int p_161871_, BlockPos pos,
                                                            TreeConfiguration configuration) {
        int height = 4;
        for (int i = pos.getY(); i < pos.getY() + height + 1; i++) {
            placeLog(reader, stateBiConsumer, random, new BlockPos(pos.getX(), i, pos.getZ()), configuration, (state) -> LOG);

            for (Direction d : DIRECTIONS) {
                placeLog(reader, stateBiConsumer, random, new BlockPos(pos.getX(), i, pos.getZ()).relative(d, 1), configuration, (state) -> LOG);

                for (Direction di : DIRECTIONS) {
                    placeLog(reader, stateBiConsumer, random, new BlockPos(pos.getX() - 1, pos.getY() + height, pos.getZ())
                            .relative(Direction.NORTH, 1), configuration, (state) -> LOG);
                    placeLog(reader, stateBiConsumer, random, new BlockPos(pos.getX(), pos.getY() + height, pos.getZ() + 1)
                            .relative(Direction.WEST, 1), configuration, (state) -> LOG);
                    placeLog(reader, stateBiConsumer, random, new BlockPos(pos.getX() + 1, pos.getY() + height, pos.getZ() - 2)
                            .relative(Direction.SOUTH, 1), configuration, (state) -> LOG);
                    placeLog(reader, stateBiConsumer, random, new BlockPos(pos.getX(), pos.getY() + height, pos.getZ() + 1)
                            .relative(Direction.EAST, 1), configuration, (state) -> LOG);
                }
            }
        }

        BlockPos.MutableBlockPos mutableBlockPos = pos.mutable();
        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(mutableBlockPos, 0, false));
    }
}
