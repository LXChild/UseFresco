package com.example;

/**
 * Created by LXChild on 9/30/16.
 */

public final class HasSubTree {


    public static void init() {
        BinaryTreeNode a = new BinaryTreeNode(1);
        BinaryTreeNode b = new BinaryTreeNode(2);
        BinaryTreeNode c = new BinaryTreeNode(3);
        BinaryTreeNode d = new BinaryTreeNode(4);
        BinaryTreeNode e = new BinaryTreeNode(5);
        BinaryTreeNode f = new BinaryTreeNode(6);
        BinaryTreeNode g = new BinaryTreeNode(7);
        BinaryTreeNode h = new BinaryTreeNode(8);
        BinaryTreeNode i = new BinaryTreeNode(9);
        BinaryTreeNode j = new BinaryTreeNode(10);
        BinaryTreeNode j1 = new BinaryTreeNode(101);
        a.lc = b; a.rc = c; b.lc = d; b.rc = e;
        c.lc = f; c.rc = g; d.lc = h; d.rc = i;
        e.lc = j;
        System.out.println(detect(a, j1));
    }
    public static boolean detect (BinaryTreeNode root, BinaryTreeNode subRoot) {
        if (root == null || subRoot == null) {
            return false;
        }
        boolean result = false;

        if (root.value == subRoot.value) {
            if (root.lc != null && subRoot.lc != null && root.lc.value == subRoot.lc.value) {
                if (root.rc != null && subRoot.rc != null && root.rc.value == subRoot.rc.value) {
                    result =  true;
                } else if (root.rc == null && subRoot.rc == null) {
                    result =  true;
                }
            } else if (root.lc == null && subRoot.lc == null){
                if (root.rc != null && subRoot.rc != null && root.rc.value == subRoot.rc.value) {
                    result =  true;
                } else if (root.rc == null && subRoot.rc == null) {
                    result =  true;
                }
            }
        } else {
            result = detect(root.lc, subRoot);
            if (!result) {
                result = detect(root.rc, subRoot);
            }
        }
        return result;
    }
}
