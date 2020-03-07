package com.gdrt.binaryTree.postorder;

import com.gdrt.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionIterative {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        if (root == null)
            return list;

        s1.push(root);
        while (!s1.isEmpty()) {
            TreeNode node = s1.pop();
            s2.push(node);
            if (node.left != null)
                s1.push(node.left);
            if (node.right != null)
                s1.push(node.right);
        }

        while (!s2.isEmpty()) {
            list.add(s2.pop().val);
        }
        return list;
    }
}
