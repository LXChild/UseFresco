package com.example;

/**
 * Created by LXChild on 08/10/2016.
 */

public final class LastRemaining {

    public static int getNum(int[] arr, int gap) {
        int count_death = 0;
        int i = 0, m = gap;
        int last = -1;
        while (count_death < arr.length) {
            if (arr[i] != -1) {
                m --;
                if (m == 0) {
                    last = arr[i];
                    arr[i] = -1;
                    m = gap;
                    count_death ++;
                }
            }
            i = (i == arr.length - 1) ? 0 : (++ i);
        }
        return last;
    }
}
