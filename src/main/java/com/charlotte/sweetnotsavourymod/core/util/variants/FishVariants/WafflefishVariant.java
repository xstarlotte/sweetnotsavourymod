package com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum WafflefishVariant implements IVariant {
    BLACKBERRY(0),
    BLUEBERRY(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    LEMON(4),
    ORANGE(5),
    VANILLA(6),
    CHOCOLATE(7),
    TOFFEE(8),
    PEACH(9);

    private static final WafflefishVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(WafflefishVariant::getId)).toArray(WafflefishVariant[]::new);
    private final int id;

    WafflefishVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static WafflefishVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
