package org.example;

public class Challenge7 {
    public static String reverseString(String input) {
        // Base case: if the string is empty or has only one character
        if (input == null || input.length() <= 1) {
            return input;
        }

        // Recursive case: reverse the substring excluding the first character
        return reverseString(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        String originalString = "TestifyAutomation";
        String reversedString = reverseString(originalString);

        System.out.println("The original String: " + originalString);
        System.out.println("The reversed String: " + reversedString);
    }
}
