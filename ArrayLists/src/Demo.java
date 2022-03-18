import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    static ArrayList<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String title;
        String author;
        long isbn;
        double price;
        boolean isBorrowed;

        while (true) {

            // input.nextLine();
            System.out.println("Enter Book title: or ( done to exit ): ");
            title = input.nextLine();

            if (title.equalsIgnoreCase("done")) {
                break;
            }

            System.out.println("Author's Name: ");
            author = input.nextLine();

            System.out.println("Book's isbn: ");
            isbn = input.nextLong();
            input.nextLine();

            System.out.println("Book's Rental Price: ");
            price = input.nextDouble();

            System.out.println("Is the book borrowed [true/false]: ");
            input.nextLine();
            isBorrowed = input.nextBoolean();

            books.add((Book) new Book(title, author, isbn, price, isBorrowed));

            input.nextLine();

        }

        for (Book book : books) {

            System.out.println("-------");
            System.out.println("The books you entered are: " + book);

        }

        input.close();
    }
}
