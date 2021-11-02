package com.company.homework4;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sortArray());
/**Задан массив случайных чисел.
 Написать метод который вернет массив в котором сначала будут все четные элементы,
 а потом все нечетные из исходного.*/
        int[] array = new int[12];
        for (int c = 0; c < array.length; c++) {
            array[c] = (int) Math.round((Math.random() * 30) - 15);
            if (array[c] % 2 == 0) {
                System.out.println("Countable:" + array[c]);
            } else {
                System.out.println("Not Countable:" + array[c]);


            }
        }

    }
    /**
     * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
     * Return any array that satisfies this condition.
     */
    private static int[] sortArray() {

        int num[] = {3,1,2,4};
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                int temp = num[i];
                num[i] = num[j];
                num[j++] = temp;
            }
        }
        return num;
    }
}













