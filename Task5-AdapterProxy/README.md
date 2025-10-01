Task 5 – Adapter Pattern (Structural)

Title: Payment Gateway Adapter
Pattern: Adapter (Structural)

Overview

Demonstrates the Adapter pattern by connecting a legacy payment system with a new interface.
The adapter converts the client’s requests into the legacy system’s API.

Structure

Target (PaymentProcessor) – new interface expected by the client.

Adaptee (LegacyPaymentSystem) – old implementation.

Adapter (PaymentAdapter) – bridges between them.

Client – uses the new interface seamlessly.

Features

Reuse legacy code without modification.

Clean, modern API for new clients.