package com.example;

/**
 * Created by LXChild on 04/10/2016.
 */

public final class Num1Btw1AdN {

    public static int calculate(int n) {
        int num = 0;
        for (int i = 1; i <=n; i++) {
            num += numOf1(i);
        }
        return num;
    }
    private static int numOf1(int n) {
        int count = 0;
        while (n > 0) {
            if ((n % 10) == 1) {
                count ++;
            }
            n /= 10;
        }
        return count;
    }
}
