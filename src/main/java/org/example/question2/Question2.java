package org.example.question2;

public class Question2 {

    public boolean isPalindrome (String phrase) throws EmptyStringException{
        String cleanPhrase = phrase.replaceAll(" ", "").toLowerCase();
        int lengthOfPhrase = cleanPhrase.length();
        if(lengthOfPhrase < 1 ){
            throw new EmptyStringException("Invalid string length");
        }

        for (int i = 0; i < lengthOfPhrase; i++) {
            if (cleanPhrase.charAt(i) != cleanPhrase.charAt(lengthOfPhrase -1 -i)){
                return false;
            }
        }
        return true;
    }
}
