
Task 2 – Command Pattern (Behavioral)

Title: Room Booking Command System
Pattern: Command (Behavioral)

Overview

Implements the Command pattern to encapsulate booking operations (book, cancel) as commands.
This decouples the request invoker from the actual execution logic.

Structure

Command (ICommand) – interface with execute() and undo().

Concrete Commands (BookRoomCommand, CancelBookingCommand) – implement booking/cancellation logic.

Invoker (BookingManager) – executes and keeps a history of commands.

Receiver (Room) – performs the actual operation.

Features

Book and cancel rooms via commands.

Undo last operation.

Extendable for more booking commands.
