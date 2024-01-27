package org.example;

public class Challenge2 {
    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        int lastSpaceIndex = sentence.lastIndexOf(' ');

        if (lastSpaceIndex == -1) {
            return sentence;
        }

        String lastWord = sentence.substring(lastSpaceIndex + 1);
        String remainingPart = sentence.substring(0, lastSpaceIndex);

        return lastWord + " " + reverseWords(remainingPart);
    }

    public static void main(String[] args) {
        String inputSentence = "I am the best AutomationTester";
        String reversedSentence = reverseWords(inputSentence);
        System.out.println("Original Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}
