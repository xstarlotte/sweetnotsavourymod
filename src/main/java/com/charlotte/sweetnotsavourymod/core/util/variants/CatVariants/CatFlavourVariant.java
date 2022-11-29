package com.charlotte.sweetnotsavourymod.core.util.variants.CatVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum CatFlavourVariant implements IVariant {
    CANDYCANE(0),
    MINTCANDYCANE(1),
    PEPPERMINTCANDYCANE(2),
    SPEARMINTCANDYCANE(3),
    LEMONCANDYCANE(4);

    private static final CatFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CatFlavourVariant::getId)).toArray(CatFlavourVariant[]::new);
    private final int id;

    CatFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static CatFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
