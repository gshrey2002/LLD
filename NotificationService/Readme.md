**Problem Statement: Notification System**

You need to implement a notification system using the Observer Pattern. 
Here's the scenario:

There's a NotificationService that acts as the Subject. It maintains a list of users subscribed to notifications.
Users (observers) will implement an interface to receive notifications.
When a notification is published, all subscribed users should be notified.

Requirements:

Implement the Observer interface with a method update(String message) to receive notifications.

Create a NotificationService class (Subject) that allows:

Adding users to the subscription list.

Removing users from the subscription list.

Notifying all subscribed users when a new notification is published.

Create a few user classes that implement the Observer interface (e.g., UserA, UserB).

Demonstrate the solution:

Add users to the notification system.

Publish a few notifications.

Remove a user and show that they no longer receive notifications.