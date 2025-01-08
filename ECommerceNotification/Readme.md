# Observer Pattern - Product Categories & Customer Notification

## Overview

This project implements the **Observer Design Pattern** to notify customers about new products added to specific product categories. Customers subscribe to categories (such as Electronics, Groceries), and when a new product is added, the subscribed customers (observers) are notified with the product details.

---

## Components

### 1. **Observer Interface**
The `Observer` interface defines a method `update()`, which is called when a new product is added to the product category. The observer receives the product name and category name as parameters.

#### Methods:
- `update(String productName, String categoryName)`: Called when a new product is added to the category. It updates the observer with the product name and category name.

### 2. **ProductCategory Interface**
The `ProductCategory` interface defines the common methods that must be implemented by all product categories (e.g., Electronics, Groceries). These methods allow customers (observers) to subscribe, unsubscribe, and get notified of product additions.

#### Methods:
- `getCategoryName()`: Returns the name of the category (e.g., "Electronics", "Groceries").
- `addObserver(Observer obv)`: Registers an observer (customer) to receive notifications for the category.
- `removeObserver(Observer obv)`: Removes an observer from the category.
- `notifyObserver(String productName)`: Notifies all observers about the new product added to the category.

### 3. **ProductNew Class**
The `ProductNew` class implements the `ProductCategory` interface and is responsible for managing products within the category and notifying customers when new products are added.

#### Responsibilities:
- Adds observers to a category.
- Notifies observers when a new product is added.
- Manages products within the category.

#### Methods:
- `addProduct(String productName)`: Adds a product to the category and notifies all observers about the new product.
- `addObserver(Observer obv)`: Adds an observer (customer) to the category.
- `removeObserver(Observer obv)`: Removes an observer from the category.
- `notifyObserver(String productName)`: Notifies all the observers of the newly added product.

### 4. **Customer Class**
The `Customer` class implements the `Observer` interface. Each customer subscribes to one or more product categories and will be notified when a new product is added to a category.

#### Methods:
- `update(String productName, String categoryName)`: This method is called when a new product is added to the subscribed category. It prints a message about the new product.

---

## How It Works

1. **Create Product Categories:**
   Instances of the `ProductNew` class are created for each product category, such as "Electronics" and "Groceries".

2. **Customer Subscribes to Categories:**
   Customers (observers) subscribe to one or more categories by calling the `addObserver()` method. This adds the customer to the list of observers for that category.

3. **Adding Products to Categories:**
   Products are added to a category using the `addProduct()` method. When a product is added, the `notifyObserver()` method is triggered, which notifies all the subscribed customers (observers) about the new product.

4. **Customer Notification:**
   Each observer (customer) will receive a notification (via the `update()` method) containing the name of the product and the category it belongs to.

---

## Example Use Case

1. A customer named "Shrey" subscribes to the `Electronics` and `Groceries` categories.
2. A product "Smartphone" is added to the `Electronics` category. Shrey, who is subscribed to this category, is notified.
3. A product "Apple" is added to the `Groceries` category. Shrey is notified about this new product as well.

---

## Benefits of the Observer Pattern

- **Loose Coupling:** Observers (customers) are loosely coupled with the product categories. The customers don't need to know about the internal details of the category, they just need to subscribe to it.
- **Scalable:** New categories and customers can be added easily, and the system will continue to function as expected. Customers can observe multiple categories.
- **Flexibility:** Customers can opt in and out of different product categories based on their interests.

---

## Running the Example

1. Create instances of `ProductNew` for each category (e.g., `Electronics`, `Groceries`).
2. Create instances of `Customer` who will observe the categories.
3. Call `addProduct()` on a category to add a new product.
