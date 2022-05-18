package net.msk4real.algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 543, 654, 23, -4, -34};
        int[] array2 = {33, 23, -45, -3, 0, 3};
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(mergeSort(array1, array2)));
    }

    public static int[] mergeSort(int[] array1, int[] array2) {
        int i = 0;
        int j = 0;
        int[] array3 = new int[array1.length + array2.length];

        for (int k = 0; k < array3.length; k++) {
            if (i > (array1.length - 1)) {
                int a = array2[j];
                array3[k] = a;
                j++;
            } else if (j > (array2.length - 1)) {
                int a = array1[i];
                array3[k] = a;
                i++;
            } else if (array1[i] > array2[j]) {
                int a = array2[j];
                array3[k] = a;
                j++;
            } else {
                int a = array1[i];
                array3[k] = a;
                i++;
            }
        }
        return array3;
    }
}
