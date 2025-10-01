package com.ei.task2.command;
public class BookRoomCommand implements Command {
    private final Room room; public BookRoomCommand(Room room){ this.room=room; }
    @Override public void execute() throws Exception { if(room.isBooked()) throw new IllegalStateException("Already booked"); room.setBooked(true); }
    @Override public void undo() throws Exception { room.setBooked(false); }
}
