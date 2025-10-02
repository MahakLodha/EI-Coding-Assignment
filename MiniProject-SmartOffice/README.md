Mini Project – Smart Office Automation System

Title: Smart Office Automation System
Patterns Used:

Singleton (OfficeConfig – global config)

Factory Method (DeviceFactory – creates devices)

Command (BookRoomCommand – encapsulates operations)

Observer-like logic (OccupancySensor events)

Overview

This mini-project simulates a smart office system with rooms, floors, and devices (lights, ACs, sensors).
It demonstrates multiple design patterns in a practical use-case.

Structure

Devices (Light, AirConditioner, OccupancySensor) – extend Device.

Factory (DeviceFactory) – creates devices by type.

Room, Floor, Office – hierarchy of entities.

BookingManager – manages bookings, auto-releases after timeout using scheduler.

Commands (BookRoomCommand) – execute/undo device operations.

SmartOfficeSystem (CLI) – interactive console application.

Features

Add and control office devices.

Book and auto-release rooms.

Toggle occupancy sensors.

CLI interface with menu-driven options.

<img width="700" height="500" alt="image" src="https://github.com/user-attachments/assets/6ef6eaf5-985f-4cf8-840b-28ef4fefaade" />
