package com.geekbrains.patterns.creators;

import java.io.Closeable;
import java.io.IOException;

public class MyPrototype implements Cloneable, Closeable {

    private int x;
    private String s;
    private MySingleton singleton;

    public MyPrototype(int x, String s) {
        this.x = x;
        this.s = s;
    }

    public void setSingleton(MySingleton singleton) {
        this.singleton = singleton;
    }

    @Override
    public MyPrototype clone() throws CloneNotSupportedException {
        return (MyPrototype) super.clone();
    }

    @Override
    public String toString() {
        return "MyPrototype@" + hashCode() +
                "{" +
                "x=" + x +
                ", s='" + s + '\'' +
                ", singleton=" + singleton +
                '}';
    }

    @Override
    public void close() throws IOException {
        System.out.println(this + " closed!");
    }
}
