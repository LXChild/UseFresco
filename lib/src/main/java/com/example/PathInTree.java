package com.example;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by LXChild on 02/10/2016.
 */

public final class PathInTree {

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
        getPath(a, 7);
    }

    private static void getPath (BinaryTreeNode root, int value) {
        if (root == null || root.value > value) {
            return;
        }
        ArrayList<BinaryTreeNode> used = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        int sum = 0;
        stack.push(root);
        used.add(root);
        sum += root.value;
        if (sum == value) {
            System.out.println(sum + "");
            return;
        }
        while (!stack.isEmpty()) {
            if (stack.peek().lc != null) {
                if (sum == value) {
                    for (BinaryTreeNode node : stack){
                        System.out.println(node.value + "");
                    }
                    sum -= stack.pop().value;
                } else if (sum < value) {
                    if (stack.peek().lc != null && !used.contains(stack.peek().lc)) {
                        stack.push(stack.peek().lc);
                        sum += stack.peek().value;
                        used.add(stack.peek().lc);
                    } else if (stack.peek().rc != null && !used.contains(stack.peek().rc)){
                        stack.push(stack.peek().rc);
                        sum += stack.peek().value;
                        used.add(stack.peek().rc);
                    } else {
                        sum -= stack.pop().value;
                    }
                } else {
                    sum -= stack.pop().value;
                }
            }

        }
    }
}
