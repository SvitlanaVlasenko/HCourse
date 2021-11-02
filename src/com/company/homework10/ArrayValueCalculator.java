package com.company.homework10;

public class ArrayValueCalculator {

    public static int doCalc(String[][] value) throws Main.MyArraySizeException, Main.MyArrayDataException {
        int count = 0;
        if (value.length != 4) {
            throw new Main.MyArraySizeException();
        }
        for (int i = 0; i < value.length; i++) {
            if (value[i].length != 4) {
                throw new Main.MyArraySizeException();
            }
            for (int j = 0; j < value[i].length; j++) {
                try {
                    count = count + Integer.parseInt(value[i][j]);
                } catch (NumberFormatException e) {
                    throw new Main.MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
