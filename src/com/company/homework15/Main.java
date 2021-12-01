package com.company.homework15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Apple apple = new Apple("apple");
        List<Apple> apples = new ArrayList<>();
        apples.add(apple);
        Orange orange = new Orange("orange");
        List<Orange> oranges = new ArrayList<>();
        oranges.add(orange);
        appleBox.add(apple);
        orangeBox.add(orange);
        System.out.println("Weight apple box= " + appleBox.getWeight());
        System.out.println("Weight orange box= " + orangeBox.getWeight());

        appleBox.merge(appleBox);
        orangeBox.merge(orangeBox);
        System.out.println("Merge apple= " + appleBox);
        System.out.println("Merge orange= " + orangeBox);

        System.out.println("Compare apple & orange= " + appleBox.compare(orangeBox));

    }
}
