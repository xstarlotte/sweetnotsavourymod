package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum SquirrollFlavourVariant {
    CINNAMON(0),
    STRAWBERRYSWISS(1);

    private static final SquirrollFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SquirrollFlavourVariant::getId)).toArray(SquirrollFlavourVariant[]::new);
    private final int id;

    private SquirrollFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static SquirrollFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
