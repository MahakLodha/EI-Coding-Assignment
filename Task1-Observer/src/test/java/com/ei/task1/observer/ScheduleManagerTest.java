package com.ei.task1.observer;
import org.junit.jupiter.api.Test; import java.time.LocalTime; import static org.junit.jupiter.api.Assertions.*;
class ScheduleManagerTest {
    @Test void testConflict(){ ScheduleManager m=new ScheduleManager(); final boolean[] got={false}; m.registerObserver(msg-> { if(msg.contains("Conflict")) got[0]=true; }); m.addTask(new Task("A", LocalTime.of(9,0), LocalTime.of(10,0))); m.addTask(new Task("B", LocalTime.of(9,30), LocalTime.of(10,30))); assertTrue(got[0]); }
}
