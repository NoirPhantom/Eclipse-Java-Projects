import java.util.Scanner;

//Jonathan Ocampo
//03/04/22
//Creating the demo class as our main method and calling upon the circle class to run everything and implement and return to the main
public class Demo {

    // Printing out what this program will do
    static String describeApplication() {
        return "This program will ask for a radius and will calculate \nthe circumference or the area of a circle with that radius \nbased on your selection.";
    }

    public static void main(String[] args) {

        // Creating a new scanner
        Scanner input = new Scanner(System.in);

        // Attributes to for user input
        char answer;
        char option;
        int radius;

        System.out.println(describeApplication());
        do {
            // Asking for user input
            System.out.println("Enter radius: ");
            radius = input.nextInt();

            // Creating a new object of circle named myCircle to store the radius.
            Circle myCircle = new Circle(radius);

            // Asking for the choice of what you want to calculate
            System.out.println("What would you like to calculate? " + "Press a for area, c for circumference: ");
            option = input.next().toLowerCase().charAt(0);

            // Checking if my user input char is a at which point if true it sends the
            // radius back to the method get area and returns the final value
            if (option == 'a') {
                System.out.println(myCircle.getArea());
            }

            // Checking if my user input char is c at which point if true it sends the
            // radius back to the method get circumference and returns the final value
            else if (option == 'c') {
                System.out.println(myCircle.getCircumference());
            }

            // When all other options are not true then it prints out not a valid choice
            else {
                System.out.println("Not a valid option");
            }

            // Asking whether or not you want to continue with a char user input or either y
            // or n to continue or terminate program.
            System.out.println("Do you want to continue? [y/n]: ");
            answer = input.next().toLowerCase().charAt(0);

        } while (answer != 'n');
        // Close scanner input
        input.close();
    }
}
