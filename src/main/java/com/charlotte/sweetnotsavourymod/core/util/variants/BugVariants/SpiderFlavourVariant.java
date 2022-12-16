package com.charlotte.sweetnotsavourymod.core.util.variants.BugVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum SpiderFlavourVariant implements IVariant {
    STRAWBERRYLACE(0),
    COLALACE(1),
    LEMONLACE(2),
    LIMELACE(3),
    CANDYCANE(4);

    private static final SpiderFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SpiderFlavourVariant::getId)).toArray(SpiderFlavourVariant[]::new);
    private final int id;

    SpiderFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static SpiderFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
