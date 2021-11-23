package com.company.homework10;

import static com.company.homework10.ArrayValueCalculator.doCalc;

public class Main {
    public static void main(String[] args) {
        String[][] value = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"6", "2", "3", "4"},
                {"9", "6", "7", "8"}};
        try {
            try {
                int result = doCalc(value);
                System.out.println(result);
            } catch (MyArraySizeException ex) {
                System.out.println("Size of arrey too big");
            }
        } catch (MyArrayDataException ex) {
            System.out.println("Not correct value of arrey");
            System.out.println("Mistake in value: " + ex.i + "x" + ex.j);
        }
    }
    public static class MyArrayDataException extends Exception {
        public int i;
        public int j;

        MyArrayDataException(int i, int j) {
            this.i = i;
            this.j = j;

        }
    }

    public static class MyArraySizeException extends Exception {
    }
}
