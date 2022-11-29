package com.charlotte.sweetnotsavourymod.core.util.variants.DogVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum CCWolfFlavourVariant implements IVariant {
    CANDYCANE(0),
    LEMON(1),
    MINT(2),
    PEPPERMINT(3),
    SPEARMINT(4);

    private static final CCWolfFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CCWolfFlavourVariant::getId)).toArray(CCWolfFlavourVariant[]::new);
    private final int id;

    CCWolfFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static CCWolfFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
