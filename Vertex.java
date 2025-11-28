package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Vertex implements Comparable<Vertex> {

    public String name;

    //The array of alle outEdges
    public ArrayList<Edge> outEdges;

    //Makes it possible to get max value in distance
    public Integer distance = Integer.MAX_VALUE;

    //Variables that makes it possible to store edges
    Vertex PrevVertex  = null;
    boolean IsInQueue       = false;

    public Vertex(String area) {
        this.name = area;
        outEdges = new ArrayList<Edge>();
    }


    public String toString(){ return name;}


    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void addOutEdge(Edge newEdge) {
        outEdges.add(newEdge);
    }



    @Override
    public int compareTo(Vertex o) {
        if (this.distance < o.distance) {
            return -1;
        }
        if (this.distance > o.distance) {
            return 1;
        }
        return 0;
    }
}