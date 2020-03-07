package com.gdrt.binaryTree.inorder;

import com.gdrt.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Serialization {

    public String serialize(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        doSerialization(root, list);
        return list.toString();
    }

    void doSerialization(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(null);
            return;
        }
        list.add(root.val);
        doSerialization(root.left, list);
        doSerialization(root.right, list);
    }

    public TreeNode deserialize(String data) {
        if (data == null)
            return null;
        data = data.substring(1, data.length() - 1);
        String[] dataStr = data.split(", ");
        int[] index = {0};
        return doDeserialization(dataStr, index);
    }

    TreeNode doDeserialization (String[] data, int[] index) {
        if (data[index[0]].equals("null"))
            return null;
        TreeNode node = new TreeNode(Integer.parseInt(data[index[0]]));
        index[0]++;
        node.left = doDeserialization(data, index);
        index[0]++;
        node.right = doDeserialization(data, index);
        return node;
    }
}
