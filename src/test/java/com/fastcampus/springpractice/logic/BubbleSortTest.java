package com.fastcampus.springpractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블소트 테스트")
    @Test
    void givenList_WhenSort_ThenReturnSortedList() {
        // given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // when
        List<Integer> actual = bubbleSort.sort(List.of(3,1,2,5,4));

        // then
        assertEquals(List.of(1,2,3,4,5), actual);
    }
}