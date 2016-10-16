package com.example;

/**
 * Created by LXChild on 9/24/16.
 */

public final class Sort {
    /**
     * 冒泡排序,时间复杂度: 最好O(n),最坏O(n^2)
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static void swap(int[] source, int index_num1, int index_num2) {
        int temp = source[index_num1];
        source[index_num1] = source[index_num2];
        source[index_num2] = temp;
    }

    /**
     * 直接插入排序,O(n^2)
     */
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }

    /**
     * 选择排序,时间复杂度:O(n^2)
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_index = j;
                }
            }
            arr[min_index] = arr[i];
            arr[i] = min;
        }
    }

    /**
     * 桶排序, 时间复杂度O(n)
     */
    public static void bucketSort(int[] arr, int maxNum) throws Exception {
        if (arr == null || arr.length < 1) {
            return;
        }
        int[] timesOfNum = new int[maxNum + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] > maxNum) {
                throw new Exception("num out of range.");
            }
            timesOfNum[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < timesOfNum.length; i++) {
            for (int j = 0; j < timesOfNum[i]; j++) {
                arr[index] = i;
                index++;
            }
        }
    }

    /**
     * 快速排序,时间复杂度:O(n * log n), 不稳定
     */
    public static void quickSort(int[] arr) {
        partition(arr, 0, arr.length - 1);
    }

    private static void partition(int[] arr, int start, int end) {
        if (arr == null || arr.length < 1) {
            return;
        }
        if (start > end) {
            return;
        }
        int i = start, j = end, temp;
        while (i < j) {
            while (i < j && arr[j] >= arr[start]) {
                j --;
            }
            while (i < j && arr[i] <= arr[start]) {
                i ++;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp  = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        partition(arr, start, i - 1);
        partition(arr, i + 1, end);
    }
    /**
     * 堆排序， 时间复杂度O(logn)
     * */
    public static void heapSort(int[] arr) {
        int lastIndex = arr.length - 1;
        buildHeap(arr, lastIndex);
        for (int i = 0; i < arr.length; i ++) {
            swap(arr, 0, lastIndex);
            adjustHeap(arr, 0, -- lastIndex);
        }
    }
    private static void buildHeap(int[] arr, int lastIndex) {
        for (int i = (lastIndex >> 1); i >= 0; i --) {
            adjustHeap(arr, i, lastIndex);
        }
    }
    private static void adjustHeap(int[] arr, int i, int lastIndex) {
        int mx = i;
        int lc = 2 * i + 1;
        int rc = 2 * i + 2;
        if (lc <= lastIndex && arr[lc] > arr[mx]) {
            mx = lc;
        }
        if (rc <= lastIndex && arr[rc] > arr[mx]) {
            mx = rc;
        }
        if (mx != i) {
            swap(arr, mx, i);
            adjustHeap(arr, mx, lastIndex);
        }
    }
}
