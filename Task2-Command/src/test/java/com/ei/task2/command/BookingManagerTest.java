package com.ei.task2.command;
import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
class BookingManagerTest { @Test void testBookUndo() throws Exception{ Room r=new Room("R1"); BookingManager m=new BookingManager(); m.executeCommand(new BookRoomCommand(r)); assertTrue(r.isBooked()); m.undoLast(); assertFalse(r.isBooked()); } }
