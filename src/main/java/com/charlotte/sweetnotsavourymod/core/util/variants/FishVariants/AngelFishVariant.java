package com.charlotte.sweetnotsavourymod.core.util.variants.FishVariants;

import java.util.Arrays;
import java.util.Comparator;

public enum AngelFishVariant {
    ANGELCAKE(0);


    private static final AngelFishVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(AngelFishVariant::getId)).toArray((i) -> new AngelFishVariant[i]);
    private final int id;

    AngelFishVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static AngelFishVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
