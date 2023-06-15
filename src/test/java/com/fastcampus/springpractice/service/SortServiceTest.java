package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private final SortService sortService = new SortService(new BubbleSort<>());

    @Test
    void doSort_test() {
        // given
        String[] args = {"3", "1", "5", "4", "2"};

        // when
        List<String> actual = sortService.doSort(List.of(args));

        // then
        assertEquals(List.of(new String[] {"1", "2", "3", "4", "5"}), actual);
    }
}