# Shopping Cart Discount System

## Problem Definition

Design a **Shopping Cart Discount System** using the **Decorator Pattern**. The system should:

1. **Base Functionality**: Start with a basic shopping cart that contains items and a total cost.
2. **Dynamic Discounts and Features**: Allow discounts (e.g., flat discounts, percentage discounts) and additional features (e.g., free shipping) to be added dynamically at runtime without modifying the existing code.
3. **Flexibility**: Ensure that any combination of discounts or features can be applied in a scalable way.

---

## Code Example

### Step 1: Define the `Cart` Interface
```java
public interface Cart {
    String items();
    Double totalCost();
}
```

### Step 2: Create the `UsersCart` Class (Base Implementation)
```java
public class UsersCart implements Cart {
    @Override
    public String items() {
        return "User's Cart";
    }

    @Override
    public Double totalCost() {
        return 5100.0;
    }
}
```

### Step 3: Create the `CartDecorator` Abstract Class
```java
public abstract class CartDecorator implements Cart {
    protected Cart cart;

    public CartDecorator(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String items() {
        return cart.items();
    }

    @Override
    public Double totalCost() {
        return cart.totalCost();
    }
}
```

### Step 4: Implement Specific Decorators
#### Flat Discount Decorator
```java
public class FlatDiscountDecorator extends CartDecorator {
    public FlatDiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public String items() {
        return cart.items() + " | Flat Discount Applied";
    }

    @Override
    public Double totalCost() {
        return cart.totalCost() - 100.0;
    }
}
```

#### Percentage Discount Decorator
```java
public class PercentageDiscountDecorator extends CartDecorator {
    public PercentageDiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public String items() {
        return cart.items() + " | 10% Discount Applied";
    }

    @Override
    public Double totalCost() {
        return cart.totalCost() * 0.9;
    }
}
```

#### Free Shipping Decorator
```java
public class FreeShippingDecorator extends CartDecorator {
    public FreeShippingDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public String items() {
        return cart.items() + " | Free Shipping";
    }

    @Override
    public Double totalCost() {
        return cart.totalCost() - 40.0;
    }
}
```

### Step 5: Main Class to Test the Decorators
```java
public class Main {
    public static void main(String[] args) {
        Cart userCart = new UsersCart();
        System.out.println(userCart.items() + " -> Total: " + userCart.totalCost());

        userCart = new FlatDiscountDecorator(userCart);
        System.out.println(userCart.items() + " -> Total: " + userCart.totalCost());

        userCart = new PercentageDiscountDecorator(userCart);
        System.out.println(userCart.items() + " -> Total: " + userCart.totalCost());

        userCart = new FreeShippingDecorator(userCart);
        System.out.println(userCart.items() + " -> Total: " + userCart.totalCost());
    }
}
