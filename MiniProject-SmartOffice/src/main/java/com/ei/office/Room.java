package com.ei.office;
import java.util.ArrayList; import java.util.List;
public class Room {
    private final String name; private final List<Device> devices = new ArrayList<>();
    public Room(String name){ this.name=name; }
    public void addDevice(Device d){ devices.add(d); }
    public void turnOnAllDevices(){ for(Device d: devices) d.turnOn(); }
    public void turnOffAllDevices(){ for(Device d: devices) d.turnOff(); }
    public java.util.List<Device> getDevices(){ return devices; }
    public String getName(){ return name; }
    public String getStatus(){ StringBuilder sb=new StringBuilder(); for(Device d: devices) sb.append(d.getStatus()).append("\n"); return sb.toString(); }
}
