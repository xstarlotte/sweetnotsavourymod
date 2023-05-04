package com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum SugargliderVariant implements IVariant {
    PLAIN(0),
    CANDYCANE(1),
    LEMONCANDYCANE(2),
    MINTCANDYCANE(3),
    SPEARMINTCANDYCANE(4),
    PEPPERMINTCANDYCANE(5);

    private static final SugargliderVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SugargliderVariant::getId)).toArray(SugargliderVariant[]::new);
    private final int id;

    SugargliderVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static SugargliderVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
