package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum ToadFlavourVariant {

    TOFFEE(0);
   ;

    private static final ToadFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ToadFlavourVariant::getId)).toArray((i) -> new ToadFlavourVariant[i]);
    private final int id;

    private ToadFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ToadFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
