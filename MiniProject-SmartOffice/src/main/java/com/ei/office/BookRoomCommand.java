package com.ei.office;
public class BookRoomCommand implements ICommand {
    private final Room room; public BookRoomCommand(Room room){ this.room=room; }
    @Override public void execute() throws Exception { room.turnOnAllDevices(); }
    @Override public void undo() throws Exception { room.turnOffAllDevices(); }
}
