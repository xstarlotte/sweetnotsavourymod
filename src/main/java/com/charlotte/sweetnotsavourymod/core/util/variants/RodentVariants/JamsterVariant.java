package com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum JamsterVariant implements IVariant {
    STRAWBERRY(0),
    HONEY(1),
    RASPBERRY(2),
    BLACKBERRY(3),
    BLUEBERRY(4);

    private static final JamsterVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(JamsterVariant::getId)).toArray(JamsterVariant[]::new);
    private final int id;

    JamsterVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static JamsterVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
