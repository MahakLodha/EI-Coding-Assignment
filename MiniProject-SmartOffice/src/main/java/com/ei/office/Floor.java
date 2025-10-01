package com.ei.office;
import java.util.ArrayList; import java.util.List;
public class Floor {
    private final String name; private final List<Room> rooms=new ArrayList<>();
    public Floor(String name){ this.name=name; }
    public void addRoom(Room r){ rooms.add(r); }
    public java.util.List<Room> getRooms(){ return rooms; }
    public String getName(){ return name; }
}
