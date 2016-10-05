package com.example;

/**
 * Created by LXChild on 10/1/16.
 */

public final class PrintMatrixInCircle {

    public static void init() {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}};
        print(arr);

    }

    private static void print(int[][] arr) {
        if (arr == null || arr.length < 1 || arr[0].length < 1) {
            return;
        }
        int row_top = 0, row_bottom = arr.length - 1, column_front = 0, column_end = arr[0].length - 1;
        boolean toL = false, toR = true, toU = false, toD = false;
        int i = 0, j = 0;
        while (true) {
            if (row_top == row_bottom + 1) {
                System.out.println(arr[i][j] + "");
                break;
            }
            if (column_front == column_end + 1) {
                System.out.println(arr[i][j] + "");
                break;
            }
            if (j < column_end && toR) {
                System.out.println(arr[i][j++] + "");
                if (j == column_end) {
                    --column_end;
                    toR = false;
                    toD = true;
                }
            } else {
                if (i < row_bottom && toD) {
                    System.out.println(arr[i++][j] + "");
                    if (i == row_bottom) {
                        --row_bottom;
                        toD = false;
                        toL = true;
                    }
                } else {
                    if (j > column_front && toL) {
                        System.out.println(arr[i][j--] + "");
                        if (j == column_front) {
                            ++column_front;
                            toL = false;
                            toU = true;
                        }
                    } else {
                        if (i > row_top + 1 && toU) {
                            System.out.println(arr[i--][j] + "");
                            if (i == row_top + 1) {
                                ++row_top;
                                toU = false;
                                toR = true;
                            }
                        }
                    }
                }
            }
        }
    }
}
