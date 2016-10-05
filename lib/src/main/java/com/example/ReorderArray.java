package com.example;

/**
 * Created by LXChild on 9/29/16.
 */

public final class ReorderArray {

    public static void reorder(int[] arr) {
        for (int i = 0 ;  i < (arr.length); i++) {
            if (isEvenNum(arr[i])) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    if (i > j) {
                        return;
                    }
                    if (!isEvenNum(arr[j])) {
                        swap(arr, i, j);
                        break;
                    }
                }
            }
        }
    }
    public static void reorder2(int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin < end) {
            while (begin < end && !isEvenNum(arr[begin])) {
                begin++;
            }
            while (begin < end && isEvenNum(arr[end])) {
                end--;
            }
            if (begin < end) {
                swap(arr, begin, end);
            }
        }
    }
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static boolean isEvenNum(int a) {
        return (a & 0x01) == 0;
    }
}
