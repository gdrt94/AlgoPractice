package com.gdrt.binaryTree.levelorder;

import com.gdrt.binaryTree.Node;

import java.util.*;

public class NextRightPointerImperfect {

    Map<Integer, List<Node>> map = new HashMap<>();

    public Node connect(Node root) {

        if (root == null)
            return null;
        doLevel(root, 1);

        map.forEach((level, list) -> {
            for (int i = 0; i < list.size() - 1; i++) {
                list.get(i).next = list.get(i + 1);
            }
        });
        return root;
    }

    void doLevel(Node node, int level) {

        if (!map.containsKey(level)) {
            map.put(level, new ArrayList<>());
        }
        map.get(level).add(node);
        if (node.left != null) doLevel(node.left, level + 1);
        if (node.right != null) doLevel(node.right, level + 1);
    }
}
