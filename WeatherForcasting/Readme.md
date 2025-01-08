# Weather Station Application (Observer Pattern)

## Overview
This project demonstrates the implementation of the **Observer Design Pattern** using a Weather Station application. The **Weather Station** serves as the **Subject**, and multiple **Display Devices** act as **Observers**. The pattern ensures that any change in weather data (temperature, humidity) is automatically broadcast to all registered observers.

---

## Key Features
1. **Dynamic Observer Management**:  
   Observers can subscribe (`registerObserver`) or unsubscribe (`removeObserver`) to/from the Weather Station dynamically.

2. **Real-time Notifications**:  
   All registered observers are notified immediately whenever weather data is updated.

3. **Loose Coupling**:  
   Observers and the Weather Station are decoupled, adhering to the principles of the Observer Pattern.

4. **Optimized Weather Updates**:  
   A single method, `updateWeather(float temp, float humidity)`, is used to update both temperature and humidity in one go, avoiding redundant notifications.

---

## Components

### 1. Subject Interface
The `Subject` interface defines methods for:
- Registering observers (`registerObserver`)
- Removing observers (`removeObserver`)
- Notifying all registered observers (`notifyObservers`)

### 2. Observer Interface
The `Observer` interface defines the `update()` method, which allows all observers to receive notifications about changes in weather data.

### 3. WeatherStation (Subject Implementation)
The **WeatherStation** class implements the `Subject` interface and:
- Maintains the weather data (temperature and humidity).
- Manages a list of observers who are registered for updates.
- Notifies all registered observers when the weather data changes.

### 4. DisplayDevice (Observer Implementation)
The **DisplayDevice** class implements the `Observer` interface and:
- Displays the updated weather data when notified by the WeatherStation.
- Represents different display systems (e.g., mobile app, TV display).

---

## How It Works
1. **Initialization**:
    - Create an instance of `WeatherStation`.
    - Create instances of `DisplayDevice` and register them with the `WeatherStation`.

2. **Updating Weather Data**:
    - Use the `updateWeather(float temp, float humidity)` method to update the weather data.
    - This automatically triggers notifications to all registered observers.

3. **Dynamic Subscription Management**:
    - Observers can subscribe (`registerObserver`) or unsubscribe (`removeObserver`) at any point.

---

## Usage Example
1. Create a `WeatherStation` instance.
2. Register multiple `DisplayDevice` instances as observers.
3. Update weather data using the `updateWeather` method in the `WeatherStation`.
4. Dynamically remove an observer and verify that it no longer receives updates.

---

## Advantages
- **Event-driven architecture**: Automatically notifies all dependent components when data changes.
- **Scalability**: New observers can be added without modifying the core logic of the WeatherStation.
- **Loose coupling**: Subjects and observers are decoupled, making the system modular and flexible.

---

## Future Improvements
1. **Thread Safety**:  
   Use thread-safe collections or synchronization for managing the observer list in a multi-threaded environment.

2. **Notification Filters**:  
   Allow observers to subscribe to specific types of updates (e.g., temperature-only or humidity-only changes).

3. **Enhanced Logging**:  
   Add timestamps and other contextual data to the observer notifications for better debugging and tracking.

---

## How to Run
1. Compile and run the `Main` class.
2. Observe how the `DisplayDevice` instances are notified of weather updates in real-time.
3. Test dynamic subscription and unsubscription functionality.
