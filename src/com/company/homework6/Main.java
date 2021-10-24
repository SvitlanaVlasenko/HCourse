package com.company.homework6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = getFigures();
        for (int i = 0; i < figures.length; i++) {
            figures[i].square();
            double total = Arrays.stream(new double[]{figures[i].square()}).sum();
            System.out.println(total);
        }
    }

    static Figure[] getFigures() {
        return new Figure[]{
                new Circle(), new Square(), new Triangle()
        };
    }
}
