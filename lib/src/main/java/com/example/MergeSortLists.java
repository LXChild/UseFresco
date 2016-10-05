package com.example;

/**
 * Created by LXChild on 9/30/16.
 */

public final class MergeSortLists {

    private static final class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public static void init() {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(1);
        ListNode temp1 = new ListNode(2);
        ListNode temp2 = new ListNode(2);
        ListNode temp3 = new ListNode(4);
        ListNode temp4 = new ListNode(5);
        ListNode temp5 = new ListNode(6);
        head1.next = temp1;
        head2.next = temp2;
        temp1.next = temp3;
        temp2.next = temp4;
        temp1.next = temp5;
        temp5.next = null;

        ListNode newHead  = merge(head1, head2);
        while (newHead != null) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }
    }

    private static ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        ListNode newHead = head1.value < head2.value ? head1 : head2;
        newHead.next = merge((head1.value < head2.value) ? head1.next : head1,
                (head1.value < head2.value) ? head2 : head2.next);
        return newHead;
    }
}
