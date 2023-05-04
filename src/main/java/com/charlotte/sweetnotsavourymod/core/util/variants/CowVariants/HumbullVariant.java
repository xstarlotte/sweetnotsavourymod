package com.charlotte.sweetnotsavourymod.core.util.variants.CowVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum HumbullVariant implements IVariant {

    MINT(0);

    private static final HumbullVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(HumbullVariant::getId)).toArray(HumbullVariant[]::new);
    private final int id;

    HumbullVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static HumbullVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
