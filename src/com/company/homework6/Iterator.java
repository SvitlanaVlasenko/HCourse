package com.company.homework6;


public class Iterator {
    private int iterator;
    private int[][] arr;

    public Iterator(int[][] arr) {
        this.arr = arr;
        this.iterator = 0;
    }

    public Object next() {
        return arr[iterator++];
    }

    protected boolean hasNext(Iterator iterator) {
        return (this.iterator < arr.length);
    }
}
