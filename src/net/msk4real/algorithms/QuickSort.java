package net.msk4real.algorithms;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] testData = {8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43};
        int low = 0;
        int high = testData.length - 1;
        quickSort(testData, low, high);
        System.out.println(Arrays.toString(testData));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int middle = low + (high - low);
        int opora = array[middle];
        int i = low;
        int j = high;

        while (i <= j){
            while (array[i] < opora){
                i++;
            }
            while (array[j] > opora){
                j--;
            }
            if (i <= j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            if (high > i){
                quickSort(array, i, high);
            }
            if (low < j){
                quickSort(array, low, j);
            }
        }
    }
}
