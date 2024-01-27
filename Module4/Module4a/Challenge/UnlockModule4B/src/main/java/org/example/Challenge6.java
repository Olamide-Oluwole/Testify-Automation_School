package org.example;

import java.util.Arrays;

public class Challenge6 {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and punctuation, convert to lowercase
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if the sorted characters of the strings match
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String sentence = "Despite commuting at the peek hour, she was able to keep totime";
        String[] words = sentence.split("\\s+");

        System.out.println("Anagrams in the sentence:");
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (areAnagrams(words[i], words[j])) {
                    System.out.println(words[i] + " and " + words[j] + " are anagrams.");
                }
            }
        }
    }
}
