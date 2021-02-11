package com.gdrt.binaryTree.bst;

import com.gdrt.binaryTree.TreeNode;

import java.util.Stack;

public class BinarySearchTreeToGreaterSumTree {

    private Stack<TreeNode> stack;

    public TreeNode convertBST(TreeNode root) {

        int sum = 0;
        stack = new Stack<>();

        addUntilRightmost(root);
        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();
            sum += top.val;
            top.val = sum;

            addUntilRightmost(top.left);
        }
        return root;
    }

    private void addUntilRightmost(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.right;
        }
    }
}
