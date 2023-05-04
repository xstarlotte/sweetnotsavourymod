package com.charlotte.sweetnotsavourymod.core.util.variants.BirdVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum ChickenVariant implements IVariant {
    CHOCOLATE(0),
    DARKCHOCOLATE(1),
    WHITECHOCOLATE(2);

    private static final ChickenVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ChickenVariant::getId)).toArray(ChickenVariant[]::new);
    private final int id;

    ChickenVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ChickenVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
