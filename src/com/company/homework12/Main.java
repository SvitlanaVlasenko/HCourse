package com.company.homework12;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * 1. Создать метод addFirst, принимающий на вход связный список и строку.
     * Добавить в конец списка переданное строковое значение.
     */
    public LinkedList<String> addFirst(LinkedList<String> listAdd, String listTarget) {
        listAdd.addFirst(listTarget);
        return listAdd;
    }

    /**
     * 2. Создать метод addLast, принимающий на вход связный список и строку.
     * Добавить в начало списка переданное строковое значение.
     */
    public LinkedList<String> addLast(LinkedList<String> listLast, String listTarget) {
        listLast.addLast(listTarget);
        return listLast;
    }

    /**
     * 3. Создать метод join, принимающий на вход два целочисловых связных списка, заполненные произвольными значениями (5-10 шт. в каждом).
     * Метод должен возвращать объединение двух переданных списков.
     * Например:
     * param1 [1, 2, 3]
     * param2 [5, 7, 8]
     * result [1, 2, 3, 5, 7, 8]
     */
    public LinkedList<Integer> join(LinkedList<Integer> listJoin, LinkedList<Integer> linkedValue) {
        LinkedList<Integer> joinList = new LinkedList<>(listJoin);
        joinList.addAll(linkedValue);

        return joinList;
    }
    /**4. Создать метод shuffle, принимающий на вход связный список содержащий любой (на выбор) тип данных,
     * заполненный соответствующими произвольными значениями (10-20 шт.).
     Метод должен поменять местами имеющиеся внутри списка значения в случайном порядке (тасовка).
     Каждый потенциальный вызов метода будет возвращать новый результат, где
     нет гарантии повторения порядка.*/
    public LinkedList<String> shuffle(LinkedList<String> shuffleList) {
        Collections.shuffle(shuffleList);
        return shuffleList;
    }
    /**5. Создать метод intersect, принимающий на вход два целочисловых связных списка, заполненные произвольными значениями (5-10 шт. в каждом).
     Метод должен вернуть новый связный список содержащий только элементы имеющиеся одновременно в каждом из переданных список (пересечение).
     Например:
     param1 [1, 2, 3]
     param2 [3, 2, 5, 7]
     result [2, 3]*/
    public LinkedList<Integer> intersect(LinkedList<Integer> firstValues, LinkedList<Integer> secondValues) {
        LinkedList<Integer> allValues = new LinkedList<>(firstValues);
        allValues.retainAll(secondValues);
        return allValues;
    }
}