package com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants;

import java.util.Arrays;
import java.util.Comparator;

public enum Gingerbread_ManVariant {
    PLAIN(0);
   ;

    private static final Gingerbread_ManVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Gingerbread_ManVariant::getId)).toArray((i) -> new Gingerbread_ManVariant[i]);
    private final int id;

    private Gingerbread_ManVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static Gingerbread_ManVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
