package com.company.homework2;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones());
        System.out.println(judgeCircle());
        /**You're given strings jewels representing the types of stones that are jewels,
         and stones representing the stones you have.
         Each character in stones is a type of stone you have.
         You want to know how many of the stones you have are also jewels.*/

    }

    private static boolean judgeCircle() {
        String moves = "UD";
        int u = 0, d = 0, l = 0, r = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                u++;
                d--;
            } else if (moves.charAt(i) == 'D') {
                d++;
                u--;
            } else if (moves.charAt(i) == 'L') {
                l++;
                r--;
            } else if (moves.charAt(i) == 'R') {
                r++;
                l--;
            }
        }
        if (u == 0 && d == 0 && l == 0 && r == 0) {
            return true;
        }
        return false;
    }

    public static int numJewelsInStones() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int jewel = jewels.length(), stone = stones.length(), count = 0;
        char[] jewela = jewels.toCharArray(), stonea = stones.toCharArray();
        for (int i = 0; i < jewel; i++) {
            for (int j = 0; j < stone; j++) {
                if (jewela[i] == stonea[j])
                    count++;
            }
        }
        return count;

    }
}




