Task 6 – Decorator Pattern (Structural)

Title: Report Generator Decorator
Pattern: Decorator (Structural)

Overview

Uses the Decorator pattern to add dynamic behavior to a report generator.
Reports can be enhanced (e.g., with headers, footers, formatting) without altering the core generator.

Structure

Component (Report) – base interface.

Concrete Component (BasicReport) – simple report.

Decorator (ReportDecorator) – abstract class wrapping a component.

Concrete Decorators (HeaderDecorator, FooterDecorator) – add behavior.

Features

Dynamically compose multiple decorators.

Extend without modifying the base report.