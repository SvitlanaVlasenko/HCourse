package com.company.homework2;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones());
        System.out.println(judgeCircle());


    }
/**There is a robot starting at the position (0, 0), the origin, on a 2D plane.
     Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
     You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move.
     Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
     Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
     Note: The way that the robot is "facing" is irrelevant.
     'R' will always make the robot move to the right once, 'L' will always make it move left, etc.
     Also, assume that the magnitude of the robot's movement is the same for each move.*/
    private static boolean judgeCircle() {
        String moves = "UD";
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;
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
        return u == 0 && d == 0 && l == 0 && r == 0;
    }
    /**You're given strings jewels representing the types of stones that are jewels,
     and stones representing the stones you have.
     Each character in stones is a type of stone you have.
     You want to know how many of the stones you have are also jewels.*/
    public static int numJewelsInStones() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int jewel = jewels.length();
        int stone = stones.length();
        int count = 0;
        char[] jewela = jewels.toCharArray();
        char[] stonea = stones.toCharArray();
        for (int i = 0; i < jewel; i++) {
            for (int j = 0; j < stone; j++) {
                if (jewela[i] == stonea[j])
                    count++;
            }
        }
        return count;

    }
}




