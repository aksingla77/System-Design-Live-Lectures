package com.foodapp.enums;

public enum DeliveryType {
    STANDARD(40),
    EXPRESS(80);

    private final int fee;

    DeliveryType(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
}
