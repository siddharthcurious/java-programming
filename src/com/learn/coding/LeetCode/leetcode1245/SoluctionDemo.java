package com.learn.coding.LeetCode.leetcode1245;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public int bfs(int [][]matrix, int source){
        boolean [] visited = new boolean[matrix.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        int cols = matrix.length;

        int level = 0;

        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int node = queue.poll();
                for(int j = 0; j < cols; j++){
                    if((matrix[node][j] == 1 || matrix[j][node] == 1) && !visited[j]){
                        queue.add(j);
                        visited[j] = true;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(visited));
        return level;
    }

    public int treeDiameter(int[][] edges) {

        int nodes = edges.length;
        int [][]matrix = new int [nodes+1][nodes+1];
        for(int [] edge: edges){
            int source = edge[0];
            int dest = edge[1];
            matrix[source][dest] = 1;
        }

        int level = 0;
        int max = 0;
        for(int i = 0; i < nodes+1; i++) {
            level = bfs(matrix, i);
            if (level > max) {
                max = level;
            }
        }
        return max;
    }
}

public class SoluctionDemo {

    public static void main(String[] args) {

        Solution solution = new Solution();

        //int [][]edges = {{0,1},{1,2},{2,3},{1,4},{4,5}};
        int [][]edges = {{0,1},{1,2},{0,3},{3,4},{2,5},{3,6}};
        int r = solution.treeDiameter(edges);
        System.out.println(r);
    }
}
