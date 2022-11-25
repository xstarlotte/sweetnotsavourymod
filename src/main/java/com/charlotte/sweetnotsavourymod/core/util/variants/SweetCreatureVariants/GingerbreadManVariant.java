package com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum GingerbreadManVariant implements IVariant {
    PLAIN(0);

    private static final GingerbreadManVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(GingerbreadManVariant::getId)).toArray(GingerbreadManVariant[]::new);
    private final int id;

    GingerbreadManVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static GingerbreadManVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
