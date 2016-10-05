package com.example;

/**
 * Created by LXChild on 02/10/2016.
 */

public final class ConvertBinaryTreeToLinkList {
    static class BSTN {
        private int value;
        private BSTN left;
        private BSTN right;
    }

    public static void init() {
        BSTN node1 = new BSTN();
        BSTN node2 = new BSTN();
        BSTN node3 = new BSTN();
        BSTN node4 = new BSTN();
        BSTN node5 = new BSTN();
        BSTN node6 = new BSTN();
        BSTN node7 = new BSTN();
        node1.value = 3;
        node2.value = 5;
        node3.value = 6;
        node4.value = 4;
        node5.value = 1;
        node6.value = 2;
        node7.value = 0;
        node1.left = node5;
        node1.right = node2;
        node2.left = node4;
        node2.right = node3;
        node5.left = node7;
        node5.right = node6;
        BSTN head = new BSTN();

        aftOrder(node1, head);
            while (head != null) {
                System.out.println(head.value);
                head = head.right;
            }
    }

    private static BSTN aftOrder(BSTN root, BSTN head) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            aftOrder(root.left, head);
        }
        root.left = head;
        if (head != null) {
            head.right = root;
        }
        head = root;
        System.out.println(root.value);
        if (root.right != null) {
            aftOrder(root.right, head);
        }
        return head;
    }
}
