package com.ei.office;
public abstract class Device {
    protected final String id; protected boolean isOn=false;
    public Device(String id){ this.id=id; }
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract String getStatus();
    public String getId(){ return id; }
    public boolean isOn(){ return isOn; }
}
