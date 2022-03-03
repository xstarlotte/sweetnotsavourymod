package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum BoarryVariant {

    BLACKBOARRY(0);
   ;

    private static final BoarryVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(BoarryVariant::getId)).toArray((i) -> new BoarryVariant[i]);
    private final int id;

    private BoarryVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static BoarryVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}