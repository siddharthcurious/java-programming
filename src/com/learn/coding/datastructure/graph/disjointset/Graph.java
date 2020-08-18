package com.learn.coding.datastructure.graph.disjointset;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    int V, E;
    List<Edge> edges = new ArrayList<>();

    static class Edge {
        int source;
        int dest;
    }

    Graph(int V, int E) {
        this.V = V;
        this.E = E;
        for (int i = 0; i < E; ++i) {
            edges.add(new Edge());
        }
    }
}
