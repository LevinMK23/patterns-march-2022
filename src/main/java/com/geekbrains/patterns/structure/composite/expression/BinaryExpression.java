package com.geekbrains.patterns.structure.composite.expression;

import lombok.Getter;

@Getter
public abstract class BinaryExpression implements Expression {

    private final Expression left;
    private final Expression right;


    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
