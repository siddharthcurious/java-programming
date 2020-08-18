package com.learn.coding.datastructure.tree;

import com.learn.coding.datastructure.tree.common.TreeNode;

import static java.lang.Math.max;

class BinaryTree {

    int getHeight(TreeNode root){
        if(root == null ) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return max(leftHeight, rightHeight) + 1;
    }

    public int longestPath(TreeNode root){
        if(root == null) return 0;

        int leftHeight = this.getHeight(root.left);
        int rightHeight = this.getHeight(root.right);

        int leftLongestPath = this.longestPath(root.left);
        int rightLongestPath = this.longestPath(root.right);

        return max(leftHeight+rightHeight+1, max(leftLongestPath, rightLongestPath));
    }
}

public class LongestPathMain {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.left.right.left.left = new TreeNode(8);
        root.left.right.left.right = new TreeNode(9);
        root.left.left.left = new TreeNode(10);
        root.left.left.left.left = new TreeNode(11);
        root.left.left.left.left.left = new TreeNode(12);

        BinaryTree binaryTree = new BinaryTree();

        int longestPath = binaryTree.longestPath(root);

        System.out.println(longestPath);
    }
}

