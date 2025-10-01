package com.ei.task4.builder;
public final class RoomConfiguration { private final String name; private final int capacity; private final boolean hasProjector; private final int floor;
    public RoomConfiguration(String name,int capacity,boolean hasProjector,int floor){ this.name=name; this.capacity=capacity; this.hasProjector=hasProjector; this.floor=floor; }
    public String getName(){return name;} public int getCapacity(){return capacity;} public boolean hasProjector(){return hasProjector;} public int getFloor(){return floor;} }
