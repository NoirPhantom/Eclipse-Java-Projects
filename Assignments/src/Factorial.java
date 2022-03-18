import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)) {
			int i;
			int factorial = 1;
			System.out.println("Please enter number: ");
			int number = input.nextInt();

			for (i = 1; i <= number; i++) {
				factorial = factorial * i;
			}
			System.out.println("Factorial of " + number + " is " + factorial);
			input.close();
		}
	}
}
