package org.example;

public class Challenge1 {

    public static void main(String[] args) {
        testPalindrome("racecar");
        testPalindrome("10801");
    }

    private static void testPalindrome(String word) {
        String reverseStr = "";

        int strLength = word.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + word.charAt(i);
        }

        if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(word + " is a Palindrome String.");
        } else {
            System.out.println(word + " is not a Palindrome String.");
        }
    }
}
