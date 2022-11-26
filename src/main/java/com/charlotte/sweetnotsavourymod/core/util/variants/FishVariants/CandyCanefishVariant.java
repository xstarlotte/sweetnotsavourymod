package com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyCanefishVariant implements IVariant {
    CANDYCANE(0),
    MINT(1),
    PEPPERMINT(2),
    SPEARMINT(3),
    LEMON(4);

    private static final CandyCanefishVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CandyCanefishVariant::getId)).toArray(CandyCanefishVariant[]::new);
    private final int id;

    CandyCanefishVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static CandyCanefishVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
