package com.gdrt.binaryTree.topdown;

import com.gdrt.binaryTree.TreeNode;

public class SymmetryProblem {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return areEqual(root.left, root.right);
    }

    boolean areEqual(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;
        return areEqual(left.left, right.right) && areEqual(left.right, right.left);
    }
}
