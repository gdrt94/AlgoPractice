package com.gdrt.linkedList.twoPointer;

import com.gdrt.linkedList.ListNode;

import java.util.Stack;

public class Intersection {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();

        while (headA != null) {
            stackA.push(headA);
            headA = headA.next;
        }
        while (headB != null) {
            stackB.push(headB);
            headB = headB.next;
        }

        ListNode intersection = null;
        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            ListNode popA = stackA.pop();
            ListNode popB = stackB.pop();
            if (popA == popB) {
                intersection = popA;
            } else {
                break;
            }
        }
        return intersection;
    }
}
