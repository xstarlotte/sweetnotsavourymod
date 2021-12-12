package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum FlavourVariant {
    BLUEBERRY(0),
    ORANGE(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    VANILLA(4),
    BLACKBERRY(5),
    LEMON(6),
    CHOCOLATE(7),
    TOFFEE(8);

    private static final FlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(FlavourVariant::getId)).toArray((i) -> new FlavourVariant[i]);
    private final int id;

    private FlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static FlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
