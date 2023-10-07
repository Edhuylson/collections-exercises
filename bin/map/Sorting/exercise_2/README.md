## 2. Online Bookstore

Create a class called "OnlineBookstore" that represents an online bookstore. This class uses a Map to store the books available in the bookstore, using the book's link on Amazon Marketplace as the key and an object of the "Book" class as the value. The "Book" class has attributes such as title, author, and price. Through the "OnlineBookstore" class, implement the following methods:

- `addBook(String link, String title, String author, double price)`: Adds a book to the bookstore, using the ISBN as the key in the Map.
- `removeBook(String title)`: Removes a book from the bookstore, given the book's title.
- `displayBooksSortedByPrice()`: Displays the books in the bookstore in ascending order of price.
- `searchBooksByAuthor(String author)`: Returns a list of all books written by a specific author.
- `getMostExpensiveBook()`: Returns the most expensive book available in the bookstore.
- `getCheapestBook()`: Returns the cheapest book available in the bookstore.