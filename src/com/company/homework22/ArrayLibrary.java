package com.company.homework22;

public class ArrayLibrary {
    /**
     * 	Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
     * 	Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
     * 	идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
     * 	иначе в методе необходимо выбросить RuntimeException.
     * 	Написать набор тестов для этого метода (по 3-4 варианта входных данных).
     *
     * Например: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
     */
    public static int[] extractValuesAfterFour(int[] digits) {
        if (digits == null || digits.length == 0) {
            throw new RuntimeException("Inbound array cannot be null nor empty.");
        }

        int index = -1;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 4) index = i;
        }

        if (index == -1) {
            throw new RuntimeException("Inbound array must contain one 4-digit at least.");
        }

        // 2, 3, 4, 5, 6
        // 5 - 2 = 3

        int[] newDigits = new int[digits.length - index - 1];
        System.arraycopy(digits, index + 1, newDigits, 0, newDigits.length);

        return newDigits;
    }

    /**
     * 	Написать метод, который проверяет состав массива из чисел 1 и 4.
     * 	Если в нем нет хоть одной четверки или единицы, то метод вернет false;
     * 	Написать набор тестов для этого метода (по 3-4 варианта входных данных).
     */
    public static boolean checkOneOrFourDigitPresenceFoul(int[] digits) {
        return true;
    }
    public static boolean checkOneOrFourDigitPresenceTry(int[] digits) {
        return false;
    }
}
