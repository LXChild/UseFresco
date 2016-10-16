package com.example;

public class Main {
    public static void main(String[] arg) {
        int[] a = {1, 2, 4, 3};
        Sort.heapSort(a);
        for (int i : a) {
            System.out.println(i + "");
        }
    }
}
