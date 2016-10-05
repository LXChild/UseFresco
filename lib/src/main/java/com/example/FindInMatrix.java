package com.example;

/**
 * Created by LXChild on 9/24/16.
 */
/**
 * 剑指offer p40.二维数组中的查找
 * */
public final class FindInMatrix {
    private static int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};

    public static boolean Find(int num) {
        boolean found = false;
        if (arr != null && arr.length > 0 && arr[0].length >0) {
            int row = 0;
            int column = arr[0].length - 1;
            while (row < arr.length && column >= 0) {
                if (arr[row][column] == num) {
                    found = true;
                    break;
                } else if (arr[row][column] > num) {
                    column--;
                } else {
                    row++;
                }
            }
        }
        return found;
    }
}
