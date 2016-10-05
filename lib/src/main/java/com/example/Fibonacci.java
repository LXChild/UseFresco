package com.example;

/**
 * Created by LXChild on 9/26/16.
 */

public final class Fibonacci {

    public static int recursive(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return recursive(n - 1) + recursive(n - 2);
    }

    public static int loop(int n) {
        int[] result = {0, 1};
        if (n < 2) {
            return result[n];
        }
        int num1 = 0;
        int num2 = 1;
        int fibN = 0;
        for (int i = 1; i < n; i++) {
            fibN = num1 + num2;
            num1 = num2;
            num2 = fibN;
        }
        return fibN;
    }
}
