package com.gdrt.linkedList.classic;

import com.gdrt.linkedList.ListNode;

public class Palindrome {

    public boolean isPalindrome(ListNode head) {

        if (head == null)
            return true;

        int length = length(head);

        // reverse until middle
        ListNode newHead = null;
        ListNode middle = head;
        for (int i = 1; i <= length/2; i++) {
            ListNode next = middle.next;
            middle.next = newHead;
            newHead = middle;
            middle = next;
        }
        if ((length & 1) == 1)
            middle = middle.next;

        for (int i = 1; i <= length/2; i++) {
            if (middle.val != newHead.val)
                return false;
            middle = middle.next;
            newHead = newHead.next;
        }
        return true;
    }

    int length(ListNode h) {
        int i = 0;
        while (h != null) {
            i++;
            h = h.next;
        }
        return i;
    }
}
