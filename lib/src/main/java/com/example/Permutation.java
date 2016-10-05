package com.example;

/**
 * Created by LXChild on 02/10/2016.
 */

public final class Permutation {

    public static void permutation(char[] buf, int start) {
        if (buf == null) {
            return;
        }
        if (start == buf.length) {// 当只要求对数组中一个字母进行全排列时，只要就按该数组输出即可
            System.out.println(String.valueOf(buf));
        } else {// 多个字母全排列
            for (int i = start; i < buf.length; i++) {
                if (i != start) {
                    char temp = buf[start];// 交换数组第一个元素与后续的元素
                    buf[start] = buf[i];
                    buf[i] = temp;
                }

                permutation(buf, start + 1);// 后续元素递归全排列

                if (i != start) {
                    char temp = buf[start];// 将交换后的数组还原
                    buf[start] = buf[i];
                    buf[i] = temp;
                }
            }
        }
    }
}
