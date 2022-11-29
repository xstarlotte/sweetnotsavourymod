package com.charlotte.sweetnotsavourymod.core.util.variants.HostileVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum MintImperialVariant implements IVariant {
    ONE(0),
    TWO(1),
    THREE(2),
    FOUR(3);

    private static final MintImperialVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(MintImperialVariant::getId)).toArray(MintImperialVariant[]::new);
    private final int id;

    MintImperialVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static MintImperialVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
