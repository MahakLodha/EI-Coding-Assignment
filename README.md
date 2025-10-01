EI Coding Assignment

This repository contains my submission for the Educational Initiatives Coding Assignment.
It includes 6 design pattern tasks (2 Behavioral, 2 Creational, 2 Structural) and 1 Mini Project (Smart Office Automation System).

Each task is implemented in Java 17 using Maven, with unit tests included.
The project demonstrates understanding and application of core software design patterns.

-> Tasks Summary:
1. Observer Pattern – Meeting Schedule Notification System,
Category: Behavioral,
Demonstrates notifying employees when a meeting schedule changes.

2. Command Pattern – Room Booking System,
Category: Behavioral,
Encapsulates booking and cancellation as commands with undo functionality.

3. Singleton Pattern – Configuration Manager,
Category: Creational,
Provides a centralized configuration manager (single instance).

4. Factory Method Pattern – Notification Factory,
Category: Creational,
Creates different types of notifications (Email, SMS, Push).

5. Adapter Pattern – Payment Gateway Adapter,
Category: Structural,
Adapts a legacy payment system to a modern interface.

6. Decorator Pattern – Report Generator,
Category: Structural,
Dynamically adds features (headers, footers) to a report generator.

-> Project – Smart Office Automation System

Demonstrates multiple patterns together:
Singleton → OfficeConfig,
Factory Method → DeviceFactory,
Command → BookRoomCommand,
Observer-like logic → OccupancySensor,
Provides a CLI interface to control devices, manage rooms, and auto-release bookings.

-> Requirements:

Java 17+
Maven 3.8+
IDE: Eclipse / IntelliJ / VS Code

Run a specific task, e.g. Task 1:

cd Task1-Observer
mvn clean compile exec:java -Dexec.mainClass="com.ei.task1.observer.ObserverDemo"
