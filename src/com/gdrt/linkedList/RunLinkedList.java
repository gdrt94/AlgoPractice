package com.gdrt.linkedList;

import com.gdrt.linkedList.classic.OddEven;
import com.gdrt.linkedList.classic.Palindrome;
import com.gdrt.linkedList.classic.Removal;
import com.gdrt.linkedList.classic.Reverse;
import com.gdrt.linkedList.design.MyLinkedList;
import com.gdrt.linkedList.multilevel.DeepCopy;
import com.gdrt.linkedList.twoLists.Addition;
import com.gdrt.linkedList.twoLists.Merge;
import com.gdrt.linkedList.twoPointer.Delay;
import com.gdrt.linkedList.twoPointer.Rotation;

import java.util.Stack;

public class RunLinkedList {
    public static void main(String[] args) {
//        design();
//        delay();
//        reverse();
//        removal();
//        oddEven();
//        palindrome();
//        merge();
//        add();
//        deepCopy();
        rotation();
    }

    static void design() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(7);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtIndex(3, 0);
        list.deleteAtIndex(2);
        list.addAtHead(6);
        list.addAtTail(4);
        System.out.println(list.get(4)); //should output 4
        list.addAtHead(4);
        list.addAtIndex(5, 0);
        list.addAtHead(6);

    }
    static void delay() {
        Delay delay = new Delay();
        ListNode node = new ListNode(1);
        delay.removeNthFromEnd(node, 1);

    }
    static void reverse() {
        Reverse rev = new Reverse();
        ListNode a = new ListNode(1);
//        a.next = new ListNode(2);
//        a.next.next = new ListNode(3);
//        a.next.next.next = new ListNode(4);
        rev.reverseList(a);
    }
    static void removal() {
        Removal r = new Removal();
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(1);
        a.next.next.next = new ListNode(4);
        ListNode removed = r.removeElements(a, 1);
        while (removed != null) {
            System.out.println(removed.val);
            removed = removed.next;
        }
    }
    static void oddEven() {
        OddEven r = new OddEven();
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(5);
        a.next.next.next.next.next = new ListNode(6);
        a.next.next.next.next.next.next = new ListNode(7);
//        a.next.next.next.next.next.next.next = new ListNode(8);
        ListNode news = r.oddEvenList(a);
        while (news != null) {
            System.out.println(news.val);
            news = news.next;
        }

    }
    static void palindrome() {
        ListNode a = new ListNode(13);
        a.next = new ListNode(13);
        a.next.next = new ListNode(13);
//        a.next.next.next = new ListNode(4);
//        a.next.next.next.next = new ListNode(5);
//        a.next.next.next.next.next = new ListNode(3);
//        a.next.next.next.next.next.next = new ListNode(2);
//        a.next.next.next.next.next.next.next = new ListNode(1);
        Palindrome p = new Palindrome();
        System.out.println(
                p.isPalindrome(a))
        ;
    }
    static void merge() {
        Merge m = new Merge();
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(12);
        n1.next.next = new ListNode(134);
        n1.next.next.next = new ListNode(2222);
        n1.next.next.next.next = new ListNode(4545);

        ListNode n2 = new ListNode(0);
        n2.next = new ListNode(5);
        n2.next.next = new ListNode(79);
        n2.next.next.next = new ListNode(4545);
        n2.next.next.next.next = new ListNode(5555);
        n2.next.next.next.next.next = new ListNode(5557);

        ListNode res = m.mergeTwoLists(n1, n2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
    static void add() {
        Addition addition = new Addition();
        ListNode first = new ListNode(5);
        first.next = new ListNode(7);
        first.next.next = new ListNode(9);

        ListNode second = new ListNode(5);
        second.next = new ListNode(5);
        second.next.next = new ListNode(1);
        second.next.next.next = new ListNode(6);

        ListNode res = addition.addTwoNumbers(null, second);
        Stack<ListNode> s = new Stack<>();
        while (res != null) {
            s.push(res);
            res = res.next;
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop().val);
        }
        // 976 + 6153 = 7129
    }
    static void deepCopy() {

        // [[7,null],[13,0],[11,4],[10,2],[1,0]]
        NodeWithRandomNode n0 = new NodeWithRandomNode(7);
        NodeWithRandomNode n1 = new NodeWithRandomNode(13);
        NodeWithRandomNode n2 = new NodeWithRandomNode(11);
        NodeWithRandomNode n3 = new NodeWithRandomNode(10);
        NodeWithRandomNode n4 = new NodeWithRandomNode(1);
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n1.random = n0;
        n2.random = n4;
        n3.random = n2;
        n4.random = n0;

        DeepCopy deep = new DeepCopy();
        NodeWithRandomNode copy = deep.copyRandomList(n0);
        while (copy != null) {
            System.out.println(copy.val + " " + (copy.random == null ? null : copy.random.val));
            copy = copy.next;
        }
    }
    static void rotation() {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);
        n1.next.next.next = new ListNode(4);
        n1.next.next.next.next = new ListNode(5);
        Rotation r = new Rotation();
        ListNode copy = r.rotateRight(null, 0);

        while (copy != null) {
            System.out.println(copy.val);
            copy = copy.next;
        }
    }
}
