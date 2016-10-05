package com.example;

import java.util.Scanner;

/**
 * Created by LXChild on 9/29/16.
 */

public final class Solution {
    public static void so() {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            System.out.println(getSolution(n));
        }
    }

    private static double getSolution(int n) {
        if (n < 1) {
            return 0;
        }
        double one = (double) (2 * n - 1) / getB(n);
        if (n > 0) {
            one += getSolution(--n);
        }
        return one;
    }

    private static double getB(int a) {
        if (a <= 1) {
            return 1.0;
        }
        if (a == 2) {
            return 2.0;
        }
        return getB(a - 1) + getB(a - 2);
    }
}
