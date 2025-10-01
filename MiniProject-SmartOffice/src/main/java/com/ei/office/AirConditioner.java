package com.ei.office;
public class AirConditioner extends Device {
    public AirConditioner(String id){ super(id); }
    @Override public void turnOn(){ isOn=true; System.out.println("AC " + id + " on"); }
    @Override public void turnOff(){ isOn=false; System.out.println("AC " + id + " off"); }
    @Override public String getStatus(){ return "AC "+id+" is "+(isOn?"on":"off"); }
}
