package com.ei.task1.observer;
import java.util.ArrayList; import java.util.List;
public class ScheduleManager {
    private final List<Task> tasks = new ArrayList<>(); private final List<Observer> observers = new ArrayList<>();
    public void registerObserver(Observer o){ observers.add(o); }
    public void addTask(Task t){ for(Task ex: tasks){ if(t.overlaps(ex)){ notifyObservers("Conflict: " + t.getName() + " overlaps " + ex.getName()); return; } } tasks.add(t); notifyObservers("Added: " + t.getName()); }
    private void notifyObservers(String m){ for(Observer o: observers) try{ o.update(m);}catch(Exception e){} }
}
