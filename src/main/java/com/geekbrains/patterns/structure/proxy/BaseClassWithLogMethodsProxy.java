package com.geekbrains.patterns.structure.proxy;


public class BaseClassWithLogMethodsProxy extends BaseClass {

    private final BaseClass origin;

    public BaseClassWithLogMethodsProxy(BaseClass origin) {
        this.origin = origin;
    }

    @Override
    public int sum(int x, int y) {
        System.out.println("Executed: sum with params: x = " + x + ", y = " + y);
        int res =  super.sum(x, y);
        System.out.println("Execution result: " + res);
        return res;
    }
}
