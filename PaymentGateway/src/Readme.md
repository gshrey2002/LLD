# Payment Gateway System - Strategy Pattern

## Overview

This project implements a **Payment Gateway System** using the **Strategy Design Pattern** in Java. The system is designed to support multiple payment methods such as **Credit Card**, **Debit Card**, and **UPI**. It is flexible, scalable, and adheres to **SOLID principles**, allowing the addition of new payment methods with minimal changes to existing code.

---

## Key Features

- **Dynamic Payment Method Switching**: Allows switching between different payment methods at runtime.
- **Extensibility**: Easily add new payment methods without modifying existing code.
- **Clean and Maintainable Code**: Follows the principles of the **Strategy Pattern** and **SOLID design**.
- **Reusability**: Each payment method is implemented as a separate, reusable class.

---

## Design Pattern Used

The **Strategy Pattern** is used to encapsulate different payment algorithms (strategies) into separate classes and make them interchangeable at runtime. This ensures the system is open for extension but closed for modification, adhering to the **Open/Closed Principle**.

---

## Class Diagram

Below is the class diagram illustrating the relationships among the components:

```
                     +--------------------------+
                     |   PaymentStrategy        |
                     |--------------------------|
                     | + doPayment(amount):String|
                     +--------------------------+
                               ▼
              ---------------------------------------------
              |                     |                    |
+-----------------------+  +---------------------+  +-------------------+
| CreditCardPayment     |  | DebitCardPayment    |  | UPIPayment         |
|-----------------------|  |---------------------|  |-------------------|
| + doPayment(amount):String|  | + doPayment(amount):String|  | + doPayment(amount):String|
+-----------------------+  +---------------------+  +-------------------+

                     +--------------------------+
                     |     PaymentContext       |
                     |--------------------------|
                     | - payment: PaymentStrategy|
                     |--------------------------|
                     | + setPayment(strategy):void|
                     | + initiatePayment(amount):String|
                     +--------------------------+
```

---

## How It Works

1. **PaymentStrategy Interface**:
    - Defines the `doPayment(amount: double): String` method that all payment strategies must implement.

2. **Concrete Strategies**:
    - Implement the `PaymentStrategy` interface to define specific payment methods:
        - **CreditCardPayment**: Processes payments via credit card.
        - **DebitCardPayment**: Processes payments via debit card.
        - **UPIPayment**: Processes payments via UPI.

3. **PaymentContext**:
    - Maintains a reference to a `PaymentStrategy` object.
    - Provides the `setPayment()` method to switch payment strategies dynamically.
    - Delegates the `initiatePayment()` call to the current strategy.

4. **Main Class**:
    - Demonstrates the dynamic selection of payment methods by setting different strategies in the `PaymentContext` and invoking the payment process.

---

## Benefits of Using Strategy Pattern

- **Flexibility**: Easily switch between payment methods at runtime.
- **Scalability**: Add new payment methods without modifying existing code.
- **Code Reusability**: Each payment method is encapsulated in its own class, promoting reuse.
- **Adherence to SOLID Principles**: Ensures a clean, maintainable, and extensible design.

---

## How to Extend

To add a new payment method:
1. Create a new class that implements the `PaymentStrategy` interface.
2. Override the `doPayment(double amount)` method with the new payment logic.
3. Use the `setPayment()` method in `PaymentContext` to set the new strategy.

---

## Example Extension
If you want to add a `PayPalPayment` option:

1. Create the `PayPalPayment` class:
```java
package Strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public String doPayment(double amount) {
        return "Processing payment with PayPal of Amount " + amount;
    }
}
```

2. Update the `Main` class to include this new strategy:
```java
context.setPayment(new PayPalPayment());
System.out.println("paypal payment " + context.initiatePayment(100));
```

---

## Conclusion
This Payment Gateway System showcases how the **Strategy Pattern** can simplify the design of applications that require multiple interchangeable behaviors. It demonstrates adherence to **SOLID principles**, making the system flexible, extensible, and maintainable.

