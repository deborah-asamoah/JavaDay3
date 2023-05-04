package org.example.question3;

public class Question3Sol1 {


    public boolean isStringCharsUnique (String string) {
        String phrase = string.toLowerCase();
        int lengthOfPhrase = phrase.length();

        for (int i = 0; i < lengthOfPhrase; i++) {
            if (phrase.lastIndexOf(phrase.charAt(i)) != i){
                return false;
            }
        }
        return true;
    }
}
