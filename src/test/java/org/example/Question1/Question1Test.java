package org.example.Question1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class Question1Test {
    Question1 underTest;

    @BeforeEach
    void setUp() {
        underTest = new Question1();
    }

    @Test
    @DisplayName("should get words")
    void shouldGetWordsTest(){
        String phrase = "apple apple orange pear";
        underTest.getWords(phrase);

        assertTrue(underTest.getWordCount().containsKey("apple"));
    }



}