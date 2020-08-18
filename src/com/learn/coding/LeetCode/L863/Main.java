package com.learn.coding.LeetCode.L863;


import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }
}

class Solution {

    public void printTree(TreeNode root){
        if(root == null) return;
        else {
            this.printTree(root.left);
            System.out.print(root.val + " ");
            this.printTree(root.right);
        }
    }

    public void parentAnnotate(TreeNode root, HashMap<TreeNode, TreeNode> parent){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        parent.put(root, null);

        while(!q.isEmpty()){

            TreeNode temp = q.remove();

            if(temp.left != null) { parent.put(temp.left, temp); q.add(temp.left);}
            if(temp.right != null) { parent.put(temp.right, temp); q.add(temp.right);}
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {

        List<Integer> res = new LinkedList<>();

        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        parentAnnotate(root, parent);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(target);

        Set<TreeNode> visited = new HashSet<>();
        visited.add(target);
        int height = 0;

        while(!queue.isEmpty()){

            int size = queue.size();

            for(int i=0; i<size; i++) {

                TreeNode temp = queue.remove();

                if(height == K) res.add(temp.val);

                if(temp.left != null && !visited.contains(temp.left)) {
                    queue.add(temp.left);
                    visited.add(temp.left);
                }
                if(temp.right != null && !visited.contains(temp.right)) {
                    queue.add(temp.right);
                    visited.add(temp.right);
                }

                if(parent.containsKey(temp) && parent.get(temp) != null){
                    TreeNode pp = parent.get(temp);
                    if(!visited.contains(pp)){
                        queue.add(pp);
                        visited.add(pp);
                    }
                }
            }
            height++;
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeNode target = root.left;

        Solution sol = new Solution();

        List<Integer> res = sol.distanceK(root, target, 3);

        System.out.println(res);
    }
}
