package com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum WhaleVariant implements IVariant {
        WAFER(0),
        CHOCOLATEWAFER(1);

    private static final WhaleVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(WhaleVariant::getId)).toArray(WhaleVariant[]::new);
    private final int id;

    WhaleVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static WhaleVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
