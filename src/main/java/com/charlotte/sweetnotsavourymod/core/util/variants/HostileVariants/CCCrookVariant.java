package com.charlotte.sweetnotsavourymod.core.util.variants.HostileVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum CCCrookVariant implements IVariant {
    RED(0),
    WHITE(1);

    private static final CCCrookVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CCCrookVariant::getId)).toArray(CCCrookVariant[]::new);
    private final int id;

    CCCrookVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static CCCrookVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
