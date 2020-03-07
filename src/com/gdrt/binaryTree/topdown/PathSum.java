package com.gdrt.binaryTree.topdown;

import com.gdrt.binaryTree.TreeNode;

public class PathSum {

    int S;
    public boolean hasPathSum(TreeNode root, int sum) {

        S = sum;
        return isSum(root, 0);
    }

    boolean isSum(TreeNode root, int currentSum) {

        if (root == null)
            return false;
        currentSum += root.val;
        if (root.left == null && root.right == null && currentSum == S)
            return true;
        return isSum(root.left, currentSum) || isSum(root.right, currentSum);
    }
}
