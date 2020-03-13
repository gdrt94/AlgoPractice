package com.gdrt.linkedList.twoLists;

import com.gdrt.linkedList.ListNode;

public class Addition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(1);
        ListNode prev = head;
        ListNode node = null;

        int rem = 0;
        while(l1 != null && l2 != null) {

            int num = l1.val + l2.val + rem;
            node = new ListNode(num%10);
            rem = num/10;

            prev.next = node;
            prev = node;

            l1 = l1.next;
            l2 = l2.next;
        }

        if (l2 == null && l1 != null) {
            while(l1 != null) {

                int num = l1.val + rem;
                node = new ListNode(num%10);
                rem = num/10;

                prev.next = node;
                prev = node;

                l1 = l1.next;
            }
        } else if (l1 == null && l2 != null) {
            while (l2 != null) {
                int num = l2.val + rem;
                node = new ListNode(num%10);
                rem = num/10;

                prev.next = node;
                prev = node;

                l2 = l2.next;
            }
        }
        if (rem == 1)
            node.next = new ListNode(1);
        return head.next;
    }
}
