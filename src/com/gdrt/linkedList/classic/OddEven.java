package com.gdrt.linkedList.classic;

import com.gdrt.linkedList.ListNode;

public class OddEven {
    public ListNode oddEvenList(ListNode head) {

        if (head == null)
            return null;

        ListNode oddEnd = head, current = head.next;

        while (current != null && current.next != null) {
            ListNode evenStart = oddEnd.next;
            ListNode newOdd = current.next;
            current.next = newOdd.next;
            current = current.next;
            oddEnd.next = newOdd;
            newOdd.next = evenStart;
            oddEnd = newOdd;
        }
        return head;
    }
}
