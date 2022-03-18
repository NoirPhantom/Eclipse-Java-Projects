
public class Demo_Book {
	public static void main(String[] args) {

		Book[] userBook = new Book[5];

		userBook[0] = new Book("XYZ", 50, 40920303);
		userBook[1] = new Book("ABC", 2, 0);
		userBook[2] = new Book("WQE", 19, 453534, "Penguin Publishers", "Kevin C");
		userBook[3] = new Book("RET", 15, 595059585, "Walter Publishers", "Mark R");
		userBook[4] = new Book("POO", 28, 0, "DCI UST", "Derrick", 4);

		for (int i = 0; i <= userBook.length - 1; i++) {
			System.out.println(userBook[i]);
		}
	}
}
