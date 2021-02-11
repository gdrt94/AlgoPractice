package com.gdrt.linkedList.classic;

import com.gdrt.linkedList.ListNode;

public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
