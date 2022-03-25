package com.geekbrains.patterns.creators;

public class MySingleton {

    private static volatile MySingleton INSTANCE;

    private final String value;

    private MySingleton(String value) {
        this.value = value;
        System.out.println(this);
    }

    public static MySingleton getInstance(String value) {
        if (INSTANCE == null) {
            synchronized (MySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingleton(value);
                }
            }
        }
        return INSTANCE;
    }

    public String getValue() {
        return value;
    }

}
