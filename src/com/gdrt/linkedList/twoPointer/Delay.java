package com.gdrt.linkedList.twoPointer;

import com.gdrt.linkedList.ListNode;

public class Delay {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode first = beforeHead;
        ListNode second = beforeHead;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }
}
