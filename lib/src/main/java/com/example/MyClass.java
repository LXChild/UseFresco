package com.example;

public class MyClass {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3, 6, 8, 3, 9, 2, 15, 0};
        bubbleSort(arr);
        for (int i :
                arr) {
            System.out.println(i + ", ");
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int source[], int x, int y) {
        int temp = source[x];
        source[x] = source[y];
        source[y] = temp;
    }
}