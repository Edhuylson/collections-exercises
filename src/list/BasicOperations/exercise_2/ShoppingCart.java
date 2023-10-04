package list.BasicOperations.exercise_2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        cartItems.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();

        if (!cartItems.isEmpty()) {

            for(Item i : cartItems) {

                if(i.getName().equalsIgnoreCase(name)) {
                    itemsToRemove.add(i);
                }
            
            }

            cartItems.removeAll(itemsToRemove);

        } else {
            System.out.println("The cart is empty!");
        }
        
    }

    public double calculateTotalValue() {
        double total = 0;

        if (!cartItems.isEmpty()) {

            for(Item i : cartItems) {
                total += i.getPrice() * i.getQuantity();
            }

            return total;

        } else {
            throw new RuntimeException("The cart is empty!");
        }
        
    }

    public void displayItems() {

        if (!cartItems.isEmpty()) {
            System.out.println(this.cartItems);
        } else {
            System.out.println("The cart is empty!");
        }
        
    }

}