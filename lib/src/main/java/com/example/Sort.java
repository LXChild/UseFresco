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
     * 快速排序,时间复杂度:O(n * log n)
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
     * 快速排序
     */
//    private void quick() {
//        Log.d(TAG, "quick>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//
//        if (array.length > 0) {
//            quickSort(array, 0, array.length - 1);
//        }
//    }
//
//    private static void quickSort(int[] a, int low, int high) {
//        if (low < high) { //如果不加这个判断递归会无法退出导致堆栈溢出异常
//            int middle = getMiddle(a, low, high);
//            quickSort(a, 0, middle - 1);
//            quickSort(a, middle + 1, high);
//        }
//    }
//
//    private static int getMiddle(int[] a, int low, int high) {
//        int temp = a[low];//基准元素
//        while (low < high) {
//            //找到比基准元素小的元素位置
//            while (low < high && a[high] >= temp) {
//                high--;
//            }
//            a[low] = a[high];
//            while (low < high && a[low] <= temp) {
//                low++;
//            }
//            a[high] = a[low];
//        }
//        a[low] = temp;
//        return low;
//    }
}
