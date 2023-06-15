package com.fastcampus.springpractice.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        List<T> sorted = new ArrayList<>(list);
        int n = sorted.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sorted.get(j).compareTo(sorted.get(j + 1)) > 0) {
                    T temp = sorted.get(j);
                    sorted.set(j, sorted.get(j + 1));
                    sorted.set(j + 1, temp);
                }
            }
        }
        return sorted;
    }
}
