package com.learn.coding.datastructure.graph.shortestpath;

class ShortestPath {

    public void printMatrix(int [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int[] ints : matrix) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void getShortedPath(int [][]matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        //Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
    }
}

public class ShortedPathInMatrixMain {
    public static void main(String[] args) {

        int [][] matrix = {
                {1, 1, 0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 1, 1, 1, 0},
                {1, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 1},
                {0, 0, 0, 1, 1, 1, 1}
        };

        ShortestPath shortestPath = new ShortestPath();

        shortestPath.printMatrix(matrix);
        shortestPath.getShortedPath(matrix);
        shortestPath.printMatrix(matrix);
    }
}
