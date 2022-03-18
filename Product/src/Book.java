
// Jonathan Ocampo
//03/11/22
//Creating a Book class that uses attributes from parent class in conjunction with its own private attributes to be stored and call when needed
public class Book extends Product {
    // Private class attributes - only for the Book class
    private String author;
    private String genre;
    private int isbn;

    public Book(String name, double price, int quantity, String author, String genre, int isbn) {
        super(name, price, quantity);
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }

    public Book(String name, double price, int quantity, String author) {
        super(name, price, quantity);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    void getDetails() {
        System.out.println("We sell books on Software Development.");
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", genre=" + genre + ", isbn=" + isbn + "]";
    }

}
