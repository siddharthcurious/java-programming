package com.learn.coding.datastructure.graph;

class AdjacencyMatrix {

    private final int vertices;
    private final int [][] matrix;

    public AdjacencyMatrix(int vertices){
        this.vertices = vertices;
        matrix = new int[this.vertices][this.vertices];
    }

    public void addEdge(int source, int dest){
        matrix[source][dest] = 1;
    }

    public int [][] getMatrix(){
        return this.matrix;
    }

    public int getVertices(){
        return this.vertices;
    }

}

public class AdjacencyMatrixMain {

    public static void main(String[] args) {
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(8);

        adjacencyMatrix.addEdge(1,2);
        adjacencyMatrix.addEdge(1,3);
        adjacencyMatrix.addEdge(0,7);
        adjacencyMatrix.addEdge(5,6);
        adjacencyMatrix.addEdge(6,7);
        adjacencyMatrix.addEdge(3,2);
        adjacencyMatrix.addEdge(4,5);
        adjacencyMatrix.addEdge(2,4);

        int [][] matrix = adjacencyMatrix.getMatrix();

        for(int i=0; i<adjacencyMatrix.getVertices(); i++){
            for(int j=0; j<adjacencyMatrix.getVertices(); j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
