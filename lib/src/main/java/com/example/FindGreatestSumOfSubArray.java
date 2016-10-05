package com.example;

/**
 * Created by LXChild on 04/10/2016.
 */

public final class FindGreatestSumOfSubArray {

    public static int maxSum = 0;
    public static int find(int[] arr) {
        if (arr == null || arr.length < 1) {
            return 0;
        }
        int currentMaxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (currentMaxSum <= 0) {
                currentMaxSum = arr[i];
            } else {
                currentMaxSum += arr[i];
            }
            if (currentMaxSum > maxSum) {
                maxSum = currentMaxSum;
            }
        }
        return maxSum;
    }
}
