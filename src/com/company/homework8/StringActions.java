package com.company.homework8;

import java.util.Scanner;

public class StringActions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the string: ");
        String str = sc.nextLine();
        System.out.print("Please, enter the symbol for this string: ");
        char chr = sc.next().charAt(0);

        Scanner scp = new Scanner(System.in);
        System.out.print("Please, enter the source string: ");
        String source = scp.nextLine();
        System.out.print("Please, enter the target string: ");
        String target = scp.nextLine();
        System.out.println(findWordPosition(source, target));

        Scanner scr = new Scanner(System.in);
        System.out.print("Please, enter the string for reverse: ");
        String stringReverses = scr.nextLine();
        System.out.println(stringReverse(stringReverses));


        Scanner scrp = new Scanner(System.in);
        System.out.print("Please, enter the string: ");
        String isPalindromes = scrp.nextLine();
        System.out.println(isPalindrome(isPalindromes));
    }

/** 2. Создать метод findSymbolOccurance. Метод принимает в качестве параметров строку и символ.
 Необходимо вычислить, сколько раз символ встречается в переданной строке и вернуть это числовое значение. */
    public static int findSymbolOccurance(String str, char chr) {
        char [] charArray = str.toCharArray();
        int occurrences = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == chr) {
                occurrences++;
            }
        }
        return occurrences;
    }

/**3. Создать метод findWordPosition. Метод принимает в качестве параметров две строки (source, target).
 Необходимо выяснить, является ли target (подстрока) частью строки source.
 Если да, тогда вернуть номер позиции (индекс) первого элемента подстроки в строке, иначе вернуть -1.
 Пример 1:
 Source: Apollo
 Target: pollo
 Result: 1 */
    public static int findWordPosition(String source,String target) {
        return source.indexOf(target);
    }

/**4. Создать метод stringReverse. Метод принимает в качестве параметра строку.
 Необходимо ее развернуть и вернуть измененный вариант.*/
    public static String stringReverse(String strn) {
        String result = "";
        for (int i = 0; i < strn.length(); i++) {
            result = strn.charAt(i) + result;
        }
        return result;
    }

/**5. Создать метод isPalindrome. Метод принимает в качестве параметра строку.
 Необходимо Проверить является ли переданная строка палиндромом.
 Если да, тогда вернут true, иначе false.
 Пример 1:
 ERE -> true*/
    public static boolean isPalindrome(String pol) {
        for (int i = 0, j = pol.length() - 1; i < j; i++, j--) {
            if (pol.charAt(i) != pol.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}