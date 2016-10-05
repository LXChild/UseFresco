package com.example;

/**
 * Created by LXChild on 02/10/2016.
 */

public final class CloneComplexListNode {
    static class ComplexListNode {
        private int value;
        private ComplexListNode next;
        private ComplexListNode Sibling;
    }
    public static void init() {
        ComplexListNode node = new ComplexListNode();node.value = 1;
        ComplexListNode node1 = new ComplexListNode();node1.value = 2;
        ComplexListNode node2 = new ComplexListNode();node2.value = 3;
        ComplexListNode node3 = new ComplexListNode();node3.value = 4;
        ComplexListNode node4 = new ComplexListNode();node4.value = 5;
        ComplexListNode node5 = new ComplexListNode();node5.value = 6;
        ComplexListNode node6 = new ComplexListNode();node6.value = 7;
        ComplexListNode node7 = new ComplexListNode();node7.value = 8;
        node.next = node1;node1.next = node2;
        node2.next = node3;node3.next = node4;
        node4.next = node5;
        node5.next = node6;node6.next = node7;
        node.Sibling = node3;node1.Sibling = node2;
        node2.Sibling = node1;node3.Sibling = node6;
        node4.Sibling = node7;node5.Sibling = null;
        node6.Sibling = node4;node7.Sibling = node5;
        ComplexListNode head = clone(node);
        while (head != null) {
            System.out.println(head.value + "");
            head = head.Sibling;
        }

    }
    public static ComplexListNode clone(ComplexListNode head) {
        cloneNodes(head);
        connectSiblingNodes(head);
        return reconnectNodes(head);
    }
    private static void cloneNodes(ComplexListNode head) {
        ComplexListNode temp = head;
        while (temp != null) {
            ComplexListNode cloned = new ComplexListNode();
            cloned.value = temp.value;
            cloned.next = temp.next;
            cloned.Sibling = null;

            temp.next = cloned;
            temp = cloned.next;
        }
    }
    private static void connectSiblingNodes(ComplexListNode head) {
        ComplexListNode temp = head;
        while (temp != null) {
            ComplexListNode cloned = temp.next;
            if (temp.Sibling != null) {
                cloned.Sibling = temp.Sibling.next;
            }
            temp = cloned.next;
        }
    }

    private static ComplexListNode reconnectNodes(ComplexListNode head) {
        ComplexListNode node = head;
        ComplexListNode clonedHead = null;
        ComplexListNode clonedNode = null;
        if (node != null) {
            clonedHead = clonedNode = node.next;
            node.next = clonedNode.next;
            node = node.next;
        }
        while (node != null) {
            clonedNode.next = node.next;
            clonedNode = clonedNode.next;
            node.next = clonedNode.next;
            node = node.next;
        }
        return clonedHead;
    }
}
