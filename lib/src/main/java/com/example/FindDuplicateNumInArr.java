package com.example;

/**
 * Created by LXChild on 09/10/2016.
 */

public final class FindDuplicateNumInArr {

    public static void find(int[] arr) {
        if (arr == null || arr.length < 1) {
            return;
        }
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i) {
                i ++;
            } else if (arr[i] == arr[arr[i]]){
                System.out.println(arr[i] + "");
                i ++;
            } else {
                int temp = arr[i];
                arr[i] = arr[arr[i]];
                arr[arr[i]] = temp;
            }
        }
    }
}
