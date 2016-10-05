package com.example;

/**
 * Created by LXChild on 9/26/16.
 */

public final class CalculateSumOfOneToN {

    public static int recursive(int n) {
        return n <= 0 ? 0 : n + recursive(--n);
    }

    public static int loop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
