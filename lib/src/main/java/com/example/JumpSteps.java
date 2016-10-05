package com.example;

/**
 * Created by LXChild on 9/26/16.
 */

public final class JumpSteps {

    public static int recursive(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return recursive(n - 1) + recursive(n - 2);
    }
}
