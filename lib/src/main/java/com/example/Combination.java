package com.example;

/**
 * Created by LXChild on 03/10/2016.
 */

public final class Combination {

    public static void combination(char[] chars, int start) {
        if (chars == null || chars.length < 1) {
            return;
        }
        char[] comed = new char[chars.length];
        for (int i = start; i < chars.length; i++) {
            comed[i] = chars[i];
            combination(chars, ++start);
            for (char c : comed) {
                if (c != '\0') {
                    System.out.print(c + "");
                }
            }
            System.out.println();
        }
    }
}
