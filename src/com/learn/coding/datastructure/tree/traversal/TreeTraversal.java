package com.learn.coding.datastructure.tree.traversal;

import com.learn.coding.datastructure.tree.common.TreeNode;

import java.util.Stack;

class Traversal {

    public void preorderOther(TreeNode root){
        if(root == null) return;

        Stack<TreeNode> stack = new Stack<>();

        while(true){
            while(root != null){
                System.out.print(root.val+"->");
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty()){
                break;
            }
            root = stack.pop();
            root = root.right;
        }
        System.out.print("null");
    }

    public void preorder(TreeNode root){
        if(root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.empty()){

            TreeNode node = stack.pop();
            System.out.print(node.val+"->");

            if(node.left != null){
                stack.push(node.left);
            }

            if(node.right != null){
                stack.push(node.right);
            }
        }
        System.out.print("null");
    }
}

public class TreeTraversal {

    public static void main(String[] args) {

        Traversal traversal = new Traversal();

        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(15);
        root.left.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.right = new TreeNode(17);

        // traversal.preorder(root);

        traversal.preorderOther(root);
    }
}
