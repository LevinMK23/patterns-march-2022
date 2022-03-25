package com.geekbrains.patterns.creators;

public class MyClass {

    private int x, y;

    // factory method
    public static MyClass of(int x, int y) {
        return new MyClass(x, y);
    }

    private MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
