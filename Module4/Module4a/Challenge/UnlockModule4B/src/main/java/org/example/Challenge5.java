package org.example;

import java.util.*;

public class Challenge5 {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // If sortedWord is not in the map, create a new list for it
            anagramMap.putIfAbsent(sortedWord, new ArrayList<>());

            // Add the word to the corresponding anagram group
            anagramMap.get(sortedWord).add(word);
        }

        // Convert the values (lists of anagrams) to a list
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] inputWords = {"akka", "akak", "baab", "baba", "bbaa"};

        List<List<String>> anagramBuckets = groupAnagrams(inputWords);

        System.out.println("Anagram Buckets:");
        for (List<String> bucket : anagramBuckets) {
            System.out.println(bucket);
        }
    }
}
