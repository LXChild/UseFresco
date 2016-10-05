package com.example;

/**
 * Created by LXChild on 9/26/16.
 */

public final class Is2sPower {

    public static boolean solution(int n) {
        return (n & (n - 1)) == 0 && n > 0;
    }
}
