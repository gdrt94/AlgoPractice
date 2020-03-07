package com.gdrt.linkedList.design;

public class MyLinkedList {

    class Node {
        int val;
        Node next;
        public Node(int x) {
            val = x;
        }
    }
    private Node head;
    private int size = 0;

    /** Initialize your data structure here. */
    public MyLinkedList() {
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {

        if (index >= size)
            return -1;

        int i = 0;
        Node current = head;
        while (i++ < index) {
            current = current.next;
        }
        return current.val;
    }

    /** Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        size++;
        if (head == null) {
            head = node;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    /** Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        int i = 1;
        Node prev = head;
        Node current = head.next;
        while (i++ < index) {
            prev = current;
            current = current.next;
        }
        Node inserted = new Node(val);
        inserted.next = current;
        prev.next = inserted;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

        if (index >= size) {
            return;
        }
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        int i = 1;
        Node prev = head;
        Node current = head.next;
        while (i++ < index) {
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
    }
}
