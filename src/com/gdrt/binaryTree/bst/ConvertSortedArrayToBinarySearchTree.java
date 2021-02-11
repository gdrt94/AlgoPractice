package com.gdrt.binaryTree.bst;

import com.gdrt.binaryTree.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null)
            return null;
        return subtree(nums, 0, nums.length - 1);
    }

    private TreeNode subtree(int[] nums, int min, int max) {
        if (min > max)
            return null;
        int i = min + (max - min)/2;
        TreeNode root = new TreeNode(nums[i]);
        root.left = subtree(nums, min, i - 1);
        root.right = subtree(nums, i + 1, max);
        return root;
    }
}
