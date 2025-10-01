package com.ei.task4.builder;
public class RoomConfigBuilder { private String name=""; private int capacity=1; private boolean hasProjector=false; private int floor=0;
    public RoomConfigBuilder setName(String n){ this.name=n; return this; } public RoomConfigBuilder setCapacity(int c){ this.capacity=c; return this; } public RoomConfigBuilder setHasProjector(boolean p){ this.hasProjector=p; return this; } public RoomConfigBuilder setFloor(int f){ this.floor=f; return this; }
    public RoomConfiguration build(){ if(capacity<=0) throw new IllegalArgumentException("capacity"); return new RoomConfiguration(name,capacity,hasProjector,floor); } }
