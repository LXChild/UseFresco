package com.example;

/**
 * Created by LXChild on 09/10/2016.
 */

public final class BinaryTreeNextNode {

    public static BinaryTreeNode getNext(BinaryTreeNode root, BinaryTreeNode node) {
        if (node == null) {
            return null;
        }
        if (node.rc != null) {
            return getInOrderNext(node.rc);
        } else {
            while (node.parent != null) {
                if (node.parent.rc != null && node.parent.rc != node) {
                    return node.parent;
                } else {
                    node = node.parent;
                }
            }
        }
        return null;
    }

    private static BinaryTreeNode getInOrderNext(BinaryTreeNode node) {
        if (node == null) {
            return null;
        }
        if (getInOrderNext(node.lc) == null) {
            return node;
        } else {
            getInOrderNext(node.lc);
        }
        return null;
    }
}
