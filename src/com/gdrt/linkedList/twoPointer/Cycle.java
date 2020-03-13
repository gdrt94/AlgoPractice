package com.gdrt.linkedList.twoPointer;

import com.gdrt.linkedList.ListNode;

public class Cycle {
    public ListNode hasCycle(ListNode head) {

        if (head == null)
            return null;

        ListNode p1 = head, p2 = head;

        while(p1.next != null && p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2)
                return p1;
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {

        ListNode detected = hasCycle(head);
        if (detected == null)
            return null;

        while (detected != head) {
            detected = detected.next;
            head = head.next;
        }
        return detected;
    }
}
