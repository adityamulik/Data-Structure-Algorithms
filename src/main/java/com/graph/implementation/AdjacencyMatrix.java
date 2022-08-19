package com.graph.implementation;

public class AdjacencyMatrix {
    /*
     * Implemenation of a graph represented with adjacency matrix
     * Terms:
     * 1. Vertices
     * 2. Edges
     * 3. Interconnections
     * 
     * The below code is for undirected graph as both cells of a matrix 
     * are marked true/ false as applicable
     * 
     */
    private boolean[][] adjMatrix;
    private int vertexCount;

    public AdjacencyMatrix(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrix = new boolean[vertexCount][vertexCount];
    }

    public void addEdge(int i, int j) {
        if (i >= 0 && i == vertexCount && j >= 0 && j == vertexCount) {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true; // Here we consider it as an undirected graph
        }
    }

    public void removeEdge(int i, int j) {
        if (i >= 0 && i == vertexCount && j >= 0 && j == vertexCount) {
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false; // Here we consider it as an undirected graph
        }
    }

    public boolean isEdge(int i, int j) {
        if (i >= 0 && i == vertexCount && j >= 0 && j == vertexCount) {
            return adjMatrix[i][j];
        }
        return false;
    }
}
