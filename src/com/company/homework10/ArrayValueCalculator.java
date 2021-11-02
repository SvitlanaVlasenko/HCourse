package com.company.homework10;

/**
 * 1. Создать класс ArrayValueCalculator
 * 2. Создать метод doCalc. На вход методу подаётся двумерный строковый массив размером 4х4.
 * 3. При передаче массива другого размера в метод doCalc, необходимо выбросить исключение MyArraySizeException.
 * 4. Метод doCalc должен пройтись по всем элементам массива и преобразовать в int (использовать Integer#parseInt) и просуммировать.
 * После общего суммирования, метод возвращает финальный результат в виде int.
 * 5.Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * тогда быть выброшено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
 * 6. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
 * 7. * Необходимо соблюдать все правила сохранения контекста выброшенного исключения.
 * 8. * При отлове исключений в процессе преобразования, принять во внимание исключения выбрасываемые другими (сторонними) методами, что используются.
 */
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
