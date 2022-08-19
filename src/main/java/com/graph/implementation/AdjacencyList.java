package com.graph.implementation;

import java.util.ArrayList;
import java.util.List;

import com.linkedlists.implementation.SinglyLinkedList;

public class AdjacencyList {
    /*
     * Adjacency List representation is used with an int data and
     * it's associated edges made up of a SinglyLinkedList Array
     */
    private List<Integer> vertices;
    private SinglyLinkedList[] edges;
    private int vertexCount;

    public AdjacencyList(int vertexCount) {
        this.vertexCount = vertexCount;
        this.vertices = new ArrayList<>();
        this.edges = new SinglyLinkedList[vertexCount];
        for (int i=0; i<vertices.size(); i++) {
            vertices.add(i);
            edges[i] = new SinglyLinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        int i = vertices.indexOf(source);
        int j = vertices.indexOf(destination);

        if (i != -1 || j != -1) {
            edges[i].insertAtBeginning(destination);
            edges[i].insertAtBeginning(source);
        }
    }
}
