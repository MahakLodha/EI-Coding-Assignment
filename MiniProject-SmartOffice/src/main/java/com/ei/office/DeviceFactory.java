package com.ei.office;
public class DeviceFactory {
    public static Device create(String type, String id){
        return switch(type.toLowerCase()){
            case "light" -> new Light(id);
            case "ac" -> new AirConditioner(id);
            case "sensor" -> new OccupancySensor(id);
            default -> throw new IllegalArgumentException("unknown"); };
    }
}
