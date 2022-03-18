
public class Library {
	String name;
	String location;
	String manager;
	// Assume library will have 10 books

	Book[] books = new Book[10];

	Library(String name, String location, String manager, Book[] books) {
		this.name = name;
		this.location = location;
		this.manager = manager;
		this.books = books;
	}

}
