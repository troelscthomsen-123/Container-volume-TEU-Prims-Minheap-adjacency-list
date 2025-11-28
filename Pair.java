package com.company;

public class Pair implements Comparable<Pair> {
    Integer distance;
    Integer index;

    //Pairs up all indexes/vertices and their distance
    public Pair(Integer distance, Integer index) {
        this.distance = distance;
        this.index = index;
    }


    //Makes it possible to compare all vertices and their distance, so the shortest path can be found
    @Override
    public int compareTo(Pair pair) {
        return this.distance.compareTo(pair.distance);
    }
}