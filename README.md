# Real-Time News Subscription Service

## 1. Problem Statement

### Background
> You are tasked with designing a real-time news subscription service for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency.

### Scenario Description
The system comprises two main components:
* **NewsAgency:** Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available.
* **Subscriber:** Represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency.

### Requirements
1.  **Subscription Management:** Users should be able to subscribe to the news service and be notified promptly.
2.  **Dynamic Subscription Updates:** Subscribers can subscribe, unsubscribe, or modify preferences dynamically without disrupting others.
3.  **Decoupled Communication:** The agency and subscribers must be decoupled. Subscribers should not directly request updates but wait for notifications.

### Constraints
* The system must be **scalable** to handle a growing number of subscribers.
* The implementation must follow **Object-Oriented Design (OOD)** principles and promote loose coupling.
