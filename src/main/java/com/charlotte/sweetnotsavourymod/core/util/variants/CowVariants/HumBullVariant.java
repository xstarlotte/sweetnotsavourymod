package com.charlotte.sweetnotsavourymod.core.util.variants.CowVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum HumBullVariant implements IVariant {

    MINT(0);

    private static final HumBullVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(HumBullVariant::getId)).toArray(HumBullVariant[]::new);
    private final int id;

    HumBullVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static HumBullVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
