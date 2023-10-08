package map.Sorting.exercise_2;

import java.util.Comparator;

public class Book{
    
    private String title;
    private String author;
    private double price;
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book[title=" + title + ", author=" + author + ", price=" + price + "]";
    }    

}

class PriceComparator implements Comparator<Book>{

    public int compare(Book b1, Book b2) {
        return Double.compare(b1.getPrice(), b2.getPrice());
    }

}
