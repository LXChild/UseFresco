package com.example;

import static com.example.BinaryTreeOperate.print;

/**
 * Created by LXChild on 9/25/16.
 */

public final class RebuildBinaryTree {

    private static int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
    private static int[] in = {4, 7, 2, 1, 5, 3, 8, 6};

    public RebuildBinaryTree() {
        BinaryTreeNode root = constructCore(0, 7, 0, 7);
        print(root);
    }

    private BinaryTreeNode constructCore(int startPreOrder, int endPreOrder, int startInOrder, int endInOrder) {

        if (startInOrder > endInOrder || startPreOrder > endPreOrder) {
            return null;
        }
        BinaryTreeNode root = new BinaryTreeNode(pre[startPreOrder]);
        for (int i = startInOrder; i <= endInOrder; i++) {
            if (in[i] == pre[startPreOrder]) {
                root.lc = constructCore(startPreOrder + 1, i - startInOrder + startPreOrder, startInOrder, i - 1);
                root.rc = constructCore(i - startInOrder + startPreOrder + 1, endPreOrder, i + 1, endInOrder);
            }
        }
        return root;
    }
}
