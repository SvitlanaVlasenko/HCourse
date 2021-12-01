package com.company.homework15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<T> {
    private static final float EMPTY_SIZE = 0.0F;
    private List<T> fruits = new ArrayList<>();

    public List<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return EMPTY_SIZE;
        }

        for (T next : fruits) {
            if (next != null) {
                return next.getWeight() * fruits.size();
            }
        }

        return EMPTY_SIZE;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void add(List<T> otherFruits) {
        fruits.addAll(otherFruits);
    }

    public void add(T... otherFruits) {
        fruits.addAll(Arrays.asList(otherFruits));
    }

    public void merge(Box<T> other) {
        fruits.addAll(other.getFruits());
        other.getFruits().clear();
    }

    public boolean compare(Box<? extends Fruit> other) {
        return getWeight() == other.getWeight();
    }

    @Override
    public int compareTo(T other) {
        return Float.compare(getWeight(), other.getWeight());
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}