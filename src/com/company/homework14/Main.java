package com.company.homework14;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> string = new ArrayList<>();
        string.add("Привет");
        string.add("Мир");
        string.add("Привет");
        string.add("!");
        System.out.println("String unique=" + convertToUnique(string));

        List<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(4);
        integer.add(2);
        integer.add(5);
        integer.add(7);
        System.out.println("Sorted unique=" + getSortedUniqueIntegersASC(integer));
        System.out.println("Sorted unique integersDESC" + getSortedUniqueIntegersDESC(integer));
    }
    /**1. Создать метод convertToUnique. Метод принимает строковый список заполненый произвольными значениями, которые могут повторяться.
     Необходимо вернуться последовательность строк, но без учета повторений.
     Например:
     Дано: [Привет, Мир, Привет, !]
     Будет хранить: [Привет, Мир, !]*/

    public static Set<String> convertToUnique(List<String> stringList) {
        Set<String> unique = new HashSet<>();
        unique.addAll(stringList);
        return unique;
    }
    /**2. Создать метод getSortedUniqueIntegersASC.
     * Метод принимает на вход список целочисленных значений, заполненый произвольными значениями, которые могут повторяться.
     * Необходимо вернуться последовательность целочисленных значений, но без учета повторений, отсортированных по возрастанию.*/

    public static Set<Integer> getSortedUniqueIntegersASC(List<Integer> integersList) {
        Set<Integer> sortedUniqueIntegersASC = new TreeSet<>();
        sortedUniqueIntegersASC.addAll(integersList);
        return sortedUniqueIntegersASC;
    }
    /**3. Создать метод getSortedUniqueIntegersDESC.
     * Метод принимает на вход список целочисленных значений, заполненый произвольными значениями, которые могут повторяться.
     * Необходимо вернуться последовательность целочисленных значений, но без учета повторений, отсортированных по убыванию.*/

    public static Set<Integer> getSortedUniqueIntegersDESC(List<Integer> integersList) {
        Set<Integer> sortedUnique= new TreeSet<>();
        sortedUnique.addAll(integersList);
        Set<Integer> sortedUniqueIntegersDESC = new LinkedHashSet<>();
        for (int i = sortedUnique.size(); i > 0; i--) {
            sortedUniqueIntegersDESC.add(i);
        }
        return sortedUniqueIntegersDESC;
    }
}
