package com.example;

/**
 * Created by LXChild on 09/10/2016.
 */

public final class EntryNodeOfLoop {
    public static void init() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2; node2.next = node3;
        node3.next = node4; node4.next = node5;
        node5.next = node6; node6.next = node3;
        ListNode meetingNode = getMeetingNode(node1);
        int loopNodeCount = getLoopNodeNum(meetingNode);
        ListNode startLoopNode = getLoopStartNode(node1,loopNodeCount);
        System.out.println(startLoopNode.val + "");
    }
    private static ListNode getMeetingNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p1, p2;
        p1 = head.next;
        p2 = p1.next;
        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        return null;
    }

    private static int getLoopNodeNum(ListNode node) {
        if (node == null) {
            return 0;
        }
        ListNode current = node;
        node = node.next;
        int count = 1;
        while (node != null && current != node) {
            node = node.next;
            count ++;
        }
        return count;
    }
    /**
     * @param head 链表头节点
     * @param loopCount 循环节点数量
     * */
    private static ListNode getLoopStartNode(ListNode head, int loopCount) {
        if (head == null || loopCount < 1) {
            return null;
        }
        ListNode p_slow, p_fast;
        p_slow = p_fast = head;
        while ((loopCount --) > 0) {
            if (p_fast == null) {
                return null;
            }
            p_fast = p_fast.next;
        }
        while (p_slow != null && p_fast != null) {
            if (p_slow == p_fast) {
                return p_slow;
            }
            p_slow = p_slow.next;
            p_fast = p_fast.next;
        }
        return null;
    }
}
