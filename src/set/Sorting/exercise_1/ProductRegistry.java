package set.Sorting.exercise_1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistry {
    
    private Set<Product> products;

    public ProductRegistry() {
        this.products = new HashSet<>();
    }

    public void addProduct(long code, String name, double price, int quantity) {
        products.add(new Product(name, code, price, quantity));
    }

    public Set<Product> displayProducts() {

        if(!products.isEmpty()) {
            return products;
        } else {
            throw new RuntimeException("No products found.");
        }

    }

    public Set<Product> displayProductsByName() {

        if(!products.isEmpty()) {
            
            Set<Product> productsByName = new TreeSet<>(products);
            return productsByName;

        } else {
            throw new RuntimeException("No products found.");
        }

    }

    public Set<Product> displayProductsByPrice() {

        if(!products.isEmpty()) {
            
            Set<Product> productsByPrice = new TreeSet<>( new ComparatorByPrice());
            productsByPrice.addAll(products);
            return productsByPrice;

        } else {
            throw new RuntimeException("No products found.");
        }

    }

}
