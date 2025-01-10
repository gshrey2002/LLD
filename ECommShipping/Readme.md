**Design a Shipping Cost Calculation system using the Strategy Pattern.**

You are building an e-commerce platform, and users can select different shipping methods for their orders.
The platform supports 3 different shipping strategies:

1- **Standard Shipping (Takes 5-7 days)**

2- **Express Shipping (Takes 2-3 days)**

3- **Next Day Shipping (Delivered the next day)**

**Requirements:**

Strategy Interface: The system should define a common interface for all the shipping methods.

Shipping Classes: Implement each shipping strategy as a concrete class that calculates shipping costs based on the weight of the items and distance.

Context: The platform should allow users to select a shipping strategy at runtime and calculate the shipping cost accordingly.