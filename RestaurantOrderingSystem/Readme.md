# Restaurant Ordering System - Decorator Pattern

This project demonstrates the **Decorator Pattern** by allowing dynamic customization of dishes with additional toppings or modifications. The example uses a base dish (`Pizza`) that can be enhanced with decorators like `Cheese`, `Fries`, and `Spicy`.

---

## Problem Statement

Design a **restaurant ordering system** where:
1. Customers can order a base dish (e.g., Pizza).
2. Additional toppings or modifications can be added dynamically at runtime (e.g., Cheese, Fries, Spicy).
3. The system should calculate and display the final price and description of the customized dish.

---

## Why Decorator Pattern?

The **Decorator Pattern** is used to:
1. **Dynamically extend functionality**: Add or remove features at runtime without altering the base class.
2. **Follow Open/Closed Principle**: Base classes remain unchanged while functionalities are extended through decorators.
3. **Enhance Scalability**: Easily add new features by creating new decorators.

---

## Class Structure

1. **Interface**:
    - `Dish`: Represents the base dish and provides the contract for all concrete dishes and decorators.

2. **Concrete Class**:
    - `Pizza`: Implements the `Dish` interface and represents the base dish.

3. **Abstract Decorator**:
    - `DishDecorator`: Implements the `Dish` interface and wraps a `Dish` object to extend its functionality.

4. **Concrete Decorators**:
    - `CheeseDecorator`: Adds cheese topping.
    - `FriesDecorator`: Adds fries as a side.
    - `SpicyDecorator`: Makes the dish spicy.

---
## Advantages
1. **Flexibility**: Customizations can be added or removed dynamically at runtime.
2. **Reusability**: Decorators can be reused across multiple base classes.
3. **Separation of Concerns**: Enhancements are separated from the base class logic.

## Limitations
1. **Complexity**: Too many decorators can make the system difficult to debug.
2. **Performance Overhead**: Each decorator adds a layer of abstraction.
## Real-World Use Cases
1. Coffee Shop Applications (e.g., adding milk, sugar, or flavors to a base coffee).
2. Pizza Ordering Systems (e.g., adding toppings like cheese, mushrooms, or olives).
3. Online Shopping (e.g., applying discounts, gift wrapping, or expedited shipping).
## Summary
The Decorator Pattern is an excellent choice for applications that require dynamic customization while adhering to principles like Open/Closed. This project demonstrates its practical implementation in a restaurant ordering system.