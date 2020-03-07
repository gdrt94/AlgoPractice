package com.gdrt.binaryTree.preorder;

import com.gdrt.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionRecursive {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        preorder(root);
        return list;
    }

    void preorder(TreeNode root) {
        if(root != null) {
            list.add(root.val); // simply change the order of lines depending on traversal type (pre-/in-/post-order)
            preorder(root.left);
            preorder(root.right);
        }
    }
}