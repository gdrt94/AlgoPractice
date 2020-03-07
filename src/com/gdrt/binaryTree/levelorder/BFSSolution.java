package com.gdrt.binaryTree.levelorder;

import com.gdrt.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSSolution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> level = new LinkedList<>();

        if (root == null)
            return list;

        queue.add(root);
        level.add(0);
        int currentLevel = -1;

        while (!queue.isEmpty()) {


            TreeNode node = queue.poll();
            Integer nodeLevel = level.poll();

            if (nodeLevel != currentLevel) {
                currentLevel = nodeLevel;
                List<Integer> innerList = new ArrayList<>();
                innerList.add(node.val);
                list.add(innerList);
            } else {
                list.get(nodeLevel).add(node.val);
            }

            if (node.left != null) {
                queue.add(node.left);
                level.add(nodeLevel+1);
            }
            if (node.right != null) {
                queue.add(node.right);
                level.add(nodeLevel+1);
            }
        }
        return list;
    }
}
