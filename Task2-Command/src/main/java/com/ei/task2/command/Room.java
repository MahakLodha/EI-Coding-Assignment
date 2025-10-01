package com.ei.task2.command;
public class Room { private final String id; private boolean booked=false; public Room(String id){this.id=id;} public String getId(){return id;} public boolean isBooked(){return booked;} public void setBooked(boolean b){booked=b;} }
