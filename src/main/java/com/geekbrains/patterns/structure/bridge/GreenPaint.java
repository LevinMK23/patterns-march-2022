package com.geekbrains.patterns.structure.bridge;

public class GreenPaint extends Paint {

    @Override
    public void fill() {
        System.out.println(Color.GREEN);
    }
}
