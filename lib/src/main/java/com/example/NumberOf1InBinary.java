package com.example;

/**
 * Created by LXChild on 9/26/16.
 */

public final class NumberOf1InBinary {

    public static int solution1 (int n) throws Exception {
        if (n < 0) {
            throw new Exception("num out of range.");
        }
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int solution2(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) == flag) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    public static int solution3(int n) {
        int count = 0;
        while (n != 0) {
            n &= n - 1;
            count ++;
        }
        return count;
    }
}
