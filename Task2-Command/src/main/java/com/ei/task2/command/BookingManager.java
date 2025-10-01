package com.ei.task2.command;
import java.util.Stack;
public class BookingManager { private final Stack<Command> history = new Stack<>(); public void executeCommand(Command c) throws Exception{ c.execute(); history.push(c);} public void undoLast() throws Exception{ if(!history.isEmpty()) history.pop().undo(); } }
