package com.geekbrains.patterns.structure.composite.expression;

public interface Expression {

    int eval();

    String asString();

    default void print() {
        System.out.println(asString() + " = " + eval());
    }

}
