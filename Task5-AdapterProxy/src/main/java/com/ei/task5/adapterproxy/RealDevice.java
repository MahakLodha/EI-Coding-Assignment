package com.ei.task5.adapterproxy;
public class RealDevice implements Device { private final String id; private boolean on=false; public RealDevice(String id){ this.id=id; } @Override public void turnOn(){ on=true; System.out.println(id+" on"); } @Override public void turnOff(){ on=false; System.out.println(id+" off"); } @Override public String id(){ return id; } }
