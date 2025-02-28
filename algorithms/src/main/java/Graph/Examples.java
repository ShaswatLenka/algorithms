package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Examples {
    Node<Integer> node1 = new Node<>(1);
    Node<Integer> node2 = new Node<>(2);
    Node<Integer> node3 = new Node<>(3);
    Node<Integer> node4 = new Node<>(4);
    private void createUndirectedGraph() {
        Map<Node<Integer>, ArrayList<Node<Integer>>> adjList = new HashMap<>();
        Graph<Integer> g = new Graph<Integer>(adjList, false);

        // Create Nodes
        g.addEdge(node1, node2);
        g.addEdge(node1, node3);
        g.addEdge(node1, node4);
        g.addEdge(node3, node4);

        g.printGraph();
    }

    private void createDirectedGraph() {
        Map<Node<Integer>, ArrayList<Node<Integer>>> adjList = new HashMap<>();
        Graph<Integer> g = new Graph<Integer>(adjList, true);

        g.addEdge(node1, node2);
        g.addEdge(node1, node3);
        g.addEdge(node1, node4);
        g.addEdge(node3, node4);

        g.printGraph();
    }
    public void main(String[] args) {
       createUndirectedGraph();
       createDirectedGraph();
    }
}
