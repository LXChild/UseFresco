package com.example;

/**
 * Created by LXChild on 10/1/16.
 */

public final class SquenceOfBST {

    public static void init() {
        int[] arr = {2, 3, 4, 6, 8, 7, 5};
        System.out.println(verify(arr, 0, 7));
    }

    private static boolean verify(int[] sequence, int start, int length) {
        if (sequence == null || length < 1) {
            return false;
        }
        int i = start;
        for (; i < length; i++) {
            if (sequence[i] > sequence[length - 1]) {
                break;
            }
        }
        int j = i;
        for (; j < length; j++) {
            if (sequence[j] < sequence[length - 1]) {
                return false;
            }
        }
        boolean left = true;
        if (i > 1) {
            left = verify(sequence, start, i);
        }
        boolean right = true;
        if (i < length - 1) {
            right = verify(sequence, i, length - i - 1);
        }
        return left && right;
    }
}
