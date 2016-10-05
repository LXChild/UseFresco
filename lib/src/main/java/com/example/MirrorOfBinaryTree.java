package com.example;

/**
 * Created by LXChild on 10/1/16.
 */

public final class MirrorOfBinaryTree {

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
        a.lc = b; a.rc = c; b.lc = d; b.rc = e;
        c.lc = f; c.rc = g; d.lc = h; d.rc = i;
        e.lc = j;

        BinaryTreeNode root = MirrorRecursively(a);
        BinaryTreeOperate.print(root);
    }

    private static BinaryTreeNode MirrorRecursively(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.lc != null) {
            if (root.rc != null) {
                BinaryTreeNode temp = root.lc;
                root.lc = root.rc;
                root.rc = temp;
            } else {
                root.rc = root.lc;
                root.lc = null;
            }
        } else if (root.rc != null) {
            root.lc = root.rc;
            root.rc = null;
        }
        MirrorRecursively(root.lc);
        MirrorRecursively(root.rc);
        return root;
    }
}
