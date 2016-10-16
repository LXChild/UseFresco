package com.example;

/**
 * Created by LXChild on 11/10/2016.
 */

public final class QuickSort {
    public static void init(int[] arr, int start, int end) {
        int index = partition(arr, start, end);
        if (index > start) {
            init(arr, start, -- index);
        }
        if (index < end) {
            init(arr, ++ index, end);
        }
    }
    private static int partition(int[] arr, int start, int end) {

        int i = start; int j = arr.length - 1; int temp;
        while (i < j) {
            while (j > i && arr[j] > arr[start]) {
                j --;
            }
            while (i < j && arr[i] < arr[start]) {
                i ++;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        return i;
    }
}
