package com.company.homework17;

import java.util.Arrays;

/**
 * 1. Создать класс ValueCalculator
 * 2. В классе ValueCalculator добавить:
 * - свойство-массив из вещественных чисел
 * - свойство, что отображает размер массива (минимально 1 000 000)
 * - свойство, что отображает половину размера массива
 */

public class ValueCalculator {
    private static final int SIZE = 1000000;
    private static final int HALF = SIZE / 2;

    private final float[] arr = new float[SIZE];

    /**
     * 3. В классе ValueCalculator добавить метод doCalc. Метод выполняет:
     * - Засечь время старта выполнения метода: long start = System.currentTimeMillis()
     * - Заполнить массив единицами или любыми другими одинаковыми значениями
     * - Разбить массив на два массива одинаковой величины:
     */

    public void doCalc() {
        long start = System.currentTimeMillis();
        Arrays.fill(arr, 2);

        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];

        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        /**- Создать два потока, в каждом из которых пройтись по одному из ранее полученных массивов.*/
        Thread t0 = new Thread(getCalcOperation(a1));
        Thread t1 = new Thread(getCalcOperation(a2));

        t0.start();
        t1.start();

        try {
            t0.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**- Выполнить обратную склейку двух массивов в один изначальный*/
        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);

        /**- Вычислить затраченное время от старта до завершения программы и вывод его в консоль.*/
        long end = System.currentTimeMillis() - start;

        System.out.println("Operation took a time: " + end);
    }

    private Runnable getCalcOperation(float[] arr) {
        return new Runnable() {
            @Override
            public void run() {
                doCalc(arr);
            }
        };
    }

    /**
     * Присвоить его значениям новые значения, сфорированные выражением:
     * (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2))
     */

    private void doCalc(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
