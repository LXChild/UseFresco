package com.example;

import java.util.Arrays;

/**
 * Created by LXChild on 08/10/2016.
 */

public final class ReverseWordsInSentence {

    public static void reverse(String s) {
        String[] s_split = s.split(" ");

        System.out.println(Arrays.toString(reverseStringArr(s_split)));
    }

    private static String reverseString(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
        char[] c = s.toCharArray();
        int start, end;
        start = 0; end = c.length - 1;
        char temp;
        while (start < end) {
            temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start ++; end --;
        }
        return String.valueOf(c);
    }
    private static String[] reverseStringArr(String[] s) {
        if (s == null || s.length < 1 || s[0].length() < 1) {
            return s;
        }
        int start, end;
        start = 0; end = s.length - 1;
        String temp;
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++; end --;
        }
        return s;
    }
}
