package org.example;

public class Challenge3 {
    public static void findMaxProductNumbers(int[] nums) {
        if (nums == null || nums.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Compare the products of the max and min pairs
        long productMaxPair = (long) max1 * max2;
        long productMinPair = (long) min1 * min2;

        if (productMaxPair > productMinPair) {
            System.out.println("The numbers with maximum product: " + max1 + " and " + max2);
        } else {
            System.out.println("The numbers with maximum product: " + min1 + " and " + min2);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, -4, 6, -1, 4, 7, -2, 8, -3};

        findMaxProductNumbers(array);
    }
}
