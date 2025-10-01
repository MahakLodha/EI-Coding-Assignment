Task 4 – Factory Method Pattern (Creational)

Title: Notification Factory
Pattern: Factory Method (Creational)

Overview

Implements the Factory Method pattern to create different notification channels (Email, SMS, Push).
The factory abstracts object creation from the client.

Structure

Product (Notification) – interface for notifications.

Concrete Products (EmailNotification, SMSNotification, PushNotification).

Factory (NotificationFactory) – creates notification objects based on input.

Client – requests notifications without knowing implementation details.

Features

Extendable to add new notification types easily.

Decoupled object creation.

<img width="438" height="600" alt="image" src="https://github.com/user-attachments/assets/14c07f2d-ab16-4172-9c48-1cfd533c603e" />
