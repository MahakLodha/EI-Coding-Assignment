package com.ei.task3.factory;
public class DeviceFactory {
    public static Device createDevice(String type, String id){
        return switch(type.toLowerCase()){
            case "light" -> new Light(id);
            default -> throw new IllegalArgumentException("unknown"); };
    }
}
