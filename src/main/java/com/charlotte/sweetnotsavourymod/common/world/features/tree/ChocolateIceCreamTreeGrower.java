package com.charlotte.sweetnotsavourymod.common.world.features.tree;

import com.charlotte.sweetnotsavourymod.common.world.features.ModConfiguredFeature;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import javax.annotation.Nullable;

import java.util.Random;

public class ChocolateIceCreamTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_60014_, boolean p_60015_) {
        return ModConfiguredFeature.CHOCOLATE_ICE_CREAM_TREE;
    }
}
