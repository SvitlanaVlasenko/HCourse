package com.company.homework11.part1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ex1
        List<String> strings = new ArrayList<>();
        strings.add("aaaa");
        strings.add("bbbb");
        strings.add("cccc");
        strings.add("aaaa");
        strings.add("bbbb");
        strings.add("cccc");
        strings.add("ssss");
        strings.add("aaaa");
        strings.add("dfgh");
        strings.add("dfgh");
        System.out.println(countOccurance(strings, "aaaa"));
        calcOccurance(strings);

        //Ex2
        List<Integer> newList = toList(new int[]{1, 2, 3});
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }

        //Ex3
        List<Integer> someNumbers = new ArrayList<>();
        someNumbers.add(10);
        someNumbers.add(15);
        someNumbers.add(22);
        someNumbers.add(10);
        someNumbers.add(10);
        someNumbers.add(30);
        someNumbers.add(10);
        List<Integer> newResult = findUnique(someNumbers);
        for (int i = 0; i < newResult.size(); i++) {
            System.out.println(newResult.get(i));
        }
    }

    /**
     * 1. Создать метод countOccurance, принимающий на вход строковый список в качестве параметра и произвольную строку.
     * Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
     * Посчитать сколько раз встречается переданная строка в качестве второго аргумента.
     */
    static int countOccurance(List<String> strings, String target) {
        int count = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals(target)) {
                count++;
            }
        }
        //System.out.println("Count: " + count);
        return count;
    }

    /**
     * 2. Создать метод toList, принимающий на вход целочисленный массив произвольной длины.
     * Конвертировать массив в список соответствующего типа данных и вернуть из метода.
     * Например:
     * Было Array [1, 2, 3]
     * Стало List [1, 2, 3]
     */
    static List<Integer> toList(int[] digits) {
        List<Integer> newDigits = new ArrayList<>(digits.length);
        for (int i = 0; i < digits.length; i++) {
            newDigits.add(digits[i]);
        }
        return newDigits;
    }

    /**
     3. Создать метод findUnique, принимающий на вход числовой список состоящий из произвольных значений,
     которые могут повторяться в неограниченном количестве.
     Необходимо вернуть новый числовой список содержащий только уникальные числа.
     */
    static List<Integer> findUnique(List<Integer> digits) {
        List<Integer> unique = new ArrayList<>();

        for (int i = 0; i < digits.size(); i++) {
            if (!unique.contains(digits.get(i))) {
                unique.add(digits.get(i));
            }
        }
        return unique;
    }

    /**
     * 4. ** Создать метод calcOccurance, принимающий на вход строковый список в качестве параметра.
     * Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
     * Вычислить сколько раз встречается каждое слово. Результат вывести в консоль.
     * Например:
     * bird: 2
     * fox: 1
     * cat: 1
     */
    public static void calcOccurance(List<String> stringslist) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < stringslist.size(); i++) {
            if (!newList.contains(stringslist.get(i))) {
                newList.add(stringslist.get(i));
                int count = 0;

                for (int j = 0; j < stringslist.size(); j++) {
                    if (stringslist.get(i).equals(stringslist.get(j))) {
                        count++;
                        //return stringslist.get(i) + ": " + count;
                    }
                }
                System.out.println(stringslist.get(i) + ": " + count);
            }
        }
    }
}