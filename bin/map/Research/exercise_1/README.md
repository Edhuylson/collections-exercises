## 1. Product Inventory with Price

Create a class called "ProductInventory" that uses a Map to store products, their quantities in stock, and their respective prices. Each product has a code as the key and a Product object as the value, containing the name, quantity, and price. Implement the following methods:

- `addProduct(long code, String name, int quantity, double price)`: Adds a product to the inventory, along with the available quantity and price.
- `displayProducts()`: Displays all products, their quantities in stock, and prices.
- `calculateTotalInventoryValue()`: Calculates and returns the total value of the inventory, considering the quantity and price of each product.
- `getMostExpensiveProduct()`: Returns the most expensive product in the inventory, i.e., the one with the highest price.
- `getCheapestProduct()`: Returns the cheapest product in the inventory, i.e., the one with the lowest price.