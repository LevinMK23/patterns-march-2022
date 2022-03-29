package com.geekbrains.patterns.structure.composite.expression;

import io.netty.handler.codec.http2.Http2FrameListenerDecorator;

public class Test {

    public static void main(String[] args) {

        Expression expression = new Multiply(
                new Sum(new Constant(1), new Constant(2)),
                new Sum(new Constant(3), new Constant(4))
        );

        expression.print();

    }
}
