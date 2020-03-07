package com.gdrt.binaryTree;

import com.gdrt.binaryTree.construction.FromInAndPostOrder;
import com.gdrt.binaryTree.inorder.Serialization;
import com.gdrt.binaryTree.levelorder.NextRightPointerImperfect;
import com.gdrt.binaryTree.bottomup.LowestCommonAncestor;
import com.gdrt.binaryTree.topdown.PathSum;
import com.gdrt.binaryTree.topdown.SymmetryRecursive;

public class RunBinaryTree {

    public static void main(String[] args) {
//        symmetry();
//        pathSum();
//        buildTree();
//        buildTreePre();
//        nextRightPointerII();
//        LCA();
//        serialize();
//        deSerialize();
    }

    static void symmetry() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(3);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        SymmetryRecursive recursive = new SymmetryRecursive();
        System.out.println(recursive.isSymmetric(t1));
    }

    static void pathSum() {

        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);

        PathSum p = new PathSum();
        System.out.println(p.hasPathSum(t1, 1));
    }

    static void buildTree() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t8 = new TreeNode(8);
        TreeNode t5 = new TreeNode(5);
        TreeNode t4 = new TreeNode(4);
        TreeNode t14 = new TreeNode(14);
        TreeNode t18 = new TreeNode(18);
        TreeNode t7 = new TreeNode(7);
        TreeNode t2 = new TreeNode(2);

        t1.left = t8;
        t1.right = t5;
        t8.left = t4;
        t8.right = t14;
        t5.right = t18;
        t14.left = t7;
        t14.right = t2;

        FromInAndPostOrder from = new FromInAndPostOrder();
        int in[] = {4,8,7,14,2,1,5,18};
        int post[] = {4,7,2,14,8,18,5,1};
        TreeNode node = from.buildTree(in, post);
        System.out.println(node);
    }

    static void buildTreePre() {
        FromInAndPostOrder from = new FromInAndPostOrder();
        int pre[] = {3,9,20,15,7};



        int in[] = {9,3,15,20,7};
        // pos[] = {7,15,20,9,3}
        TreeNode node = from.buildTree(pre, in);
        System.out.println(node);
    }

    static void nextRightPointerII() {
        Node n = new Node(1);
        n.left = new Node(2);
        n.right = new Node(3);
        n.left.left = new Node(4);
        n.left.right = new Node(5);
        n.right.right = new Node(7);

        NextRightPointerImperfect next = new NextRightPointerImperfect();
        n = next.connect(n);
        System.out.println(n);
    }

    static void LCA() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n7 = new TreeNode(7);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n7;
        n5.left = n10;
        n5.right = n11;

        LowestCommonAncestor lca = new LowestCommonAncestor();
        TreeNode n = lca.lowestCommonAncestor(n1, n7, n3);
        System.out.println(n.val);
    }

    static void serialize() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n7 = new TreeNode(7);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n7;
        n5.left = n10;
        n5.right = n11;

        Serialization ser = new Serialization();
        System.out.println(ser.serialize(n1));
    }

    static void deSerialize() {
        String data = "[1, 2, 4, null, null, 5, 10, null, null, 11, null, null, 3, null, 7, null, null]";
        Serialization ser = new Serialization();
        TreeNode root = ser.deserialize(data);
        System.out.println(root.val);
    }

}
