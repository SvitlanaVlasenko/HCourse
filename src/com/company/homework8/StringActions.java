package com.company.homework8;

public class StringActions {

    public static void main(String[] args) {

        System.out.println(findSymbolOccurance());
        System.out.println(findWordPosition());
        System.out.println(stringReverse());
        System.out.println(isPalindrome());
    }

    public static int findSymbolOccurance() {
        String str = "abs";
        int occurrences = 0;
        for (char chr : str.toCharArray()) {
            if (chr == '\u0430') {
                occurrences++;
            }
        }
        return occurrences;
    }

    public static boolean findWordPosition() {
        String source = "Apollo";
        String target = "pollo";
    }

    public static String stringReverse() {
        String strn = "Hello";
        //return new StringBuilder(strn).reverse().toString();
        //reverse or we can use charAt
        String result = "";
        for (int i = 0; i < strn.length(); i++) {
            result = strn.charAt(i) + result;
        }
        return result;
    }

    public static boolean isPalindrome() {
        String pol = "ERRE";
        for (int i = 0, j = pol.length() - 1; i < j; i++, j--) {
            if (pol.charAt(i) != pol.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}