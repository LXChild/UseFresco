package com.example;

/**
 * Created by LXChild on 11/10/2016.
 */

public final class FindNum {
    public static void init() {
        int[][] matrix = {{1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}};
        if (find(matrix, 18)) {
            System.out.println("Find num>>>>>>>>>>>>");
        } else {
            System.out.println("no Find num>>>>>>>>>>>>");
        }
    }

    private static boolean find(int[][] matrix, int num) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int row, column; row = 0; column = matrix[0].length - 1;
        while (column >= 0 && row < matrix.length) {
            if (matrix[row][column] > num) {
                column --;
            } else if (matrix[row][column] < num){
                row ++;
            } else if (matrix[row][column] == num){
                return true;
            }
        }
        return false;
    }
}
