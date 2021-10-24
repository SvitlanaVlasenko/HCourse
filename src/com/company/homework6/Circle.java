package com.company.homework6;

public class Circle implements Figure {
    @Override
    public double square() {
        return Squarecircle();
    }

    protected double Squarecircle() {
        int r = 3;
        double area = Math.PI * r;
        return area;
    }
}


