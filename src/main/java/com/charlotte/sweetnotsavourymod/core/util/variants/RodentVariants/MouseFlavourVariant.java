package com.charlotte.sweetnotsavourymod.core.util.variants.RodentVariants;

import com.charlotte.sweetnotsavourymod.core.util.variants.IVariant;

import java.util.Arrays;
import java.util.Comparator;

public enum MouseFlavourVariant implements IVariant {
    MARSHMALLOWPIE(0),
    HAZELNUTCHEESECAKE(1),
    STRAWBERRYCHEESECAKE(2);

    private static final MouseFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(MouseFlavourVariant::getId)).toArray(MouseFlavourVariant[]::new);
    private final int id;

    MouseFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static MouseFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
