**Case Study: ECommerce App**

Create a simplified online shopping system in Java, incorporating fundamental concepts such as classes, inheritance, and exception handling.

**Requirements:**

1. **Create a `Product` Class:**

   - Implement a `Product` class with attributes `productName` (String), `productId` (int), `price` (double), and `quantityInStock` (int).
   - Include a method `displayDetails` to print details of the product.
2. **Derived Classes - `Electronics` and `Clothing`:**

   - Create two classes, `Electronics` and `Clothing`, that inherit from the `Product` class.
   - Add attributes specific to each type (e.g., `brand` and `warrantyPeriod` for electronics, `size` and `material` for clothing).
   - Override the `displayDetails` method in each derived class to include information about the specific attributes.
3. **Available Products**
   - Initialize with few Products 

4. **Shopping Cart:**

   - Create a `ShoppingCart` class to manage the user's shopping cart.
   - Apply 10% discounts to all electronics products and 20% to all clothing products.
   - Include methods to add products to the cart, display the cart contents, and calculate the total price.

5. **User Input and Exception Handling:**

   - Welcome to My Shopping App
   - Select an Option:
   - 1 : View All Products
   - 2 : Add Product to cart
   - 3 : View Cart

6. Exception Handling
- InvalidInputException : Unchecked Exception
  - Product ID should be a positive value
  - Product Name should not be null or blank
  - price should be a positive value
  
 - ProductNotFoundException : Checked Exception
  - if product with id or name is not present

 - DuplicateProductException : Checked Exception
  - if one tries to add two products with same id
