package com.company;

public class NeighNeigh implements Horse {
    private String name;
    private int weight;

    public NeighNeigh (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName () {
        return this.name;
    }

    @Override
    public int getWeight () {
        return this.weight;
    }
    public String getHorse () {return "NeighNeigh";}
}