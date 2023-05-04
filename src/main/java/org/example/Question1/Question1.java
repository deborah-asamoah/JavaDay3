package org.example.Question1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.Map.Entry.comparingByValue;

public class Question1 {

    ArrayList<Integer> list = new ArrayList<>();

    private final Map<String, Integer> wordCount = new HashMap<>();
    private List<String> sortedWordCount = new ArrayList<>();
    private final Map<String, List<String>> commonWords = new HashMap<>();

    public Question1() {
    }

    public Map<String, List<String>> getFrequency(String words) {
        getWords(words);
        orderWordsInWordCount();
        getLeastCommonWords();
        getMostCommonWords();
        return commonWords;
    }

    protected void getWords(String words) {
        String[] wordArray = words.split(" ");
        for (String word : wordArray) {
            wordCount.put(word.toLowerCase(), wordCount.getOrDefault(word, 0) + 1);
        }
    }

    public Map<String, Integer> getWordCount() {
        return wordCount;
    }

    protected void orderWordsInWordCount() {
        List<Map.Entry<String, Integer>> listWordCountMap = new ArrayList<>(wordCount.entrySet());

        listWordCountMap.sort(comparingInt(Map.Entry::getValue));
        listWordCountMap.sort(comparingByValue());

        listWordCountMap.sort((entry, entry2) -> entry.getValue().compareTo(entry2.getValue()));

        // Sort the list by value in ascending order
        Comparator<Map.Entry<String, Integer>> c = new Comparator<>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        listWordCountMap.sort(c);
        sortedWordCount = listWordCountMap.stream().map((a) -> a.getKey()).collect(Collectors.toList());
    }

    protected void getLeastCommonWords() {
        int sizeOfMap = sortedWordCount.size();
        int limit = Math.min(sizeOfMap, 3);
        List<String> leastCommonWords = sortedWordCount.subList(0, limit);
        commonWords.put("leastCommon", leastCommonWords);
    }

    protected void getMostCommonWords() {
        int sizeOfMap = sortedWordCount.size();
        int limit = Math.min(sizeOfMap, 3);

        List<String> newSortWordCount = new ArrayList<>(sortedWordCount);
        Collections.reverse(newSortWordCount);
        List<String> mostCommonWords = newSortWordCount.subList(0, limit);
        commonWords.put("mostCommon", mostCommonWords);
    }
}
