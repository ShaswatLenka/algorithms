package Graph;

import java.util.ArrayList;
import java.util.Map;

public class Graph<T> {
    private Map<Node<T>, ArrayList<Node<T>>> adjList;
    private final boolean directed;

    public Graph(Map<Node<T>, ArrayList<Node<T>>> adjList, boolean directed) {
        this.adjList = adjList;
        this.directed = directed;
    }

    protected void addEdge(Node<T> v1, Node<T> v2) {
        // check if v1 exists and add v2 to v1's list
        if (!adjList.containsKey(v1)) {
            adjList.put(v1, new ArrayList<>());
        }
        adjList.get(v1).add(v2);

        // for undirected graph add v1 to v2's list
        if (!directed) {
            if (!adjList.containsKey(v2)) {
                adjList.put(v2, new ArrayList<>());
            }
            adjList.get(v2).add(v1);
        }
    }

    protected void printGraph() {
        for (var entry: adjList.entrySet()) {
            Node<T> vertex = entry.getKey();
            ArrayList<Node<T>> neighbors = entry.getValue();
            System.out.print("Vertex" + vertex.getValue() + " -> " );
            for (Node<T> nbr: neighbors) {
                System.out.print(nbr.getValue() + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
