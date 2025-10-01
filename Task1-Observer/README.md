Task 1 – Observer Pattern (Behavioral)

Title: Meeting Schedule Notification System
Pattern: Observer (Behavioral)

Overview

This task demonstrates the Observer pattern, where multiple observers (employees) subscribe to updates from a subject (meeting schedule manager).
When the meeting schedule changes, all observers are notified automatically.

Structure

Subject (ScheduleManager) – maintains a list of observers and notifies them when the meeting schedule changes.

Observer (Employee) – receives updates and displays them.

Main – shows adding/removing observers and schedule updates.

Features

Register and unregister employees.

Notify all observers about meeting changes.

Decoupled subject–observer relationship.

<img width="700" height="500" alt="Screenshot 2025-10-01 215928" src="https://github.com/user-attachments/assets/4089d156-bf8b-41c9-b925-d59329ea72d3" />
