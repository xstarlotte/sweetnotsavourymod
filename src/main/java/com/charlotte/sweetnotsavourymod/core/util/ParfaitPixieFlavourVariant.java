package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum ParfaitPixieFlavourVariant {
    BLUEBERRY(0),
    ORANGE(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    BLACKBERRY(4),
    LEMON(5),
    CHOCOLATE(6),
    TOFFEE(7);



    private static final ParfaitPixieFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ParfaitPixieFlavourVariant::getId)).toArray((i) -> new ParfaitPixieFlavourVariant[i]);
    private final int id;

    private ParfaitPixieFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ParfaitPixieFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
