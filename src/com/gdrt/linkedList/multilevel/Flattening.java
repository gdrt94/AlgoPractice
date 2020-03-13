package com.gdrt.linkedList.multilevel;

import com.gdrt.linkedList.Node;

import java.util.Stack;

public class Flattening {

    public Node flatten(Node head) {

        Node current = head;
        Node prev = null;
        Stack<Node> stack = new Stack<>();

        while (current != null || !stack.isEmpty()) {

            if (current == null) {
                current = stack.pop();
                prev.next = current;
                current.prev = prev;
            }

            if (current.child != null) {
                if (current.next != null) {
                    stack.push(current.next);
                }
                current.next = current.child;
                current.child.prev = current;
                current.child = null;
            }
            prev = current;
            current = current.next;
        }
        return head;
    }
}
