package com.example;

import java.util.Stack;

/**
 * Created by LXChild on 9/24/16.
 */
/**
 * 剑指offer p53:反转链表
 * */
public final class ReverseLinkedList {
    private class ListNode {
        private int value;
        private ListNode next;
    }
    public static ListNode head = null;
    public ReverseLinkedList() {
        for (int i = 0; i < 10; i++) {
            ListNode node = new ListNode();
            node.value = i;
            node.next = null;
            addToTail(node);
        }
    }

    private void addToTail(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }

    public ListNode reverse() {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode tmp = head;
        while (tmp != null) {
            stack.push(tmp);
            tmp = tmp.next;
        }
        head = stack.pop();
        tmp = head;
        while (!stack.isEmpty()) {
            tmp.next = stack.pop();
            tmp = tmp.next;
        }
        tmp.next = null;

        return head;
    }

//    public void recursive(ListNode head) {
//        if (head != null) {
//            if (head.next != null) {
//                recursive(head.next);
//            }
//            System.out.println(head.value);
//        }
//    }

    public void printResult() {
        if (head == null) {
            return;
        }
        ListNode tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
}
