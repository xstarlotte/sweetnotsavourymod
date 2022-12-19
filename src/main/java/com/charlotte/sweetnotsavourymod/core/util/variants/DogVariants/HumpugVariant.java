package com.charlotte.sweetnotsavourymod.core.util.variants.DogVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum HumpugVariant implements IVariant {
    MINT(0);

    private static final HumpugVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(HumpugVariant::getId)).toArray(HumpugVariant[]::new);
    private final int id;

    HumpugVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static HumpugVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
