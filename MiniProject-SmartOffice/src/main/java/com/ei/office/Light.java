package com.ei.office;
public class Light extends Device {
    public Light(String id){ super(id); }
    @Override public void turnOn(){ isOn=true; System.out.println("Light " + id + " on"); }
    @Override public void turnOff(){ isOn=false; System.out.println("Light " + id + " off"); }
    @Override public String getStatus(){ return "Light "+id+" is "+(isOn?"on":"off"); }
}
