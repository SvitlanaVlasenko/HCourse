package com.company.homework23;

import java.util.stream.IntStream;

public enum CurrencyName implements CharSequence {
    UAH, AUD, USD;

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }
}
