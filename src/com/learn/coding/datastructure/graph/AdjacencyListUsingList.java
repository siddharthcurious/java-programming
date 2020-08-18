package com.learn.coding.datastructure.graph;

import java.util.ArrayList;

class DirectedGraph {
    int nodes;
    private final ArrayList<ArrayList<Integer>> adjacencyList;

    public DirectedGraph(int nodes){
        this.nodes = nodes;
        adjacencyList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < nodes; i++){
            adjacencyList.add(new ArrayList<>());
        }

    }

    public void addEdge(int source, int dest){
        adjacencyList.get(source).add(dest);
    }

    public ArrayList<ArrayList<Integer>> getAdjacencyList(){
        return this.adjacencyList;
    }
}

public class AdjacencyListUsingList {

    public static void main(String[] args) {

        DirectedGraph directedGraph = new DirectedGraph(8);
        directedGraph.addEdge(0, 1);
        directedGraph.addEdge(0, 2);
        directedGraph.addEdge(2, 3);
        directedGraph.addEdge(2, 4);
        directedGraph.addEdge(3, 5);
        directedGraph.addEdge(3, 6);
        directedGraph.addEdge(0, 7);
        directedGraph.addEdge(7, 6);
        directedGraph.addEdge(6, 2);

        System.out.println(directedGraph.getAdjacencyList());
    }
}
