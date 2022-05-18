package net.msk4real.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] testArray = {-1, 33, 2, 0, -40, 5, 25, 4, -6};
        System.out.println(Arrays.toString(bubbleSort(testArray)));
    }

    private static int[] bubbleSort(int[] testArray) {
        boolean sorted = true;
        int helper;

        while (sorted) {
            sorted = false;
            for (int i = 0; i < testArray.length - 1; i++) {
                if (testArray[i] > testArray[i + 1]) {
                    helper = testArray[i];
                    testArray[i] = testArray[i + 1];
                    testArray[i + 1] = helper;
                    sorted = true;
                }
            }
        }
        return testArray;
    }
}