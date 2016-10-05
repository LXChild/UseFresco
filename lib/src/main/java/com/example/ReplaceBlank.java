package com.example;

/**
 * Created by LXChild on 9/24/16.
 */
/**
 * 剑指offer p47:替换空格
 * */
public final class ReplaceBlank {
    private static char[] s = {'w', 'e', ' ', 'a', 'r', 'e', ' ', 'h', 'a', 'p', 'p', 'y'};
    public static char[] replace() {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                count++;
            }
        }
        System.out.println("origin length: " + s.length);
        int newLength = s.length + 2 * count;
        System.out.println("new length: " + newLength);
        char[] newChar = new char[newLength];
        int p1 = s.length - 1;
        int p2 = newLength - 1;
        for (int i = 0; i < s.length; i++) {
            if (s[p1] != ' ') {
                newChar[p2--] = s[p1--];
            } else {
                newChar[p2--] = '0';
                newChar[p2--] = '2';
                newChar[p2--] = '%';
                p1--;
            }
        }
        return newChar;
    }
}
