package com.company.homework6;

public class Square implements Figure {
    @Override
    public double square() {
        return squareSquare();
    }

    protected double squareSquare() {
        int a = 3;
        int b = 2;
        double area = (a + b) * 2;
        return area;
    }
}
