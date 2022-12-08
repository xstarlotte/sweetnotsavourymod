package com.charlotte.sweetnotsavourymod.core.util.variants.SheepVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum SheepVariant implements IVariant {
    CANDYFLOSS(0),
    BLUECANDYFLOSS(1);

    private static final SheepVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SheepVariant::getId)).toArray(SheepVariant[]::new);
    private final int id;

    SheepVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static SheepVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
