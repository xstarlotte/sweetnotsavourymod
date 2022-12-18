package com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum BonbonbiniVariant implements IVariant {
    RASPBERRY(0),
    STRAWBERRY(1),
    BLUEBERRY(2),
    BLACKBERRY(3),
    LEMON(4),
    ORANGE(5),
    APPLE(6),
    TOFFEE(7);

    private static final BonbonbiniVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(BonbonbiniVariant::getId)).toArray(BonbonbiniVariant[]::new);
    private final int id;

    BonbonbiniVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static BonbonbiniVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
