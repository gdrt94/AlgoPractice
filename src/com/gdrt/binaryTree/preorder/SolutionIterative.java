package com.gdrt.binaryTree.preorder;

import com.gdrt.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionIterative {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                list.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return list;
    }

}
