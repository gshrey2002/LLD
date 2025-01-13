# Factory Design Pattern

## Overview
The **Factory Design Pattern** is a **creational design pattern** that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

### Key Points:
- Encapsulates object creation logic.
- Promotes loose coupling between client classes and the classes they instantiate.
- Adds scalability and flexibility when new object types are introduced.

---

## When to Use
1. When the exact type of object to be created depends on specific conditions or inputs.
2. When you want to centralize object creation logic to make the code easier to maintain.
3. When you want to avoid tight coupling between the client code and specific classes.

---

## Advantages
1. **Encapsulation**: Centralizes object creation logic in a single place.
2. **Flexibility**: Makes it easier to introduce new object types.
3. **Loose Coupling**: Clients depend on interfaces, not concrete implementations.

---

## Disadvantages
1. **Complexity**: May introduce unnecessary complexity for simple object creation.
2. **Overhead**: The factory class may become a single point of dependency if not handled well.

---

## Implementation in Java
### Folder Structure
```
src
├── Main.java
├── pizza
│   ├── Pizza.java
│   ├── MargheritaPizza.java
│   ├── PepperoniPizza.java
│   └── PizzaFactory.java
```

### Code
#### 1. Define an Interface: `Pizza`
```java
package pizza;

public interface Pizza {
    void prepare();
}
```

#### 2. Create Concrete Implementations: `MargheritaPizza` and `PepperoniPizza`
##### File: `MargheritaPizza.java`
```java
package pizza;

public class MargheritaPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Margherita Pizza...");
    }
}
```

##### File: `PepperoniPizza.java`
```java
package pizza;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza...");
    }
}
```

#### 3. Create a Factory Class: `PizzaFactory`
```java
package pizza;

public class PizzaFactory {
    public static Pizza getPizza(String type) {
        if (type.equalsIgnoreCase("Margherita")) {
            return new MargheritaPizza();
        } else if (type.equalsIgnoreCase("Pepperoni")) {
            return new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type: " + type);
        }
    }
}
```

#### 4. Client Code: `Main`
```java
import pizza.Pizza;
import pizza.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        try {
            // Request Margherita Pizza
            Pizza margherita = PizzaFactory.getPizza("Margherita");
            margherita.prepare();

            // Request Pepperoni Pizza
            Pizza pepperoni = PizzaFactory.getPizza("Pepperoni");
            pepperoni.prepare();

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
```

---

## How It Works
1. **Interface (`Pizza`)**: Defines the contract that all concrete pizzas must follow.
2. **Concrete Classes (`MargheritaPizza` and `PepperoniPizza`)**: Implement the `Pizza` interface.
3. **Factory Class (`PizzaFactory`)**: Contains logic to instantiate the correct pizza based on input.
4. **Main Class**: Acts as the client, requesting objects from the factory.

---

## Example Execution
### Compile and Run:
1. Navigate to the `src` directory in the terminal.
2. Compile all Java files:
   ```bash
   javac Main.java pizza/*.java
   ```
3. Run the `Main` class:
   ```bash
   java Main
   ```

### Output:
```
Preparing Margherita Pizza...
Preparing Pepperoni Pizza...
```

---

## Summary
The Factory Pattern simplifies object creation by delegating it to a factory class. It is ideal for scenarios where the creation logic varies or requires abstraction. With the pattern in place, your code becomes more modular, easier to maintain, and scalable when adding new types.

---

Let me know if you'd like to practice or extend this example further! 😊

