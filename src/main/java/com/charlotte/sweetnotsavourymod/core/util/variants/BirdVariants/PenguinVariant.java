package com.charlotte.sweetnotsavourymod.core.util.variants.BirdVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum PenguinVariant implements IVariant {
    CHOCOLATE(0),
    DARKCHOCOLATE(1),
    WHITECHOCOLATE(2);

    private static final PenguinVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(PenguinVariant::getId)).toArray(PenguinVariant[]::new);
    private final int id;

    PenguinVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static PenguinVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
