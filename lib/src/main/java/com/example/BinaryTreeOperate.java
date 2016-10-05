package com.example;

import java.util.ArrayList;

/**
 * Created by LXChild on 10/1/16.
 */

public final class BinaryTreeOperate {

    private static ArrayList<Integer> arr = new ArrayList<>();
    private static void printTree(BinaryTreeNode root) {
        if (root != null) {
            if (root.lc != null) {
                printTree(root.lc);
            }
            if (root.rc != null) {
                printTree(root.rc);
            }
            arr.add(root.value);
        }
    }
    public static void print(BinaryTreeNode root) {
        printTree(root);
        if (arr.size() > 0) {
            for (Integer anArr : arr) {
                System.out.print(anArr + ",");
            }
        }
    }
}
