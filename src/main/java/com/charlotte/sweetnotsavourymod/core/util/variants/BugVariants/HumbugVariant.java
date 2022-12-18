package com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum HumbugVariant implements IVariant {
    MINT(0),
    MINT_CANDYCANE(1),
    SPEARMINT_CANDYCANE(2),
    PEPPERMINT_CANDYCANE(3),
    CANDYCANE(4),
    LEMON_CANDYCANE(5);

    private static final HumbugVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(HumbugVariant::getId)).toArray(HumbugVariant[]::new);
    private final int id;

    HumbugVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static HumbugVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
