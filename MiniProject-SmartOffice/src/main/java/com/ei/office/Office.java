package com.ei.office;
import java.util.ArrayList; import java.util.List;
public class Office {
    private final String name; private final List<Floor> floors=new ArrayList<>();
    public Office(String name){ this.name=name; }
    public void addFloor(Floor f){ floors.add(f); }
    public java.util.List<Floor> getFloors(){ return floors; }
    public String getName(){ return name; }
}
