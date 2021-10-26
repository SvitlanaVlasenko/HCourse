package com.company.homework6;
import java.util.Scanner;

public class Iterator {
    private int iterator;
    private int[][] arr;

    public Iterator(int[][] arr) {
        this.arr = arr;
        this.iterator = -1;
    }

    protected boolean hasNext() {
        Scanner scanner = new Scanner(String.valueOf(iterator));
        return true;
    }

    public int[] next() {
        return arr[iterator++];
    }

    protected boolean hasNext(Iterator iterator) {
        return (this.iterator < arr.length);
    }
}
