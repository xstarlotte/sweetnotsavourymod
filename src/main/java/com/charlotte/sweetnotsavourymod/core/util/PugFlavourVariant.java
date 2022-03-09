package com.charlotte.sweetnotsavourymod.core.util;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.Arrays;
import java.util.Comparator;

public enum PugFlavourVariant {
    BLUEBERRY(0),
    ORANGE(1),
    RASPBERRY(2),
    STRAWBERRY(3),
    VANILLA(4),
    BLACKBERRY(5),
    LEMON(6),
    CHOCOLATE(7),
    TOFFEE(8),
    PEACH(9),
    PINEAPPLE(10),
    LIME(11),
    MANGO(12);
   ;

    private static final PugFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(PugFlavourVariant::getId)).toArray((i) -> new PugFlavourVariant[i]);
    private final int id;

    private PugFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static PugFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
