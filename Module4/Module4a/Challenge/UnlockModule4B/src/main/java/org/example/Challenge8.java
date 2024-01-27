package org.example;

public class Challenge8 {
    public static void countingSort(int[] arr) {
        int[] count = new int[10]; // Assuming values range from 1 to 9

        // Count the occurrences of each element
        for (int num : arr) {
            count[num]++;
        }

        // Reconstruct the sorted array here
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        // Example: Sorting an array of 1 million integers ranging from 1 to 9
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9) + 1;
        }

        long startTime = System.currentTimeMillis();

        countingSort(array);

        long endTime = System.currentTimeMillis();

        System.out.println("Sorted in " + (endTime - startTime) + " milliseconds");
    }
}
