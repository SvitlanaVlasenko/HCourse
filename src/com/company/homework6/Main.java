package com.company.homework6;

public class Main {
    public static void main(String[] args) {
        System.out.println(GetFigure());
    }

    public static double GetFigure() {
        Figure[] figures = getFigures();
        double total = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < figures.length; i++) {
            total += i;
            stringBuilder.append(figures[i].square());
        }
        stringBuilder.append(" = " + total);
        return total;
    }


    static Figure[] getFigures() {
        return new Figure[]{
                new Circle(), new Square(), new Triangle()
        };
    }
}

