package set.Sorting.exercise_1;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>{
    
    private String name;
    private long code;
    private double price;
    private int quantity;

    public Product(String name, long code, double price, int quantity) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public long getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {

        if(this == o) return true;
        if(!(o instanceof Product)) return false;
        
        Product product = (Product) o;
        return getCode() == product.getCode();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public int compareTo(Product p) {
        return name.compareToIgnoreCase(p.getName());
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name=" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

class ComparatorByPrice implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    } 

}
