package com.example;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by LXChild on 10/1/16.
 */

public final class PrintBinaryTreeFromTopToBottom {
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
        print(a);

    }
    private static void print(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.size() > 0) {
            BinaryTreeNode node = queue.poll();
            System.out.println(node.value);
            if (node.lc != null) {
                queue.offer(node.lc);
            }
            if (node.rc != null) {
                queue.offer(node.rc);
            }
        }
    }
}
