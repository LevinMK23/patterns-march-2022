package com.geekbrains.patterns.structure.bridge;

public class Shape {

    private Paint paint;

    public void fillColor() {
        paint.fill();
    }

}
