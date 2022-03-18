import java.util.Scanner;

// Jonathan Ocampo 
// 03/11/22
// Creating the Shop class to implement and call the product attributes and all other subclasses to create an array with all the informaton needed
public class Shop {

    static double totalAmount = 0;
    // Creating Product array to store all values for all attributes given acces
    // from the product class
    static Product[] inventory = new Product[5];

    // Displays the shop menu when buying products
    static void displayMenu() {
        System.out.println(
                "\nEnter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
        for (int i = 0; i <= inventory.length - 1; i++) {
            System.out.println(i + " : " + inventory[i].getName());
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner for user input
        Scanner input = new Scanner(System.in);
        int userInput;

        // Creating array indexes that use the subclasses
        inventory[0] = new Apparel("Business Ritual Long Sleeve Top", 65.39, 4, 'L', "Blue");
        inventory[1] = new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth");
        inventory[2] = new Apparel("Men's Business Casual Shirt", 57.10, 2, 'M', "Teal");
        inventory[3] = new Bath("Organic Turmeric Soap", 11.25, 1);
        inventory[4] = new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman");

        do {
            // Displaying shop menu
            displayMenu();
            // Taking user input
            userInput = input.nextInt();
            // condition checking whether user input is between 0 to 4
            if (userInput >= 0 && userInput <= 4) {
                // Condtion checks if item has stock to succesfully purchase
                if (inventory[userInput].buy()) {
                    System.out.println("Your purchase was successful");
                    // Add the value of the item to the overall value of total amount
                    totalAmount += inventory[userInput].getPrice();
                } else {
                    // If no stock is available then print this out
                    System.out.println("Sorry! This product is out of stock.");
                }
            }
            // once again checks if userinput is between 0 to 4 and if any number outside
            // this range then close the do while loop
        } while (userInput >= 0 && userInput <= 4);
        // Once the do-while loop is done print out the total amount
        System.out.println("Thank you for shopping with us! The total amount is " + totalAmount);

        // Closing Scanner
        input.close();
    }
}
