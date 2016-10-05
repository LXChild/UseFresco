package com.example;

/**
 * Created by LXChild on 9/26/16.
 */

public final class FindInRotateArr {
    private static final int[] arr = {1, 2, 3, 0};

    public static int find() throws Exception {
        if (arr == null || arr.length < 1) {
            throw new Exception("null array.");
        }
        int front = 0;
        int end = arr.length - 1;
        int mid = front;

        while (arr[front] >= arr[end]) {
            if (end - front == 1) {
                mid = end;
                break;
            }
            mid = (front + end) / 2;
            if (arr[front] == arr[mid] && arr[mid] == arr[end]) {
                return minInOrder();
            }
            if (arr[mid] >= arr[front]) {
                front = mid;
            } else if (arr[mid] < arr[front]) {
                end = mid;
            }
        }
        return arr[mid];
    }

    private static int minInOrder() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
