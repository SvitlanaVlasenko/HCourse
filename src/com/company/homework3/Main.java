package com.company.homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**2) Задан массив случаных чисел типа int в котором есть положительные и отрицательные числа.

         Написать метод который вернет массив квадратов этих чисел, отсортированных по возрастанию.*/

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted numbers: \n");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
