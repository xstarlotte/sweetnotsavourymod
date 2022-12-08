package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.charlotte.sweetnotsavourymod.common.world.features.ModConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class ChocolateIceCreamTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_60014_, boolean p_60015_) {
        return ModConfiguredFeatures.CHOCOLATE_ICE_CREAM_TREE.getHolder().get();
    }
}
