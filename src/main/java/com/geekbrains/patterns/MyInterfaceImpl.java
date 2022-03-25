package com.geekbrains.patterns;

public class MyInterfaceImpl implements MyInterface {

    public void foo1() {

    }

    @Override
    public void foo() {
        foo(null);
    }

    public void foo(String x) {
        // logic
    }

    @Override
    public void bar(int x) {

    }

    @Override
    public int f(int x, int y) {
        return 0;
    }
}
