package com.fastcampus.springpractice;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void givenArrayOfStringOfInteger_WhenAndThenRunMain() {
        // given
        String[] args = {"3", "1", "5", "4", "2"};

        // when & Then
        Main.main(args);
    }

}