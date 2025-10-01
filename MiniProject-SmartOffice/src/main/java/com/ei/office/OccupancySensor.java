package com.ei.office;
public class OccupancySensor extends Device {
    private boolean occupied=false;
    public OccupancySensor(String id){ super(id); }
    @Override public void turnOn(){ isOn=true; }
    @Override public void turnOff(){ isOn=false; }
    @Override public String getStatus(){ return "Sensor "+id+" occ="+occupied; }
    public void setOccupied(boolean occ){ occupied=occ; System.out.println("Sensor " + id + " occ="+occ); }
    public boolean isOccupied(){ return occupied; }
}
