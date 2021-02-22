package com.rohit.designpattern.structuraldesignpattern;

import java.util.Comparator;

public class TestComparaot implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return 0;
    }

    @Override
    public Comparator<String> thenComparing(Comparator<? super String> other) {
        return null;
    }
}
