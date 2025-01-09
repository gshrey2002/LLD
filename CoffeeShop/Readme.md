# Coffee Shop Application - Decorator Pattern

## Overview
This project demonstrates the **Decorator Pattern** by simulating a coffee shop where you can dynamically add customizations (e.g., milk, sugar) to a base coffee.

The **Decorator Pattern** is a structural design pattern that allows behavior to be added to individual objects dynamically without modifying the code of other objects.

---

## Key Components of Decorator Pattern

1. **Component (Interface)**: Defines the common functionality for all concrete and decorated objects.
    - `Coffee`

2. **Concrete Component**: The base object to which decorators add functionality.
    - `BasicCoffee`

3. **Decorator (Abstract)**: Wraps a `Component` object and forwards its method calls while adding new functionality.
    - `CoffeeDecorator`

4. **Concrete Decorators**: Extend the functionality of the object being decorated.
    - `MilkDecorator`
    - `SugarDecorator`

---

## Project Structure
```
coffee-shop/
├── Coffee.java                // Interface
├── BasicCoffee.java           // Concrete Component
├── CoffeeDecorator.java       // Abstract Decorator
├── MilkDecorator.java         // Concrete Decorator
├── SugarDecorator.java        // Concrete Decorator
└── CoffeeShop.java            // Main Class
```

---

## Code Walkthrough

### 1. **Coffee.java**
Defines the interface for all coffee components:
```java
public interface Coffee {
    String getDescription();
    double getCost();
}
```

### 2. **BasicCoffee.java**
Implements the base coffee component:
```java
public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
```

### 3. **CoffeeDecorator.java**
Abstract decorator class that wraps a coffee object:
```java
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
```

### 4. **MilkDecorator.java**
Adds milk to the coffee:
```java
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10.0;
    }
}
```

### 5. **SugarDecorator.java**
Adds sugar to the coffee:
```java
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5.0;
    }
}
```

### 6. **CoffeeShop.java**
Main class to demonstrate the pattern:
```java
public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " = ₹" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " = ₹" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " = ₹" + coffee.getCost());
    }
}
```

---

## Output
```
Basic Coffee = ₹50.0
Basic Coffee, Milk = ₹60.0
Basic Coffee, Milk, Sugar = ₹65.0
```

---

## Quick Revision - Decorator Pattern

### Definition
The Decorator Pattern dynamically adds responsibilities to objects without modifying their structure.

### Key Points:
- **Open-Closed Principle**: New functionalities can be added without changing the existing code.
- **Composition over Inheritance**: Extends behavior by composing objects, not subclassing them.

### Advantages:
- Flexibility to add/remove behavior dynamically.
- Follows SOLID principles (Open-Closed and Single Responsibility).

### Drawbacks:
- Can introduce complexity with too many decorators.
- Difficult to debug when decorators are deeply nested.

---

## LLD Question for Practice
**Scenario**:
A coffee shop allows customers to customize their orders by adding multiple toppings (e.g., milk, sugar, whipped cream). Each topping adds an additional cost to the base coffee. Implement a system using the **Decorator Pattern**.

**Requirements**:
1. Start with a `BasicCoffee` class.
2. Add toppings like `Milk`, `Sugar`, and `WhippedCream` dynamically.
3. Calculate and display the total cost and description of the coffee order.

**Hints**:
- Define an interface `Coffee` with methods `getDescription()` and `getCost()`.
- Use a base class `BasicCoffee`.
- Use abstract and concrete decorators for toppings.

---

