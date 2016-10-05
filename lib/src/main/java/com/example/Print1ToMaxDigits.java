package com.example;

/**
 * Created by LXChild on 9/27/16.
 */

public final class Print1ToMaxDigits {

    public static void print(int n) {
        if (n > 31 || n <= 0) {
            throw new IllegalArgumentException();
        }
        int num = 1;
        while (n-- > 0) {
            num *= 10;
        }
        int i = 1;
        while (--num > 0) {
            System.out.println(i++);
        }
    }

    public static String print2(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        String num = "0";
 //           numPlus("209", "1");
        while (true) {
            num = numPlus(num, "1");
            if (num.charAt(0) == '0') {
                num = num.substring(1, num.length());
            } else {

            }
            if (num.length() <= n) {
                System.out.println(num);
            } else {
                break;
            }
        }
        return num;
    }

    public static String numPlus(String s1, String s2) {
        if (s1.length() < 1) {
            return s2.length() < 1 ? "" : s2;
        }

        int length_l = s1.length() > s2.length() ? s1.length() : s2.length();
        char[] sum = new char[length_l + 1];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = '0';
        }
        char[] c_s1 = s1.toCharArray();
        char[] c_s2 = s2.toCharArray();
        int length_s = c_s1.length > c_s2.length ? c_s2.length : c_s1.length;
        boolean isTakeOver = false;
        for (int i = 0; i < length_s; i++) {
            int n = plus(c_s1[c_s1.length - i - 1], c_s2[c_s2.length - i - 1]);
            if (isTakeOver) {
                n++;
            }
            if (n > 9) {
                isTakeOver = true;
                n -= 10;
            } else {
                isTakeOver = false;
            }
            sum[sum.length - i - 1] = (char) (n + '0');
        }
        int gap = length_l - length_s;
        for (int i = gap - 1; i >= 0; i--) {
            String l_s = s1.length() > s2.length() ? s1 : s2;
            if (isTakeOver) {
                int num = plus(l_s.charAt(i), '1');
                if (num < 10) {
                    sum[i + 1] = (char) (num + '0');
                    isTakeOver = false;
                } else {
                    num -= 10;
                    sum[i + 1] = (char) (num + '0');
                    isTakeOver = true;
                }
            } else {
                sum[i + 1] = l_s.charAt(i);
            }
        }
        if (isTakeOver) {
            sum[0] += 1;
        }
        return String.valueOf(sum);
    }

    private static int plus(char c, char d) {
        return Integer.parseInt(String.valueOf(c)) + Integer.parseInt(String.valueOf(d));
    }
}
