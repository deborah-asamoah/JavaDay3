package org.example.Question1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


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
        Map<String, Integer> counts = Map.of("apple", 2, "orange", 1, "pear", 1);
        assertEquals(underTest.getWordCount(), counts);
    }

    @Test
    void shouldNotGetWordsTest(){
        String phrase = "apple apple orange pear";
        underTest.getWords(phrase);
        Map<String, Integer> counts = Map.of("apple", 2, "orange", 1, "pear", 2);
        assertNotEquals(underTest.getWordCount(), counts);
    }

    @Test
    void shouldOrderMapByValue(){
        String phrase = "apple apple orange pear apple pear";
        underTest.getWords(phrase);
        Map<String, Integer> counts = Map.of("apple", 2, "orange", 1, "pear", 2);
        underTest.orderWordsInWordCount();
        List<Map<String, Integer>> orderedList = List.of(Map.of("orange", 1, "pear", 2, "apple", 3));
        List<String> listOfOrderedList = new ArrayList<>();
        listOfOrderedList.add("orange");
        listOfOrderedList.add("pear");
        listOfOrderedList.add("apple");

        assertEquals(underTest.getSortedWordCount(), listOfOrderedList);
    }



}