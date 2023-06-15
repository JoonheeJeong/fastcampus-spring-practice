package com.fastcampus.springpractice;

import com.fastcampus.springpractice.logic.JavaSort;
import com.fastcampus.springpractice.logic.Sort;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        List<String> sorted = sort.sort(List.of(args));
        System.out.println("[result]: " + sorted);
    }
}
