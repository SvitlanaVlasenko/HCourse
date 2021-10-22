package com.company;


public class Main {

    public static void main(String[] args) {


        System.out.println(createString());

        /** 2) Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
         - если число кратно 3 то вместо него вывести Hello
         - если число кратно 5 то вместо него вывести World
         - если число кратно и 3 и 5 то вместо него вывести HelloWorld*/
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("HelloWorld");
            } else if (i % 3 == 0) {
                System.out.println("Hello");
            } else if (i % 5 == 0) {
                System.out.println("Word");
            } else {
                System.out.println(i);

            }
        }

        /**3) Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
         Вывести среднее арифметическое.*/
        int[] array = new int[10];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) Math.round((Math.random() * 21) + 9);
            double average = 0;
            for (j = 0; j < array.length; j++) {
                average += array[j];
            }
            average /= array.length;
            System.out.println("Average=" + average);
        }

    }

    /**
     * 4) Написать метод который вернет String в которой будут в одну строку числа от 1 до 30.
     * Каждое число при этом взять в круглые скобки ()
     */
    public static String createString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 30; i++) {
            sb.append("(").append(i).append(")");
        }
        return sb.toString();
    }
}







