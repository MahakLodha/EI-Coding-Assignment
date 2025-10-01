package com.ei.task6.composite;
import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
class CompositeTest { @Test void testTotal(){ Room r1=new Room("101",3); Room r2=new Room("102",2); Floor f=new Floor("F1"); f.add(r1); f.add(r2); Office o=new Office("O"); o.addFloor(f); assertEquals(5, o.getCapacity()); } }
