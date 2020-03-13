package com.gdrt.linkedList.twoLists;

import com.gdrt.linkedList.ListNode;

public class Merge {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode i1 = l1, i2 = l2;

        while (i1 != null && i2 != null) {

            if (i1.val < i2.val) {
                while (i1.next != null && i1.next.val < i2.val) {
                    i1 = i1.next;
                }
                ListNode temp1 = i1.next;
                i1.next = i2;
                i1 = temp1;
            }
            else {
                while (i2.next != null && i2.next.val <= i1.val) {
                    i2 = i2.next;
                }
                ListNode temp2 = i2.next;
                i2.next = i1;
                i2 = temp2;
            }
        }

        return l1.val < l2.val ? l1 : l2;
    }

}
