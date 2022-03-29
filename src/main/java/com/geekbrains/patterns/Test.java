package com.geekbrains.patterns;

import com.geekbrains.patterns.structure.proxy.BaseClass;
import com.geekbrains.patterns.structure.proxy.BaseClassWithLogMethodsProxy;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        MyInterface i1 = new MyInterfaceImpl();
        MyInterfaceImpl i2 = new MyInterfaceImpl();
        i2.foo1();
        List<Integer> stack = new Stack<>();
        Queue<Integer> queue = new PriorityQueue<>();
        stack.add(1);
        stack.add(2);
        System.out.println(stack.getClass());
        stack.forEach(System.out::println);

        BaseClass baseClass = new BaseClass();

        BaseClass proxy = new BaseClassWithLogMethodsProxy(baseClass);

        proxy.sum(1, 2);
    }
}
