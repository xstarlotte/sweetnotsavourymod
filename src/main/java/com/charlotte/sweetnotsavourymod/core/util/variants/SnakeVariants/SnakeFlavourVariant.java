package com.charlotte.sweetnotsavourymod.core.util.variants.SnakeVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum SnakeFlavourVariant implements IVariant {
    STRAWBERRYLACE(0),
    COLALACE(1),
    LEMONLACE(2),
    LIMELACE(3);


    private static final SnakeFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SnakeFlavourVariant::getId)).toArray(SnakeFlavourVariant[]::new);
    private final int id;

    SnakeFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static SnakeFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
