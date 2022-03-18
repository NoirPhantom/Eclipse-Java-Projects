import java.util.ArrayList;

public class CustomBook {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("The Anatomy of Programming Languages", "Alice E. Fisher", 97801, 2.99, false));
        books.add(new Book("The Little Prince", "Antoine de Saint", 11634, 1.49, true));
        books.add(new Book("The Bench", "Meghan The Duchess of Sussex", 59343, 4.99, true));

        for (int i = 0; i <= books.size() - 1; i++) {
            System.out.println(books.get(i).getTitle() + " : " + books.get(i).getIsbn());
        }

    }
}
