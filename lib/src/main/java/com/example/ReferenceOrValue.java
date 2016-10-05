package com.example;

/**
 * Created by LXChild on 02/10/2016.
 */

public final class ReferenceOrValue {
    public static void verify(String s) {
        s = "new string.";
    }
    public static void verify1(BinaryTreeNode s) {
        s.value = 2345;
    }
}
