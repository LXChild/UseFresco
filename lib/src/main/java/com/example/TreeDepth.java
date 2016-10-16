package com.example;

/**
 * Created by LXChild on 07/10/2016.
 */

public final class TreeDepth {

    public static int getDepth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int d_left = getDepth(root.lc);
        int d_right = getDepth(root.rc);
        return d_left > d_right ? (++ d_left) : (++ d_right);
    }
}
