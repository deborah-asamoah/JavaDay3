package org.example;

import org.example.Question1.Question1;
import org.example.question2.Question2;
import org.example.question3.Question3Sol1;
import org.example.question3.Question3Sol2;
import org.example.question3.Question3Sol3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String words = "apple apple orange pear coconut pineapple apple pineapple mango ";
        Question1 question1 = new Question1();
        System.out.println(question1.getFrequency(words));


        /*** QUESTION 2 */
//        String phrase = "nurses run";
//
//        Question2 question2 = new Question2();
//        System.out.println(question2.isPalindrome(phrase));

        /*** QUESTION 3 */

//        String phrase = "nurse";
//
//        Question3Sol1 question3Sol1 = new Question3Sol1();
//        System.out.println(question3Sol1.isStringCharsUnique(phrase));
//
//
//        Question3Sol2 question3Sol2 = new Question3Sol2();
//        System.out.println(question3Sol2.isStringCharsUnique(phrase));
//
//        Question3Sol3 question3Sol3 = new Question3Sol3();
//        System.out.println(question3Sol3.isStringCharsUnique(phrase));

    }
}