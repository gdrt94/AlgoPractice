package com.gdrt.binaryTree.levelorder;

import com.gdrt.binaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightPointer {

    Queue<Node> q;

    public Node connect(Node root) {

        if (root == null)
            return null;

        q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.left != null) {
                node.left.next = node.right;
                if (node.next != null) {
                    node.right.next = node.next.left;
                }
                q.add(node.left);
                q.add(node.right);
            }
        }
        return root;
    }
}
