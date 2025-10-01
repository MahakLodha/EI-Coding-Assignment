package com.ei.task5.adapterproxy;
public class DeviceProxy implements Device {
    private final RealDevice device; private final String token;
    public DeviceProxy(RealDevice device, String token){ this.device=device; this.token=token; }
    private boolean authorized(){ return "secret".equals(token); }
    @Override public void turnOn(){ if(!authorized()) throw new SecurityException("Unauthorized"); device.turnOn(); }
    @Override public void turnOff(){ if(!authorized()) throw new SecurityException("Unauthorized"); device.turnOff(); }
    @Override public String id(){ return device.id(); }
}
