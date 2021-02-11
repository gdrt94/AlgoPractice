package com.gdrt.binaryTree.bst;

import com.gdrt.binaryTree.TreeNode;

public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val)
                return root;
            if (root.val > val)
                root = root.left;
            else
                root = root.right;
        }
        return null;
    }
}
