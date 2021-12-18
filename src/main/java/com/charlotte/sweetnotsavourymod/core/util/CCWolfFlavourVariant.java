package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum CCWolfFlavourVariant {
    CANDYCANE(0),
    LEMON(1),
    MINT(2),
    PEPPERMINT(3),
    SPEARMINT(4);

   ;

    private static final CCWolfFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CCWolfFlavourVariant::getId)).toArray((i) -> new CCWolfFlavourVariant[i]);
    private final int id;

    private CCWolfFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static CCWolfFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
