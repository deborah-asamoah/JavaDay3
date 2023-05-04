package org.example.question2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {
    Question2 underTest;

    @BeforeEach
    void setUp() {
        underTest = new Question2();
    }

    @Test
    void isPalindromeIsTrueTestWithWord() throws EmptyStringException {
        String word = "racecar";
        assertTrue(underTest.isPalindrome(word));
    }

    @Test
    void isPalindromeIsFalseTestWithWord() throws EmptyStringException {
        String word = "race";
        assertFalse(underTest.isPalindrome(word));
    }
    @Test
    void isPalindromeIsTrueWithPhrase() throws EmptyStringException {
        String phrase = "race is not over";
        assertFalse(underTest.isPalindrome(phrase));
    }

    @Test
    void isPalindromeThrowsEmptyStringException(){
        assertThrows(EmptyStringException.class , ()->{
            String phraseWithLengthLessThan1 = "";
            underTest.isPalindrome(phraseWithLengthLessThan1);

        });
    }
}