package com.gdrt.linkedList.twoPointer;

import com.gdrt.linkedList.ListNode;

public class Rotation {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        int length = 1;
        ListNode current = head;
        while (current.next != null) {
            length++;
            current = current.next;
        }

        k = k % length;
        if (k == 0)
            return head;

        current.next = head;
        for (int i = 1; i <= length - k; i++) {
            current = current.next;
        }
        ListNode newHead = current.next;
        current.next = null;
        return newHead;
    }
}
