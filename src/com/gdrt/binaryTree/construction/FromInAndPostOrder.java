package com.gdrt.binaryTree.construction;

import com.gdrt.binaryTree.TreeNode;

import java.util.HashMap;

public class FromInAndPostOrder {

    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder == null)
            return null;
        int half = preorder.length / 2;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
            if(i < half) {
                int temp = preorder[i];
                preorder[i] = preorder[preorder.length - 1 - i];
                preorder[preorder.length - 1 - i] = temp;
            }
        }
        return build(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }

    public TreeNode build(int[] in, int[] post, int inBegin, int inEnd, int postBegin, int postEnd) {

        if (inBegin > inEnd || postBegin > postEnd)
            return null;
        int rootIndex = map.get(post[postEnd]);
        TreeNode root = new TreeNode(post[postEnd]);
        int leftLength = rootIndex - inBegin;

        TreeNode left = build(in, post, inBegin, rootIndex - 1, postBegin, postBegin + leftLength - 1);
        TreeNode right = build(in, post, rootIndex + 1, inEnd, postBegin + leftLength, postEnd - 1);
        root.left = left;
        root.right = right;
        return root;
    }


//    HashMap<Integer, Integer> map = new HashMap<>();
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        if (inorder == null)
//            return null;
//        for (int i = 0; i < inorder.length; i++) {
//            map.put(inorder[i], i);
//        }
//        return build(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
//    }
//
//    public TreeNode build(int[] in, int[] post, int inBegin, int inEnd, int postBegin, int postEnd) {
//
//        if (inBegin > inEnd || postBegin > postEnd)
//            return null;
//        int rootIndex = map.get(post[postEnd]);
//        TreeNode root = new TreeNode(post[postEnd]);
//        int leftLength = rootIndex - inBegin;
//
//        TreeNode left = build(in, post, inBegin, rootIndex - 1, postBegin, postBegin + leftLength - 1);
//        TreeNode right = build(in, post, rootIndex + 1, inEnd, postBegin + leftLength, postEnd - 1);
//        root.left = left;
//        root.right = right;
//        return root;
//    }
}
