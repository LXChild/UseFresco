package com.example;

/**
 * Created by LXChild on 03/10/2016.
 */

public final class MoreThanHalfNum {

    public static int getNum(int[] arr) {
        int index = partition(arr, 0, arr.length - 1);
        int middle = (arr.length >> 1);
        int start = 0, end = arr.length - 1;
        while (index != middle) {
            if (index > middle) {
               index = partition(arr, start, index - 1);
            }
            if (index < middle) {
               index = partition(arr, index + 1, end);
            }
        }
        int num = arr[middle];
        System.out.println(num + "");
        return num;
    }

    private static int partition(int[] arr, int start, int end) {
        if (arr == null || arr.length < 1) {
            return -1;
        }
        int i = start, j = end;
        while (i < j) {
            while (i < j && arr[j] >= arr[start]) {
                j --;
            }
            while (i < j && arr[j] <= arr[start]) {
                i ++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }
}
