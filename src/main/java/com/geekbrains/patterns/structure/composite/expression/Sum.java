package com.geekbrains.patterns.structure.composite.expression;

public class Sum extends BinaryExpression {

    public Sum(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int eval() {
        return getLeft().eval() + getRight().eval();
    }

    @Override
    public String asString() {
        return String.format("(%s + %s)", getLeft().asString(), getRight().asString());
    }

}
