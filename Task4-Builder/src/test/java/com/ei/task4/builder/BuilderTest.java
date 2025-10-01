package com.ei.task4.builder;
import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
class BuilderTest { @Test void testBuild(){ RoomConfiguration r = new RoomConfigBuilder().setName("R").setCapacity(3).build(); assertEquals(3, r.getCapacity()); } }
