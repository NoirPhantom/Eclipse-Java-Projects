// Jonathan Ocampo
// 02/22/2022
// Creating a class called book and creating instances and constructors
public class Book {
	String title;
	String publisher;
	int numberOfPages;
	long isbn;
	int edition;
	String author;

	// Constructors
	/*
	 * Book (){ this.title = "Harry Potter and The Sorcerer's Stone"; this.publisher
	 * = "Scholastic"; this.numberOfPages = 223; this.isbn = 439708184; this.edition
	 * = 1; this.author = "J.K. Rowling"; }
	 */

	Book(String title, int pages, long num, String publisher, String author, int edition) {
		this.title = title;
		this.numberOfPages = pages;
		this.isbn = num;
		this.publisher = publisher;
		this.author = author;
		this.edition = edition;
	}

	Book(String title, int pages, long num, String publish, String author) {
		this.title = title;
		this.numberOfPages = pages;
		this.isbn = num;
		this.publisher = publish;
		this.author = author;
	}

	Book(String title, int pages, long num) {
		this.title = title;
		this.numberOfPages = pages;
		this.isbn = num;
	}

	// Instance
	void readEachPage() {
		for (int i = 1; i <= this.numberOfPages; i++) {
			System.out.println("Reading page number " + i + " from the book " + this.title);
		}
	}

	// Instance
	boolean sameAuthor(Book b1) {
		// Comparing current book author to book author being sent as a parameter
		return this.author.equals(b1.author);
	}

	// Instance
	boolean isisbnValid() {
		return this.isbn != 0;
	}

	
	  public String toString() { 
		  return ("Title is " + title + ", Publisher is " + publisher + ", Author is " + author 
				  + ", isbn is " + isbn + ", Number of pages is " + numberOfPages + ", Edition of book is " + edition);
	  }
	 
	/*
	 * @Override public String toString() {
	 * 
	 * return ("title is " + this.title + ". Publisher is " + this.publisher +
	 * " author is " + this.author + " .isbn is " + this.isbn +
	 * ".Number of pages is " + this.numOfPages + " .edition is " + this.edition);
	 * 
	 * }
	 */

}
