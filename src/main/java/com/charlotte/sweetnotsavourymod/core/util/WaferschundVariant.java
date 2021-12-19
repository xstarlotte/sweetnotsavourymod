package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum WaferschundVariant {

    STRAWBERRY(0);
   ;

    private static final WaferschundVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(WaferschundVariant::getId)).toArray((i) -> new WaferschundVariant[i]);
    private final int id;

    private WaferschundVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static WaferschundVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
