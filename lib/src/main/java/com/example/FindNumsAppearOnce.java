package com.example;

/**
 * Created by LXChild on 08/10/2016.
 */

public final class FindNumsAppearOnce {

    public static void find(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int resultExclusiveOR = 0;
        for (int i = 0; i < arr.length; i ++) {
            resultExclusiveOR ^= arr[i];
        }
        int index = findFirstBitIs1(resultExclusiveOR);
        int num1, num2;
        num1 = num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (((arr[i] >> index) & 1) == 1) {
                num1 ^= arr[i];
            } else {
                num2 ^= arr[i];
            }
        }
        System.out.println("num 1 is : " + num1);
        System.out.println("num 2 is : " + num2);
    }

    private static int findFirstBitIs1(int num ) {
        int index = 0;
        while (((num & 1) == 0) && (index < 32)) {
            num >>= 1;
            index ++;
        }
        return index;
    }
}
