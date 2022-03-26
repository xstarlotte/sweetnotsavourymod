package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum LionVariant {
    CANDYFLOSS(0);



    private static final LionVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(LionVariant::getId)).toArray(LionVariant[]::new);
    private final int id;

    private LionVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static LionVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
