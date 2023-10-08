package map.Sorting.exercise_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineBookStore {
    
    private Map<Long, Book> books;

    public OnlineBookStore() {
        this.books = new HashMap<>();
    }

    public void addBook(Long isbn, String title, String author, double price) {
        books.put(isbn, new Book(title, author, price));
    }

    public void removeBook(String title) {

        if(books.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            
            Long keyToRemove = null;

            for(Map.Entry<Long, Book> entry : books.entrySet()) {

                if(entry.getValue().getTitle().equalsIgnoreCase(title)) {
                    keyToRemove = entry.getKey();
                    break;
                }

            }

            if(keyToRemove == null) {
                System.out.println("There are no books with this title.");
            } else {
                books.remove(keyToRemove);
                System.out.println("Book removed.");
            }

        }

    }

    public Map<Long, Book> displayBooks() {

        if(books.isEmpty()) {
            System.out.println("The map is empty.");
            return null;
        } else {
            return books;
        }

    }

    public List<Book> displayBooksSortedByPrice() {

        if(books.isEmpty()) {
            System.out.println("The map is empty.");
            return null;
        } else {
            List<Book> booksByPrice = new ArrayList<>(books.values());
            booksByPrice.sort(new PriceComparator());

            return booksByPrice;
        }

    }

    public Map<Long, Book> searchBooksByAuthor(String author) {

        if(books.isEmpty()) {
            System.out.println("The map is empty.");
            return null;
        } else {
            
            Map<Long, Book> bookByAuthor = new HashMap<>();

            for(Map.Entry<Long, Book> entry : books.entrySet()) {

                if(entry.getValue().getAuthor().equalsIgnoreCase(author)) {
                    bookByAuthor.put(entry.getKey(), entry.getValue());
                }

            }

            if(bookByAuthor.isEmpty()) {
                System.out.println("There are no books by this author.");
                return null;
            } else {
                return bookByAuthor;
            }
            
        }

    }

    public List<Book> getMostExpensiveBook() {

        if(books.isEmpty()) {
            System.out.println("The map is empty.");
            return null;
        } else {

            List<Book> expensiveBook = new ArrayList<>();
            double maxPrice = Double.MIN_VALUE;

            for(Book b : books.values()) {

                if(b.getPrice() > maxPrice) {
                    maxPrice = b.getPrice();
                    expensiveBook.clear();
                    expensiveBook.add(b);
                } else if(b.getPrice() == maxPrice) {
                    expensiveBook.add(b);
                }

            }

            System.out.println(expensiveBook);
            return expensiveBook;

        }


    }

    public List<Book> getCheapestBook() {

        if(books.isEmpty()) {
            System.out.println("The map is empty.");
            return null;
        } else {

            List<Book> cheapestBook = new ArrayList<>();
            double minPrice = Double.MAX_VALUE;

            for(Book b : books.values()) {

                if(b.getPrice() < minPrice) {
                    minPrice = b.getPrice();
                    cheapestBook.clear();
                    cheapestBook.add(b);
                } else if(b.getPrice() == minPrice) {
                    cheapestBook.add(b);
                }

            }

            System.out.println(cheapestBook);
            return cheapestBook;

        }

    }
    
}
