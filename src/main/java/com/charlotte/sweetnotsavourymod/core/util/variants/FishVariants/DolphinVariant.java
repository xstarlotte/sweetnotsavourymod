package com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants;

import java.util.Arrays;
import java.util.Comparator;

public enum DolphinVariant {
    COLABOTTLE(0);


    private static final DolphinVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(DolphinVariant::getId)).toArray((i) -> new DolphinVariant[i]);
    private final int id;

    DolphinVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static DolphinVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
