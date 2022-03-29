package com.geekbrains.patterns.structure.composite.expression;

public class Constant implements Expression {

    private int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }

    @Override
    public String asString() {
        return String.valueOf(value);
    }
}
