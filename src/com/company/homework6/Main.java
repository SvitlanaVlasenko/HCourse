package com.company.homework6;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFigures());

        int[][] arr = {
                {1, 3, 5},
                {1, 3, 7},
                {2, 2, 3, 6}
        };
        Iterator iterator = new Iterator(arr);
        while (iterator.hasNext()) {
            System.out.print("Iterator:"+iterator.next() + " ");
        } // 1, 1, 2, 2, 3, 3, 3, 5, 6, 7
    }

    public static double getFigure() {
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

