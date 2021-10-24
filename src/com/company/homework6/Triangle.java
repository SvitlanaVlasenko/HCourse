package com.company.homework6;

public class Triangle implements Figure {
    @Override
    public double square() {
        return SquareTriangle();

    }

    protected double SquareTriangle() {
        int a = 3;
        double area = a * 3;
        return area;
    }
}
