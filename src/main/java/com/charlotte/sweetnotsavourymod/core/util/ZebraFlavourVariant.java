package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum ZebraFlavourVariant {

    ZEBRACAKE(0);
   ;

    private static final ZebraFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ZebraFlavourVariant::getId)).toArray((i) -> new ZebraFlavourVariant[i]);
    private final int id;

    private ZebraFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ZebraFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
