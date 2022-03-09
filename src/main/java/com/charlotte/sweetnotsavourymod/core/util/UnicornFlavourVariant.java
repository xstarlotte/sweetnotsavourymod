package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum UnicornFlavourVariant {

    CARROTCORN(0),
    BANANACORN(1);
   ;

    private static final UnicornFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(UnicornFlavourVariant::getId)).toArray((i) -> new UnicornFlavourVariant[i]);
    private final int id;

    private UnicornFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static UnicornFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
