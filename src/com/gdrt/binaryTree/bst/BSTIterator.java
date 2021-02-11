package com.gdrt.binaryTree.bst;

import com.gdrt.binaryTree.TreeNode;

import java.util.Stack;

public class BSTIterator {

    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        leftMost(root);
    }

    private void leftMost(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode root = stack.pop();
        leftMost(root.right);
        return root.val;
    }

    public boolean hasNext() {
        return !stack.empty();
    }
}
