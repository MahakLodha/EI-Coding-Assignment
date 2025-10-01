package com.ei.task1.observer;
import java.time.LocalTime;
public class Task {
    private final String name; private final LocalTime start; private final LocalTime end;
    public Task(String name, LocalTime start, LocalTime end){ if(name==null||start==null||end==null) throw new IllegalArgumentException(); if(end.isBefore(start)) throw new IllegalArgumentException(); this.name=name; this.start=start; this.end=end; }
    public String getName(){return name;} public LocalTime getStart(){return start;} public LocalTime getEnd(){return end;} public boolean overlaps(Task o){ return !(end.isBefore(o.start) || start.isAfter(o.end)); }
}
