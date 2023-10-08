package map.Research.exercise_1;

import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    
    private Map<Long, Product> products;

    public ProductInventory () {
        this.products = new HashMap<>();
    }

    public void addProduct(long code, String name, double price, int quantity) {
        products.put(code, new Product(name, price, quantity));
    }

    public void displayProducts() {

        if(products.isEmpty()) {
            System.out.println("Empty inventory.");
        } else {
            System.out.println(products);
        }

    }

    public double calculateTotalInventoryValue() {

        if(products.isEmpty()) {
            System.out.println("Empty inventory.");
            return 0;
        } else {
            
            double inventoryValue = 0;

            for(Product p : products.values()) {
                inventoryValue += p.getQuantity() * p.getPrice();
            }

            System.out.println("The inventory total value is: " + inventoryValue);
            return inventoryValue;

        }

    }

    public Product getMostExpensiveProduct() {

        if(products.isEmpty()) {
            System.out.println("Empty inventory.");
            return null;
        } else {

            Product expensiveProduct = null;
            double biggerPrice = Double.MIN_VALUE;

            for(Product p : products.values()) {

                if(p.getPrice() > biggerPrice) {
                    expensiveProduct = p;
                    biggerPrice = p.getPrice();
                }

            }

            System.out.println("The most expensive product is: " + expensiveProduct);
            return expensiveProduct;

        }

    }

    public Product getCheapestProduct() {

        if(products.isEmpty()) {
            System.out.println("Empty inventory.");
            return null;
        } else {

            Product cheapestProduct = null;
            double smallerPrice = Double.MAX_VALUE;

            for(Product p : products.values()) {

                if(p.getPrice() < smallerPrice) {
                    cheapestProduct = p;
                    smallerPrice = p.getPrice();
                }

            }

            System.out.println("The cheapest product is: " + cheapestProduct);
            return cheapestProduct;

        }

    }

}
