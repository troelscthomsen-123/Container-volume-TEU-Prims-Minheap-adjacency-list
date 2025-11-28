package com.company;

public class Edge {

    Vertex from;
    Vertex to;
    Integer weight;

    public Edge(Vertex from, Vertex to, Integer weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
        this.from.addOutEdge(this);
    }

    //Converts the value giving to it and makes it a string value
    public String toString(){ return from+"->"+to+"::"+weight;}


    public Vertex getFromVertex() {
        return from;
    }

    public Vertex getToVertex() {
        return to;
    }

    public Integer getWeight() {
        return weight;
    }
}