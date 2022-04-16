package com.charlotte.sweetnotsavourymod.core.util.variants.SweetCreatureVariants;

import java.util.Arrays;
import java.util.Comparator;

public enum BonbonbiniVariant {
    RASPBERRY(0);
   ;

    private static final BonbonbiniVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(BonbonbiniVariant::getId)).toArray((i) -> new BonbonbiniVariant[i]);
    private final int id;

    private BonbonbiniVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static BonbonbiniVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
