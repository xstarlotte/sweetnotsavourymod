package com.charlotte.sweetnotsavourymod.core.util.variants.AmphibianVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum ToadFlavourVariant implements IVariant {

    TOFFEE(0),
    HONEY(1),
    CHOCOLATE(2),
    WHITECHOCOLATE(3);

    private static final ToadFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ToadFlavourVariant::getId)).toArray(ToadFlavourVariant[]::new);
    private final int id;

    ToadFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ToadFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
