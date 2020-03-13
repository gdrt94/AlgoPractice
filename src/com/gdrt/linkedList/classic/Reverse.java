package com.gdrt.linkedList.classic;

import com.gdrt.linkedList.ListNode;

public class Reverse {

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode cur = head, movingHead = head, temp;
        while(cur != null) {
            temp = cur.next;
            cur.next = movingHead;
            movingHead = cur;
            cur = temp;
        }
        head.next = null;
        return movingHead;
    }
}
