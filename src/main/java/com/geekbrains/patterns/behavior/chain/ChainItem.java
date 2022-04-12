package com.geekbrains.patterns.behavior.chain;

public interface ChainItem<A> {

    A process(A object);

}
