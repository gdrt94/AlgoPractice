package com.gdrt.binaryTree.bottomup;

import com.gdrt.binaryTree.TreeNode;

import java.util.Stack;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> pPath = new Stack<>();
        Stack<TreeNode> qPath = new Stack<>();
        buildPath(root, p, pPath);
        buildPath(root, q, qPath);

        TreeNode pNode = null;
        TreeNode qNode = null;
        TreeNode LCA = null;
        while (pNode == qNode) {
            LCA = pNode;
            if (pPath.isEmpty() || qPath.isEmpty())
                break;
            pNode = pPath.pop();
            qNode = qPath.pop();
        }
        return LCA;
    }

    boolean buildPath(TreeNode node, TreeNode target, Stack<TreeNode> path) {
        if (node == null) {
            return false;
        }
        if (node.val == target.val || buildPath(node.left, target, path) || buildPath(node.right, target, path)) {
            path.push(node);
            return true;
        }
        return false;
    }
}
