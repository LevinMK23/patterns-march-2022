package com.geekbrains.patterns.creators;

import java.util.Iterator;

public class MyList implements Iterable<Integer> {

    private int pos;
    private int[] data = {1, 2, 3};

    @Override
    public Iterator<Integer> iterator() {
        pos = 0;
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return pos < data.length;
            }

            @Override
            public Integer next() {
                int cur = data[pos];
                pos++;
                return cur;
            }
        };
    }
}
