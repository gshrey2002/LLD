# Strategy Pattern Implementation: Shipping Cost Calculator

## Overview
The **Strategy Pattern** is a behavioral design pattern that allows you to define a family of algorithms, put each of them in a separate class, and make them interchangeable at runtime. This implementation demonstrates a **Shipping Cost Calculator** where different strategies are used to calculate shipping costs based on the selected shipping method.

---

## Components of the Strategy Pattern

1. **Strategy Interface**:
    - Defines a common interface for all concrete strategies.
    - Example: `ShippingCostStrategy`.

2. **Concrete Strategies**:
    - Implement the interface to provide specific behaviors.
    - Examples: `StandardShippingStrategy`, `ExpressShippingStrategy`, `OvernightShippingStrategy`.

3. **Context Class**:
    - Maintains a reference to the current strategy.
    - Delegates the algorithm execution to the selected strategy.
    - Example: `ShippingCostContext`.

---


## Benefits of the Strategy Pattern
1. **Scalability**: Easy to add new strategies without modifying existing code.
2. **Open/Closed Principle**: Open for extension (new strategies) and closed for modification (no changes to existing classes).
3. **Flexibility**: Strategies can be changed dynamically at runtime.
4. **No Fat Classes**: Logic is encapsulated in separate classes, avoiding a bloated context class.

---

## Example Output
For the input `distance = 100` and `weight = 20`:
```
Standard Shipping Cost: 60.0
Express Shipping Cost: 150.0
Overnight Shipping Cost: 220.0
```

---

## How to Use
1. Clone the repository.
2. Compile the code.
3. Run the `Main` class to test the shipping cost calculation with different strategies.

---

## Real-World Use Cases of the Strategy Pattern
1. Payment processing systems (credit card, PayPal, UPI, etc.).
2. Sorting algorithms (QuickSort, MergeSort, BubbleSort, etc.).
3. File compression (ZIP, RAR, 7z, etc.).
4. Parking lot management (e.g., different parking strategies for cars, bikes, trucks).

---

