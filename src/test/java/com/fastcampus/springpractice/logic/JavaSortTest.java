package com.fastcampus.springpractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("자바소트 테스트")
    @Test
    void givenList_WhenSort_ThenReturnSortedList() {
        // given
        JavaSort<Integer> javaSort = new JavaSort<>();

        // when
        List<Integer> actual = javaSort.sort(List.of(3,1,2,5,4));

        // then
        assertEquals(List.of(1,2,3,4,5), actual);
    }
}