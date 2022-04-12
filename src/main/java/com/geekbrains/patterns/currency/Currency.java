package com.geekbrains.patterns.currency;

public enum Currency {

    RUB("top"),
    USD("bottom");

    private final String title;

    Currency(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
