package com.company;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Adjacencylist {

    public ArrayList<Vertex> vertices;

    // List of vertices
    public Adjacencylist() {
        vertices = new ArrayList<Vertex>();
    }

    //Makes it possible to add vertices to list
    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void newEdge(Vertex from, Vertex to, Integer weight) {
        if (!(vertices.contains(from) && vertices.contains(to))) {
            System.out.println("Vertex does not exist");
            return;
        }
        // both variables below could be used to create undirected edges between vertices and implementing their weight
        Edge newEdge = new Edge(from, to, weight);
        Edge newEdgeReverse = new Edge(to, from, weight);
    }
    //Prints the output
    public void printDijk() {
        for(int i=0;i<vertices.size();i++){
            System.out.println(" Vertex "+vertices.get(i).name+" is connecte to: ");
            Vertex current=vertices.get(i);
            for (Edge e: current.outEdges) {
                System.out.println(e.to.name +" with weight: "+e.weight);
            }

        }
    }
}