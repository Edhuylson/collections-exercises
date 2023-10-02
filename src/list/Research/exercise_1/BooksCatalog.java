package list.Research.exercise_1;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {
    
    private List<Book> booksList;

    public BooksCatalog() {
        this.booksList = new ArrayList<>();
    }

    public void addBook(String title, String author, int publicationYear) {
        booksList.add(new Book(title, author, publicationYear));
    }
    
    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();

        if(!booksList.isEmpty()) {

            for(Book b : booksList) {

                if(b.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(b);
                }

            }

            if(booksByAuthor.isEmpty()) {
                throw new RuntimeException("The list does not have any books by this author.");
            } else {
                 return booksByAuthor;
            }
           

        } else {
            throw new RuntimeException("The list is empty!");
        }

    }

    public List<Book> searchByYearRange(int startYear, int endYear) {
        List<Book> booksByYearRange = new ArrayList<>();

        if(startYear <= endYear) {

            if(!booksList.isEmpty()) {

                for(Book b : booksList) {

                    if(b.getPublicationYear() >= startYear && b.getPublicationYear() <= endYear) {
                        booksByYearRange.add(b);
                    }
                    
                }

                if(booksByYearRange.isEmpty()) {
                    throw new RuntimeException("There are no books within this range.");
                } else {
                    return booksByYearRange;
                }

            } else {
                throw new RuntimeException("The list is empty!");
            }

        } else {
            throw new RuntimeException("The start year must be greater than or equal to the end year.!");
        }

        
    }

    public Book searchByTitle(String title) {
        Book bookByTitle = null;

        if(!booksList.isEmpty()) {

            for(Book b : booksList) {

                if(b.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = b;
                    break;
                } 

            }

            if(bookByTitle == null) {
                    throw new RuntimeException("There are no books with this title.");
            } else {
               return bookByTitle; 
            }

        } else {
            throw new RuntimeException("The list is empty!");
        }

    }

}
