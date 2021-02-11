package com.gdrt.binaryTree.bst;

import com.gdrt.binaryTree.TreeNode;

import java.util.Stack;

public class ValidateBinarySearchTree {

//    iterativeInorder(node)
//        s ← empty stack
//        while (not s.isEmpty() or node ≠ null)
//            if (node ≠ null)
//                s.push(node)
//                node ← node.left
//            else
//                node ← s.pop()
//                visit(node)
//                node ← node.right

    public boolean isValidBST(TreeNode root) {

        long prev = Long.MIN_VALUE;
        Stack<TreeNode> s = new Stack<>();

        while (!s.empty() || root != null) {
            if (root != null) {
                s.push(root);
                root = root.left;
            } else {
                root = s.pop();
                if (root.val <= prev)
                    return false;
                prev = root.val;
                root = root.right;
            }
        }
        return true;
    }

    //    faster solution
    public boolean validate(TreeNode root, Integer low, Integer high) {
        // Empty trees are valid BSTs.
        if (root == null) {
            return true;
        }
        // The current node's value must be between low and high.
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }
        // The left and right subtree must also be valid.
        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }

    public boolean isValidBSTFaster(TreeNode root) {
        return validate(root, null, null);
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree v = new ValidateBinarySearchTree();
        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(4);
        TreeNode a3 = new TreeNode(6);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(7);
        a1.left = a2;
        a1.right = a3;
        a3.left = a4;
        a3.right = a5;
        System.out.println(v.isValidBST(a1));
    }
}
