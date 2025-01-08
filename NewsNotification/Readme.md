Question


Problem Statement:
Design and implement a Notification System where users can subscribe to receive updates for specific topics (e.g., "Sports", "News", "Weather"). When a topic is updated, all subscribed users should be notified automatically.

Requirements:
Entities:

Topics: Represents the subjects that users can subscribe to. Each topic maintains its list of subscribers.
Users: Represents the observers who wish to subscribe to topics and receive notifications.
Functionalities:

Subscribe: A user can subscribe to one or more topics.
Unsubscribe: A user can unsubscribe from a specific topic.
Notify: When a topic is updated, notify all its subscribers with the updated message.
Add Topics: The system should allow adding new topics dynamically.
Design Goals:

Follow the Observer Pattern.
Ensure scalability for adding new topics or users.
Avoid tight coupling between Topics and Users.


