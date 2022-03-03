package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum SpiderFlavourVariant {
    STRAWBERRYLACE(0),
    COLALACE(1);


    private static final SpiderFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SpiderFlavourVariant::getId)).toArray(SpiderFlavourVariant[]::new);
    private final int id;

    private SpiderFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static SpiderFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
