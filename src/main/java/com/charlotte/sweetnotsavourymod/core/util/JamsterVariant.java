package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum JamsterVariant {
    STRAWBERRY(0),
    HONEY(1);

    private static final JamsterVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(JamsterVariant::getId)).toArray(JamsterVariant[]::new);
    private final int id;

    private JamsterVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static JamsterVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
