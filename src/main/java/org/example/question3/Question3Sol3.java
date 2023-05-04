package org.example.question3;

import java.util.Arrays;

public class Question3Sol3 {


    public boolean isStringCharsUnique (String string) {
        String phrase = string.toLowerCase();
        int lengthOfPhrase = phrase.length();
        char[] charArray = new char[lengthOfPhrase];

        for(int i = 0 ; i < lengthOfPhrase ; i ++){
            charArray[i] = phrase.charAt(i);
        }
        Arrays.sort(charArray, 0, lengthOfPhrase);

        for (int i = 0; i < charArray.length; i++) {
            if (i == charArray.length-1) {
                break;
            }
            if (charArray[i] == charArray[i + 1]){

                return false;
            }
        }
        return true;
        }
    }


