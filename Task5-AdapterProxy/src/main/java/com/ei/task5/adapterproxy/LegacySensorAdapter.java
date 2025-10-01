package com.ei.task5.adapterproxy;
public class LegacySensorAdapter implements Sensor {
    private final String legacy;
    public LegacySensorAdapter(String legacy){ this.legacy=legacy; }
    @Override public String readData(){ return "normalized:" + legacy.replace("|", ","); }
}
