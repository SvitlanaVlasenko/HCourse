package com.company.homework6;

public class Triangle implements Figure {
    @Override
    public double square() {
        return squareTriangle();
    }

    protected double squareTriangle() {
        int a = 3;
        double area = a * 3;
        return area;
    }
}
