package com.geekbrains.patterns.creators;

public class MyClassFactory {

    public MyClass get() {
        return MyClass.of(0, 0);
    }

    public MyClass get(int x) {
        return MyClass.of(x, x);
    }

    public MyClass get(int x, int y) {
        return MyClass.of(x, y);
    }

}
