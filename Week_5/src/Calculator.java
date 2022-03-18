import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter first number: ");
            int num1 = input.nextInt();

            System.out.println("Enter second number: ");
            int num2 = input.nextInt();

            System.out.println("The division of the 2 numbers is " + num1 / num2);
        }

        catch (ArithmeticException e) {
            System.out.println("You can't divide by 0 " + e.getMessage());
        }

        catch (InputMismatchException e) {
            System.out.println("Input not valid " + e.getMessage());
        }

        catch (RuntimeException e) {
            System.out.println("All runtime exceptions " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("All general exceptions " + e.getMessage());
        }

        finally {
            System.out.println("This is executed irrespective of whether an exception occured or not.");
            input.close();
        }

    }
}
