package com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyCanefishVariant {
    CANDYCANE(0),
    MINT(1),
    PEPPERMINT(2),
    SPEARMINT(3),
    LEMON(4);

   ;

    private static final CandyCanefishVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CandyCanefishVariant::getId)).toArray((i) -> new CandyCanefishVariant[i]);
    private final int id;

    private CandyCanefishVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static CandyCanefishVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
