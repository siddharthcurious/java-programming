package com.learn.coding.datastructure.graph;

import java.util.*;

class Graph {

    private final Map<Integer, Set<Integer>> adjacencyList;

    public Graph(){
        this.adjacencyList = new HashMap<>();
    }

    public void addEdge(int source, int dest){
        if(adjacencyList.containsKey(source)){
            adjacencyList.get(source).add(dest);
        }
        else {
            adjacencyList.put(source, new HashSet<>(Collections.singletonList(dest)));
        }
    }

    public Map<Integer, Set<Integer>> getAdjacencyList(){
        return this.adjacencyList;
    }
}

public class AdjacencyListHashMapMain {
    public static void main(String[] args) {

        // Using Hash Map and Set

        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(4, 3);
        graph.addEdge(3, 2);
        graph.addEdge(3, 1);
        graph.addEdge(2, 5);

        Map<Integer, Set<Integer>> adjacencyList = graph.getAdjacencyList();

        System.out.println(adjacencyList);
    }
}
