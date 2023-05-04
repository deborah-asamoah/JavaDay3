package org.example.question3;

public class Question3Sol2 {

    public boolean isStringCharsUnique (String string) {
        String phrase = string.toLowerCase();

        for(int i = 0 ; i < phrase.length() ; i ++){
            if (i == phrase.length()-1) {
                break;
            }
            for (int j = i + 1 ; j < phrase.length() ; j++){
                if(phrase.charAt(i) == phrase.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
